package com.modal;

public class Tarea {
    
    private int idTarea;
    private String descripcion;
    private String estado;
    private int idUser;

    public Tarea(int idTarea, String descripcion, String estado, int idUser) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idUser = idUser;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" + "idTarea=" + idTarea + ", descripcion=" + descripcion + ", estado=" + estado + '}';
    }

}
