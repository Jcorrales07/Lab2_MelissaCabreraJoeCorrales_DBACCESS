
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
    protected String NombreAlum;
    protected int numCuenta;
    protected String carrera;

    public Alumno(String NombreAlum, int numCuenta, String carrera) {
        this.NombreAlum = NombreAlum;
        this.numCuenta = numCuenta;
        this.carrera = carrera;
    }

    public String getNombreAlum() {
        return NombreAlum;
    }

    public void setNombreAlum(String NombreAlum) {
        this.NombreAlum = NombreAlum;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "NombreAlum=" + NombreAlum + ", numCuenta=" + numCuenta + ", carrera=" + carrera + '}';
    }
    
    
}
