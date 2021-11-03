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
 * @author jhmae
 */
public class Conectar {
    public static Connection conec(){
        try {
            String url = "jdbc:mysql://localhost:3306/tienda";
            String usuario = "root";
            String pass = "admin";
            
            Connection conn = DriverManager.getConnection(url, usuario, pass);
            if(conn != null){
               return conn; 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
