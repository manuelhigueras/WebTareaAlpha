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
public class AltaTareaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String descripcion, estadoNum;
        int estadoTrat;
        String msgDescripcion, msgEstado;
        Boolean valido;
        Cuaderno cuaderno;
        int id;
        Set<Entry<Integer, Cuaderno>> lista = null;
        descripcion = req.getParameter("desc");
        estadoNum = req.getParameter("est");
        id = -1;
        Entry apuntador = null;
        estadoTrat = -1;
        msgDescripcion = null;
        msgEstado = null;
        cuaderno = null;
        valido = true;
        
        
        if (descripcion == null || descripcion.trim().length() == 0) {
            msgDescripcion = "Escribe una descripcion valida";
            valido = false;
        }
        
        if (estadoNum == null || estadoNum.trim().length() == 0) {
            msgEstado = "Selecciona un estado valido";
            valido = false;
        }
        else{
            valido = false;
            try{
                estadoTrat = Integer.parseInt(estadoNum);            
            }catch(NumberFormatException e){
                msgEstado = "ERROR";
            }  
        }
        
        if(estadoTrat == 1){        
            try {
                id = bd.getContToDo();
                cuaderno = new Cuaderno(new Tarea(id, descripcion, "To Do", bd.getIdUser()));
                bd.addTareaListaToDo(cuaderno);
            } catch (DBException ex) {
                Logger.getLogger(AltaTareaServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(estadoTrat == 2){        
            try {
                id = bd.getContToDo();
                cuaderno = new Cuaderno(new Tarea(id, descripcion, "In Progress", bd.getIdUser()));
                bd.addTareaListaInProgress(cuaderno);
            } catch (DBException ex) {
                Logger.getLogger(AltaTareaServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if(estadoTrat == 3){        
            try {
                id = bd.getContDone();
                cuaderno = new Cuaderno(new Tarea(id, descripcion, "Done", bd.getIdUser()));
                bd.addTareaListaDone(cuaderno);
            } catch (DBException ex) {
                Logger.getLogger(AltaTareaServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
               
        String jspAMostrar = "";
        if (valido) {
            jspAMostrar = "viewTareaCreada.jsp";
        } else {
            jspAMostrar = "viewTareaAll.jsp";
            req.setAttribute("msgDescripcion", msgDescripcion);
            req.setAttribute("msgEstado", msgEstado);
        }

        resp.sendRedirect(jspAMostrar);
        //RequestDispatcher rd = req.getRequestDispatcher(jspAMostrar);
        //rd.forward(req, resp);
                        
    }
    
}
