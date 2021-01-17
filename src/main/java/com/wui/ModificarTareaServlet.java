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
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel
 */
public class ModificarTareaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cuaderno cuaderno = null;
        String id, descripcion, estadoSt;
        String msgDescripcion, msgEstado, msgErrorApp;
        int estadoNum = -1;
        int idUser = -1;
        Boolean valido = true;
        id = req.getParameter("id");
        descripcion = req.getParameter("des");
        estadoSt = req.getParameter("est");
        msgErrorApp = null;
        msgDescripcion = null;
        msgEstado = null;
        
        if (descripcion == null || descripcion.trim().length() == 0) {
            msgDescripcion = "Escribe una descripcion valida";
            msgErrorApp = "Error en App";
            valido = false;
        }
        
        if (estadoSt == null || estadoSt.trim().length() == 0) {
            msgEstado = "Selecciona un estado valido";
            msgErrorApp = "Error en App";
            valido = false;
        }
        else{
            valido = false;
            try{
                estadoNum = Integer.parseInt(estadoSt);            
            }catch(NumberFormatException e){
                msgEstado = "ERROR";
            }  
        }
       
        try {   
            if (valido) {
                if(estadoNum == 1){
                    idUser = bd.getContUser();
                    cuaderno = new Cuaderno(idUser, new Tarea(Integer.parseInt(id), descripcion, "To Do", idUser));
                    bd.modifyTareaToDo(Integer.parseInt(id), cuaderno);
                }
                else{
                    if(estadoNum == 2){
                        idUser = bd.getContUser();
                        cuaderno = new Cuaderno(idUser, new Tarea(Integer.parseInt(id), descripcion, "In Progress", idUser));
                        bd.modifyTareaInProgress(Integer.parseInt(id), cuaderno);
                    }
                    else{
                        if(estadoNum == 3){
                            idUser = bd.getContUser();
                            cuaderno = new Cuaderno(idUser, new Tarea(Integer.parseInt(id), descripcion, "Done", idUser));
                            bd.modifyTareaDone(Integer.parseInt(id), cuaderno);
                        }
                    }
                }
            }
        } catch (DBException e) {
            msgErrorApp = e.getMessage();
            valido = false;               
        } 
     
        String jspAMostrar = "";
        if (valido) {
            jspAMostrar = "viewTareaAll.jsp";
        } else {
            jspAMostrar = "viewTareaCreada.jsp";
            req.setAttribute("msgErrorApp", msgErrorApp);
            req.setAttribute("msgDescripcion", msgDescripcion);
            req.setAttribute("msgEstado", msgEstado);
        }
//        RequestDispatcher rd = req.getRequestDispatcher(jspAMostrar);
//        rd.forward(req, resp);                
        
        resp.sendRedirect(jspAMostrar);
        
    }

}
