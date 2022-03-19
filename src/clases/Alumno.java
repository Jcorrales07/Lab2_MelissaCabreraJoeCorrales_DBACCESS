package clases;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Alumno {
    protected int nCuenta;
    protected String NombreAlum;
    protected String usuario;
    protected String contra;
    protected String carrera;

    public Alumno(int nCuenta, String NombreAlum, String usuario, String contra, String carrera) {
        this.nCuenta = nCuenta;
        this.NombreAlum = NombreAlum;
        this.usuario = usuario;
        this.contra = contra;
        this.carrera = carrera;
    }

    public String getNombreAlum() {
        return NombreAlum;
    }

    public void setNombreAlum(String NombreAlum) {
        this.NombreAlum = NombreAlum;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

//    public int getnCuenta() {
//        return nCuenta;
//    }
//
//    public void setnCuenta(int nCuenta) {
//        this.nCuenta = nCuenta;
//    }

    @Override
    public String toString() {
        return "Alumno{" + "NombreAlum=" + NombreAlum + ", usuario=" + usuario + ", contra=" + contra + ", carrera=" + carrera + '}';
    }
}
