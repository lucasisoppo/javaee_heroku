package com.model.dao;

import com.model.model.CasasModel;

import java.util.List;

public interface CasaDaoInterface {

    CasasModel salvarCasa(CasasModel casaModel);

    void alterar(CasasModel casaModel);

    void excluir(CasasModel casaModel);

    List<CasasModel> getCasas();

}
