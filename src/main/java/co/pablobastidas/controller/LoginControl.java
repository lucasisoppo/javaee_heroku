/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.pablobastidas.controller;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

/**
 *
 * @author pablobastidasv
 */
@Model
public class LoginControl {
    
    @Inject
    private LoginModel loginModel;
    
    public void login(){
        FacesMessage msg;
        
        if( "camacho".equals(loginModel.getUser()) 
                && "camacho".equals(loginModel.getPassword()) ){
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Login correcto", "Login correcto");
        } else{
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login Errado", "Login Errado");
        }
        
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
