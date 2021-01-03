/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wui;

import com.servicio.bd;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Manuel
 */
public class BajaTareaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String estado = req.getParameter("estado");
        String msgEstado = null;
        int id_new = 0;
        int estadoNum = -1;
        Boolean valido = true;
        String mensaje = null;
        if(id == null || id.trim().length() == 0)
            mensaje = "Debe inidicar el id del cuaderno a eliminar.";
        else{
            try{
                id_new = Integer.parseInt(id);
            }
            catch(NumberFormatException e){
                mensaje = "Debe indicar el id del cuaderno";
            }
        }
        
        if (estado == null || estado.trim().length() == 0) {
            valido = false;
        }
        else{
            valido = false;
            try{
                estadoNum = Integer.parseInt(estado);            
            }catch(NumberFormatException e){
                msgEstado = "ERROR";
            }  
        }        
        
        if(mensaje == null){
            if(estadoNum == 1)
                bd.deleteToDo(id_new);
            else
                if(estadoNum == 2)
                    bd.deleteInProgress(id_new);
                else
                    if(estadoNum == 3)
                        bd.deleteDone(id_new);
        }
       
        req.setAttribute("mensaje", mensaje);
        RequestDispatcher rd = req.getRequestDispatcher("viewTareaAll.jsp");
        rd.forward(req, resp);        
    }
    
}
