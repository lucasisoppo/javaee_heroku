package com.model.dao;

import com.model.model.PessoasModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PessoaDaoImplem implements PessoaDaoInterface {

    @PersistenceContext(unitName = "persistenceSistema")
    private EntityManager entityManager;

    @Override
    public PessoasModel salvarPessoa(PessoasModel pessoaModel) {
        entityManager.persist(pessoaModel);
        return pessoaModel;
    }

    @Override
    public void alterar(PessoasModel pessoaModel) {
        PessoasModel pessoasModelMerge = entityManager.merge(pessoaModel);
        entityManager.persist(pessoasModelMerge);
    }

    @Override
    public void excluir(PessoasModel pessoaModel) {
        PessoasModel pessoasModelMerge = entityManager.merge(pessoaModel);
        entityManager.remove(pessoasModelMerge);

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<PessoasModel> getPessoas() {
        Query query = entityManager.createQuery("from PessoasModel ");
        return query.getResultList();
    }
}
