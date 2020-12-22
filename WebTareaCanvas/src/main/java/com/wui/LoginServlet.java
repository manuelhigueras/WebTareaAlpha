/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wui;

import com.domain.exceptions.LoginException;
import com.servicio.loginServer;
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
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                //LEER PARAMETROS
        String paramEmail = req.getParameter("email");
        String paramPwd = req.getParameter("pwd");
        
        //VALIDAR
        String msgErrorEmail = null;
        String msgErrorPwd = null;
        String msgErrorLogin = null;
        
        
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
        if(valido){
            try {
                //SI TODO OK
                HttpSession sesion = req.getSession();
                loginServer servicio = new loginServer();
                servicio.login(paramEmail, paramPwd, sesion);
            } catch (LoginException ex) {
                msgErrorLogin = ex.getMessage();
                valido = false;
            }
        }
        
        //si error ir a  login.jsp y mostrar mensajes de error        
        //si ok  index.jsp
        String jspAMostrar = "";
        if (valido) {
            jspAMostrar = "index.jsp";
        } else {
            jspAMostrar = "login.jsp";
            req.setAttribute("msgErrorEmail", msgErrorEmail);
            req.setAttribute("msgErrorPwd", msgErrorPwd);
            req.setAttribute("msgErrorLogin", msgErrorLogin);
        }
        
        RequestDispatcher rd = req.getRequestDispatcher(jspAMostrar);
        rd.forward(req, resp);
    }

}
