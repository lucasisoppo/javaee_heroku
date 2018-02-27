package com.model.service;

import com.model.model.CasasModel;

import java.util.List;

public interface CasaServiceInterface {


    CasasModel salvarCasa(CasasModel casaModel);

    List<CasasModel> getCasas();

    void alterar(CasasModel casaModel);

    void excluir(CasasModel casaModel);



}
