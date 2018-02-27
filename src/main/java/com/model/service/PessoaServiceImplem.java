package com.model.service;

import com.model.dao.PessoaDaoImplem;
import com.model.dao.PessoaDaoInterface;
import com.model.model.PessoasModel;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class PessoaServiceImplem implements PessoaServiceInterface{


    @Inject
    private PessoaDaoInterface pessoaDaoInterface;

    @Override
    public List<PessoasModel> getPessoas() {
        return pessoaDaoInterface.getPessoas();
    }

    @Override
    @Transactional
    public PessoasModel salvarPessoa(PessoasModel pessoaModel) {
        return pessoaDaoInterface.salvarPessoa(pessoaModel);
    }

    @Override
    @Transactional
    public void alterar(PessoasModel pessoaModel) {
        pessoaDaoInterface.alterar(pessoaModel);
    }

    @Override
    @Transactional
    public void excluir(PessoasModel pessoaModel) {
        pessoaDaoInterface.excluir(pessoaModel);
    }


}
