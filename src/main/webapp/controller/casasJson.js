var casasModulo = angular.module('casasModulo', []);

casasModulo.controller ("casasController", function($scope, $http) {
	$http.get ('controller/casasJson.json').then(function(response){
		$scope.casas = response.data.casas;
	})
});