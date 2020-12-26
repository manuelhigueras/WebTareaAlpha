/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wui;

import com.domain.exceptions.DBException;
import com.modal.Usuario;
import com.servicio.db;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class AltaUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //1. LEER PARAMETROS email, pwd, nombre, apellidos
        String paramEmail = req.getParameter("email");
        String paramPwd = req.getParameter("pwd");
        String paramNombre = req.getParameter("nombre");
        String paramApell = req.getParameter("apellido");

        //2.  VALIDAR PARAMETROS
        String msgErrorEmail = null;
        String msgErrorPwd = null;
        String msgErrorNombre = null;
        String msgErrorApellido = null;
        String msgErrorAlta = null;

        boolean valido = true;

        // 2.1. VALIDAR EMAIL
        if (paramEmail == null || paramEmail.trim().length() == 0) {
            msgErrorEmail = "Debe indicar el email del usuario";
            valido = false;
        }

        // 2.2. VALIDAR PWD        
        if (paramPwd == null || paramPwd.trim().length() == 0) {
            msgErrorPwd = "Debe indicar una clave";
            valido = false;
        }

        // 2.2. VALIDAR NOMBRE
        if (paramNombre == null || paramNombre.trim().length() == 0) {
            msgErrorNombre = "Debe indicar nombre ";
            valido = false;
        }
         // 2.3. VALIDAR APELLIDOS
        if (paramApell == null || paramApell.trim().length() == 0) {
            msgErrorApellido = "Debe indicar los apellidos ";
            valido = false;
        }

        //3.  SI NO HAY ALGUN ERROR intentar grabar
        if (valido) {
            Usuario usuario = new Usuario(paramEmail, paramPwd, paramNombre, paramApell);
            try {
                db.addUsuario(usuario);
                // add usuario ATRIBUTO DE SESION
                //El usuario no manda jSessionId , crea una nueva sesion
                //sino devuelve la sesión existente para es id
                HttpSession session = req.getSession();
                session.setAttribute("usuario", usuario);
            } catch (DBException e) {
                msgErrorAlta = e.getMessage();
                valido = false;               
            }
        }//fin datos validos

        // DESPACHAR LA RESPUESTA 
        //4. SI HAY ALGUN ERROR ir a form-alta-usuario.jsp
        //   SINO ir a lista-usuarios.jsp
        String jspAMostrar = "";
        if (valido) {
            jspAMostrar = "authRegistro.jsp";
        } else {
            jspAMostrar = "auth.jsp";
            req.setAttribute("msgErrorEmail", msgErrorEmail);
            req.setAttribute("msgErrorPwd", msgErrorPwd);
            req.setAttribute("msgErrorNombre", msgErrorNombre);
            req.setAttribute("msgErrorApellido", msgErrorApellido);
            req.setAttribute("msgErrorAlta", msgErrorAlta);
        }
        
        RequestDispatcher rd = req.getRequestDispatcher(jspAMostrar);
        rd.forward(req, resp);

    }
    
}
