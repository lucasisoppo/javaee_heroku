package com.model.rest.facade;

import com.model.model.CasasModel;
import com.model.service.CasaServiceInterface;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/casas")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})

public class CasasFacade {

    @Inject
    private CasaServiceInterface casaServiceInterface;

    @GET
    public List<CasasModel> getCasas() {
        return casaServiceInterface.getCasas();
    }

    @POST
    public CasasModel salvar(CasasModel casasModel) {
        return casaServiceInterface.salvarCasa(casasModel);
    }

    @PUT
    public void atualizar(CasasModel casasModel) {
        casaServiceInterface.alterar(casasModel);
    }

    @DELETE
    @Path("/{codigoCasa}")
    public void excluir(@PathParam("codigoCasa") Integer codigoCasa) {
        CasasModel casasModel = new CasasModel();
        casasModel.setCodigo(codigoCasa);
        casaServiceInterface.excluir(casasModel);
    }

}
