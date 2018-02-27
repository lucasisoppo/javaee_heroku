var casasModulo = angular.module('casasModulo', []);

casasModulo.controller("casasController", function ($scope, $http) {
    urlPessoas = 'https://sistemaimo.herokuapp.com/rest/pessoas';
    urlCasas = 'https://sistemaimo.herokuapp.com/rest/casas';

    $scope.listarCasas = function () {
        $http.get(urlCasas).success(function (casas) {
            $scope.casas = casas;
        }).error(function (erro) {
            alert(erro);
        });
    }

    $scope.listarPessoas = function () {
        $http.get(urlPessoas).success(function (pessoas) {
            $scope.pessoas = pessoas;
        }).error(function (erro) {
            alert(erro);
        });
    }

    $scope.selecionaCasas = function (casaSelecionada) {
        $scope.casa = casaSelecionada;
    }
    $scope.limparCampos = function () {
        $scope.casa = "";
    }

    $scope.salvar = function () {
        if ($scope.casa.codigo == undefined) {
            console.log('Caiu no POST');
            $http.post(urlCasas, $scope.casa).success(function (casa) {
                $scope.casas.push($scope.casa);
                $scope.listarCasas();
                $scope.limparCampos();
            }).error(function (erro) {
                alert(erro);
            });

        } else {
            console.log('Caiu no PUT');
            $http.put(urlCasas, $scope.casa).success(function (casa) {
                $scope.listarCasas();
                $scope.limparCampos();
            }).error(function (erro) {
                alert(erro);
            });
        }

    }

    $scope.excluir = function () {
        if ($scope.casa.codigo == undefined) {
            console.log('Sem casa selecionada')
        } else {
            $http.delete(urlCasas+'/'+$scope.casa.codigo).success(function(){
                $scope.listarCasas();
                $scope.limparCampos();
            }).error(function (erro) {
                alert(erro);
            });
        }
    }

    //executa
    $scope.listarCasas();
    $scope.listarPessoas();

});