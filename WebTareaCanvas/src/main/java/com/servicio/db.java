/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.domain.exceptions.DBException;
import com.modal.Tarea;
import com.modal.Usuario;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class db {
    
    private static Set<Usuario> usuarios;
    private static Map<Integer, Tarea> listaToDo;
    private static Integer contToDo = 1;
    private static Map<Integer, Tarea> listaInProgress;
    private static Integer contInProgress = 1;
    private static Map<Integer, Tarea> listaDone;
    private static Integer contDone = 1;    
       
    static{
        usuarios = new HashSet<Usuario>();
        listaToDo = new HashMap<Integer, Tarea>();
        listaInProgress = new HashMap<Integer, Tarea>();
        listaDone = new HashMap<Integer, Tarea>();
        
        usuarios.add(new Usuario("manuel@gmail.com", "1234", "Manuel", "Xitzag"));
        usuarios.add(new Usuario("mariaterez@gmail.com", "1234", "Maria", "Terez"));
        
        addTareaListaToDo(new Tarea(getContToDo(), "diseñar el modal", "To Do"));
        addTareaListaToDo(new Tarea(getContToDo(), "diseñar el servicio", "To Do"));  
        addTareaListaToDo(new Tarea(getContToDo(), "diseñar el wui", "To Do"));        
        addTareaListaToDo(new Tarea(getContToDo(), "diseñar el exception", "To Do"));
        
        addTareaListaInProgress(new Tarea(getContInProgress(), "Survival", "In Progress"));
        addTareaListaInProgress(new Tarea(getContInProgress(), "Agregar el mostrar y add", "In Progress"));  
        addTareaListaInProgress(new Tarea(getContInProgress(), "Agregar modificar y eliminar", "In Progress"));        
        addTareaListaInProgress(new Tarea(getContInProgress(), "Chequear el jsp", "In Progress"));

        addTareaListaDone(new Tarea(getContDone(), "Formato html", "Done"));
        addTareaListaDone(new Tarea(getContDone(), "Servicio html", "Done"));  
        addTareaListaDone(new Tarea(getContDone(), "Modal", "Done"));        
        addTareaListaDone(new Tarea(getContDone(), "Exception", "Done"));        
    
    }
    
    private db(){}

/////////////////////////////////////////////////////////////////////////
    
    public static synchronized void addTareaListaToDo(Tarea t){
        listaToDo.put(getContToDo(), t);
        setContToDo();
    }

    public static synchronized void addTareaListaDone(Tarea t){
        listaDone.put(getContDone(), t);
        setContDone();
    }
    
    public static synchronized void addTareaListaInProgress(Tarea t){
        listaInProgress.put(getContInProgress(), t);
        setContInProgress();
    }

//    public static synchronized void switchTareaInProgress(Tarea t){
//        listaToDo.remove(t.getIdTarea(), t);
//        setContToDoRest();
//        addTareaListaInProgress(t);
//    }
    
//////////////////////////////////////////////////////////////////////////////
    
    public static synchronized Collection<Tarea> getListaToDo() {
        return listaToDo.values();
    }   
    
    public static synchronized Collection<Tarea> getListaInProgress() {
        return listaInProgress.values();
    }   
    
    public static synchronized Collection<Tarea> getListaDone() {
        return listaDone.values();
    }   
    
    public static void setContToDo(){
        contToDo++;
    }
    
    public static void setContToDoRest(){
        contToDo--;
    }    

    public static Integer getContToDo() {
        return contToDo;
    }

    public static Integer getContInProgress() {
        return contInProgress;
    }

    public static void setContInProgress() {
        contInProgress++;
    }

    public static Integer getContDone() {
        return contDone;
    }

    public static void setContDone() {
        contDone++;
    }
        
    public synchronized static Collection<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public synchronized static void addUsuario(Usuario u) throws DBException {
        boolean seAñade = usuarios.add(u);
        if (!seAñade) {
            throw new DBException("No ha sido añadido. Ya existe");
        }
    }
}
