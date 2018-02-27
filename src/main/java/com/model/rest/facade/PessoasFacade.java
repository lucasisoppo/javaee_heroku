package com.model.rest.facade;

import com.model.model.PessoasModel;
import com.model.service.PessoaServiceInterface;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/pessoas")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

public class PessoasFacade {

    //Direto sem o uso de Servico

    /*@Inject
    private PessoaDaoImplem pessoaDaoImplem;

    @GET
    public List<PessoasModel> getPessoas(){
        return pessoaDaoImplem.getPessoas();
    }*/


    @Inject
    private PessoaServiceInterface pessoaServiceInterface;

    @GET
    public List<PessoasModel> getPessoa(){
        return pessoaServiceInterface.getPessoas();
    }

    @POST
    public PessoasModel salvar(PessoasModel pessoasModel){
        return pessoaServiceInterface.salvarPessoa(pessoasModel);
    }

    @PUT
    public void atualizar(PessoasModel pessoasModel){
        pessoaServiceInterface.alterar(pessoasModel);
    }

    @DELETE
    @Path("/{codigoPessoa}")
    public void excluir(@PathParam("codigoPessoa") Integer codigoPessoa){
        PessoasModel pessoasModel = new PessoasModel();
        pessoasModel.setCodigo(codigoPessoa);
        pessoaServiceInterface.excluir(pessoasModel);
    }
}
