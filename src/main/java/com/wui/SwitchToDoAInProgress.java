/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wui;

import com.domain.exceptions.DBException;
import com.modal.Cuaderno;
import com.modal.Tarea;
import com.servicio.bd;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel
 */
public class SwitchToDoAInProgress extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String id = req.getParameter("id");
       String caso = req.getParameter("case");
       int id_new = 0;
       int idUser = -1;
       int cas = Integer.parseInt(caso);
       String mensaje = null;
       String desc, est;
       desc = null;
       est = null;
       Object descripcion = null;
       Object estado = null;
       Set<Entry<Integer,Cuaderno>> lista = null;
       Boolean valido = false;
       Cuaderno c = null;
       
       if(cas == 1){
        lista = bd.listaApuntadorGeneralToDo();
       }
       else{
        lista = bd.listaApuntadorGeneralDone();
       }
       if (id == null) {
           mensaje = "Debe indicar un id numérico";
           valido = false;
       } else {
           try {
                id_new = Integer.parseInt(id);
            } catch (NumberFormatException e) {
                valido = false;
            }
        }   
        
        for(Entry valor: lista){
            c = (Cuaderno) valor.getValue();
            if(c.getTarea().getIdTarea() == id_new){
                descripcion = c.getTarea().getDescripcion();
                estado = c.getTarea().getEstado();
                break;
            }
        }
        
        desc = String.valueOf(descripcion);
        est = String.valueOf(estado);
        
        try {
            bd.switchTareaInProgress(cas, id_new, new Cuaderno(idUser, new Tarea(id_new, desc, est, idUser)));
        } catch (DBException ex) {
            Logger.getLogger(SwitchToDoAInProgress.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        req.setAttribute("mensaje", mensaje);
        resp.sendRedirect("viewTareaAll.jsp");
       
    }
    
    
    
}
