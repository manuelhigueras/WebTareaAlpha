/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modal;

/**
 *
 * @author Manuel
 */
public class Cuaderno {
    private Tarea t;

    public Cuaderno(Tarea t) {
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