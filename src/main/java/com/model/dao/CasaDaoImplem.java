package com.model.dao;

import com.model.model.CasasModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class CasaDaoImplem implements CasaDaoInterface {

    @PersistenceContext(unitName = "persistenceSistema")
    private EntityManager entityManager;

    @Override
    public CasasModel salvarCasa(CasasModel casaModel) {
        entityManager.persist(casaModel);
        return casaModel;
    }

    @Override
    public void alterar(CasasModel casaModel) {
        CasasModel casasModelMerge = entityManager.merge(casaModel);
        entityManager.persist(casasModelMerge);
    }

    @Override
    public void excluir(CasasModel casaModel) {
        CasasModel casasModelMerge = entityManager.merge(casaModel);
        entityManager.remove(casasModelMerge);

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<CasasModel> getCasas() {
        Query query = entityManager.createQuery("from CasasModel ");
        return query.getResultList();
    }
}
