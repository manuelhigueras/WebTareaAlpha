/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modal;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author user
 */
@Named(value = "cuaderno")
@SessionScoped
public class CuadernoJSFManagedBean implements Serializable {

    /**
     * Creates a new instance of CuadernoJSFManagedBean
     */
    
    private Tarea t;
    
    public CuadernoJSFManagedBean(Tarea t) {
        this.t = t;
    }
    
    public Tarea getTarea() {
        return t;
    }

    public void setTarea(Tarea t) {
        this.t = t;
    }
    
    public String getTareaDescripcion(){
        return t.getDescripcion();
    }

}
