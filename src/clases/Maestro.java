/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BAC
 */
public class Maestro {
    protected String NomMaestro;
    protected int numRRHH;

    public Maestro(String NomMaestro, int numRRHH) {
        this.NomMaestro = NomMaestro;
        this.numRRHH = numRRHH;
    }

    public String getNomMaestro() {
        return NomMaestro;
    }

    public void setNomMaestro(String NomMaestro) {
        this.NomMaestro = NomMaestro;
    }

    public int getNumRRHH() {
        return numRRHH;
    }

    public void setNumRRHH(int numRRHH) {
        this.numRRHH = numRRHH;
    }
    
}
