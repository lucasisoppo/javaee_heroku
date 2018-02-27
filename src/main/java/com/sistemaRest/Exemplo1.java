package com.sistemaRest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/exemploRS")
public class Exemplo1 {
    @GET
    public String mostraGet(){
        return "exemplo retornando GET por Rest";
    }

    @POST
    public String mostraPost(){
        return "exemplo retornando POST por Rest";
    }

   // @DELETE   NAO FUNCIONOU
   // public String mostraDelete(){
   //     return "exemplo retornando DELETE por Rest";
   // }
}