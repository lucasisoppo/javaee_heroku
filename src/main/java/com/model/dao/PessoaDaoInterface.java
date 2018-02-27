package com.model.dao;

import com.model.model.PessoasModel;

import java.util.List;

public interface PessoaDaoInterface {
    PessoasModel salvarPessoa(PessoasModel pessoaModel);

    void alterar(PessoasModel pessoaModel);

    void excluir(PessoasModel pessoaModel);

    List<PessoasModel> getPessoas();

}
