/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.domain.exceptions.DBException;
import com.modal.Cuaderno;
import com.modal.Tarea;
import com.modal.Usuario;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author user
 */
public class bd {
    
    private static Set<Usuario> usuarios;
    private static Map<Integer, Cuaderno> listaToDo;
    private static Integer contToDo = 1;
    private static Map<Integer, Cuaderno> listaInProgress;
    private static Integer contInProgress = 1;
    private static Map<Integer, Cuaderno> listaDone;
    private static Integer contDone = 1;    
       
    static{
        usuarios = new HashSet<Usuario>();
        listaToDo = new HashMap<Integer, Cuaderno>();
        listaInProgress = new HashMap<Integer, Cuaderno>();
        listaDone = new HashMap<Integer, Cuaderno>();
        
        usuarios.add(new Usuario("manuel@gmail.com", "1234", "Manuel", "Xitzag"));
        usuarios.add(new Usuario("mariaterez@gmail.com", "1234", "Maria", "Terez"));
        
        addTareaListaToDo(new Cuaderno(new Tarea(getContToDo(), "diseñar el modal", "To Do")));
        addTareaListaToDo(new Cuaderno(new Tarea(getContToDo(), "diseñar el servicio", "To Do")));  
        addTareaListaToDo(new Cuaderno(new Tarea(getContToDo(), "diseñar el wui", "To Do")));        
        addTareaListaToDo(new Cuaderno(new Tarea(getContToDo(), "diseñar el exception", "To Do")));
        
        addTareaListaInProgress(new Cuaderno(new Tarea(getContInProgress(), "Survival", "In Progress")));
        addTareaListaInProgress(new Cuaderno(new Tarea(getContInProgress(), "Agregar el mostrar y add", "In Progress")));  
        addTareaListaInProgress(new Cuaderno(new Tarea(getContInProgress(), "Agregar modificar y eliminar", "In Progress")));        
        addTareaListaInProgress(new Cuaderno(new Tarea(getContInProgress(), "Chequear el jsp", "In Progress")));

        addTareaListaDone(new Cuaderno(new Tarea(getContDone(), "Formato html", "Done")));
        addTareaListaDone(new Cuaderno(new Tarea(getContDone(), "Servicio html", "Done")));  
        addTareaListaDone(new Cuaderno(new Tarea(getContDone(), "Modal", "Done")));        
        addTareaListaDone(new Cuaderno(new Tarea(getContDone(), "Exception", "Done")));        
    
    }
    
    private bd(){}

/////////////////////////////////////////////////////////////////////////
    
    public static synchronized void addTareaListaToDo(Cuaderno c){
        listaToDo.put(getContToDo(), c);
        setContToDo();
    }

    public static synchronized void addTareaListaDone(Cuaderno c){
        listaDone.put(getContDone(), c);
        setContDone();
    }
    
    public static synchronized void addTareaListaInProgress(Cuaderno c){
        listaInProgress.put(getContInProgress(), c);
        setContInProgress();
    }

    public static Set listaApuntadorGeneral(){
        Set<Entry<Integer,Cuaderno>> listaAux = listaToDo.entrySet();
        return listaAux;
    }
    
    public static synchronized void switchTareaInProgress(int id, Cuaderno c){
        listaToDo.remove(id);
        setContToDoRest();
        c.getTarea().setIdTarea(getContInProgress());
        c.getTarea().setEstado("In Progress");
        addTareaListaInProgress(c);
    }

    public static synchronized void switchTareaDone(int id, Cuaderno c){
        listaToDo.remove(id);
        setContToDoRest();
        c.getTarea().setIdTarea(getContDone());
        c.getTarea().setEstado("Done");
        addTareaListaInProgress(c);
    }    
    
    
/*TESTED*/    
    public static void main(String[] args) {
        Set<Entry<Integer,Cuaderno>> listaAux = listaToDo.entrySet();
        Object a,b,ca;
        a = null;
        b = null;
        ca = null;
        Cuaderno t = null;
        String a2 = null;
        for(Entry c: listaAux){
            t = (Cuaderno) c.getValue();
            a = t.getTarea().getEstado();
            System.out.println(c.getKey() + "/// " + a);
        }
    }
    
    
//////////////////////////////////////////////////////////////////////////////
    
    public static Map<Integer, Cuaderno> getListaToDoMap() {
        return listaToDo;
    }   
    
    public static synchronized Collection<Cuaderno> getListaToDo() {
        return listaToDo.values();
    }   
    
    public static synchronized Collection<Cuaderno> getListaInProgress() {
        return listaInProgress.values();
    }   
    
    public static synchronized Collection<Cuaderno> getListaDone() {
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