package Modelo;

import java.sql.*;
public class Conexion{
    public static final String URL = "jdbc:mysql://localhost:3306/dbprueba";
    public static final String USER = "root";
    public static final String CLAVE = "";
    public Connection conectar(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jabc.Driver");
            conn = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return conn;
    }
}