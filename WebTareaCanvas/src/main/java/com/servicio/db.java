/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicio;

import com.modal.Usuario;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class db {
    
    private static Set<Usuario> usuarios;
    
    static{
        usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("manuel@gmail.com", "1234", "Manuel", "Xitzag"));
        usuarios.add(new Usuario("mariaterez@gmail.com", "1234", "Maria", "Terez"));
    }
    
    private db(){}
    
    public synchronized static Collection<Usuario> getUsuarios() {
        return usuarios;
    }
}
