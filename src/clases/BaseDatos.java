package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class BaseDatos {
    //Variables para conectarme 
    private String baseDatos; // Path/Nombre de la BD
    private Connection conexion;
    public Statement query;
    
    //Constructor para settear una base de datos, ahi iria el path
    public BaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
    
    //Funcion para conectarse a la base de datos
    public void conectar() throws SQLException {
        String driver = "jdbc:ucanaccess://"; //este es el driver con el que se puede acceder a access
        //la conexion se establece con el driver y se especifica que base de datos se va a conectar
        conexion = DriverManager.getConnection(driver + baseDatos, "", "");
        //Esto seria el set para crear un query para poder añadir, editar y eliminar me imagino
        query = conexion.createStatement();
    }
    
    //Funcion para desconectarse de la base de datos
    public void desconectar() throws SQLException {
        query.close(); // se cierran los queries
        conexion.close(); // se cierra la conexion a la BD
    } 
    
    //Funcion par añadir los cambios a la BD
    public void commit() throws SQLException {
        conexion.commit();
    }

    public String getBaseDatos() {
        return baseDatos;
    }
    
    
}
