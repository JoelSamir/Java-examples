/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author EHT7557A
 */
public class Conectar {
    
    public static Connection conn(){
        try {
            String dbURL = "jdbc:mysql://localhost:3306/pruebaMVC";
            String username = "root";
            String password = "1234"; //conectar         
            Connection conn = DriverManager.getConnection( dbURL ,username ,password);
            if (conn != null){
                System.out.println("conectado");
                return conn;
            }           
        }
        catch (SQLException ex){
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE,null,ex);
        }
        return null;
    }

    static Object conn(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
