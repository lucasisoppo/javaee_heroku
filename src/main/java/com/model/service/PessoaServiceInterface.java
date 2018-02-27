package com.model.service;

import com.model.model.PessoasModel;

import java.util.List;

public interface PessoaServiceInterface {


    PessoasModel salvarPessoa(PessoasModel pessoaModel);

    void alterar(PessoasModel pessoaModel);

    void excluir(PessoasModel pessoaModel);

    List<PessoasModel> getPessoas();

}
