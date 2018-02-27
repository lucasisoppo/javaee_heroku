package com.model.service;

import com.model.dao.CasaDaoInterface;
import com.model.model.CasasModel;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class CasaServiceImplem implements CasaServiceInterface{


    @Inject
    private CasaDaoInterface casaDaoInterface;

    @Override
    public List<CasasModel> getCasas() {
        return casaDaoInterface.getCasas();
    }

    @Override
    @Transactional
    public CasasModel salvarCasa(CasasModel casaModel) {
        return casaDaoInterface.salvarCasa(casaModel);
    }

    @Override
    @Transactional
    public void alterar(CasasModel casaModel) {
        casaDaoInterface.alterar(casaModel);
    }

    @Override
    @Transactional
    public void excluir(CasasModel casaModel) {
        casaDaoInterface.excluir(casaModel);
    }


}
