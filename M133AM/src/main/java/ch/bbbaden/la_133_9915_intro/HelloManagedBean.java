/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.la_133_9915_intro;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


/**
 *
 * @author A
 */
@Named(value = "helloManagedBean")
@SessionScoped
public class HelloManagedBean implements Serializable {

    /**
     * Creates a new instance of HelloManagedBean
     */
    public HelloManagedBean() {
    }
    
    private String eingabe;

    public String getEingabe() {
        return eingabe;
    }

    public void setEingabe(String eingabe) {
        this.eingabe = eingabe;
    }
    
    private String eingabe2;

    public String getEingabe2() {
        return eingabe2;
    }

    public void setEingabe2(String eingabe) {
        this.eingabe2 = eingabe;
    }
   
    public String getSessionId() {
    FacesContext fCtx = FacesContext.getCurrentInstance();
    HttpSession session = (HttpSession) fCtx.getExternalContext().getSession(false);
    return session.getId();
       

}   
}
