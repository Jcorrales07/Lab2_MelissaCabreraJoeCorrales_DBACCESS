
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class ListaClases {
    private ArrayList<Clases> ListClases;
    
    private String nombreFichero = "datos.dat";

    public ListaClases() {
        ListClases = new ArrayList<Clases>();
    }
    
    
    
    public void salvarArrayList() throws IOException{
        File f = new File(nombreFichero);
        if(!f.exists()) f.createNewFile();
        
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
        
        for(Clases cla: ListClases){
            dos.writeUTF(cla.getNomClase());
            dos.writeInt(cla.idClase);
            dos.writeInt(cla.idMaestro);
            dos.writeInt(cla.idExamen1);
            dos.writeInt(cla.idExamen2);
        }
        dos.close();
    }
    public void leeFichero() throws FileNotFoundException, IOException{
        File f = new File (nombreFichero);
        
        if(!f.exists()) throw new FileNotFoundException ("Fichero no encontrado");
        
        DataInputStream dis = new DataInputStream(new FileInputStream(f));
        
        boolean salir= false;
        do{
            try{
                
            
            String NomClase = dis.readUTF();
            int idClase = dis.readInt();
            int idMaestro = dis.readInt();
            int idExamen1 = dis.readInt();
            int idExamen2 = dis.readInt();
            
            Clases cla = new Clases(NomClase, idClase, idMaestro, idExamen1, idExamen2);
            
            agregarClase(cla);
            } 
            catch (EOFException e){
                salir = true;
            }
            
        }while (!salir);
    }
    public void agregarClase(Clases cla){
        if (ListClases == null) ListClases = new ArrayList<Clases>();
        ListClases.add(cla);
    }
    
    private void muestraArrayPorPantalla(){
        for (int i=0; i<ListClases.size(); i++){
            System.out.println(ListClases.get(i));
        }
    }
    
    public static void main(String args[]){
        ListaClases miLista = new ListaClases();
        
        miLista.agregarClase(new Clases("Programacion II",492,34,1, 2));
        miLista.agregarClase(new Clases("Lab Programacion II",304,30,3, 4));
        miLista.muestraArrayPorPantalla();
        
        try {
            miLista.salvarArrayList();
            miLista.leeFichero();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
