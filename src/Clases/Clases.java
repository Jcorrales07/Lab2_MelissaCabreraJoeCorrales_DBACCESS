/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Clases {
    protected String NomClase;
    protected int idClase; 
    protected int idMaestro;
    protected int idExamen1;
    protected int idExamen2;

    public Clases(String NomClase, int idClase, int idMaestro, int idExamen1, int idExamen2) {
        this.NomClase = NomClase;
        this.idClase = idClase;
        this.idMaestro = idMaestro;
        this.idExamen1 = idExamen1;
        this.idExamen2 = idExamen2;
    }

    public String getNomClase() {
        return NomClase;
    }

    public void setNomClase(String NomClase) {
        this.NomClase = NomClase;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public int getIdExamen1() {
        return idExamen1;
    }

    public void setIdExamen1(int idExamen1) {
        this.idExamen1 = idExamen1;
    }

    public int getIdExamen2() {
        return idExamen2;
    }

    public void setIdExamen2(int idExamen2) {
        this.idExamen2 = idExamen2;
    }

    @Override
    public String toString() {
        return "Clases{" + "NomClase=" + NomClase + ", idClase=" + idClase + ", idMaestro=" + idMaestro + ", idExamen1=" + idExamen1 + ", idExamen2=" + idExamen2 + '}';
    }
    
    
}
