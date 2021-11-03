/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar_sql;
import java.sql.*;

public class Conectar_SQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String dbURL = "jdbc:mysql://localhost:3306/peliculas";
        String username = "root";
        String password = "1234"; //conectar 
        try {
            Connection conn = DriverManager.getConnection( dbURL ,username ,password);
            if (conn != null){
                System.out.println("Conectado");
            }
            
            String sql = "INSERT INTO peli(pel_id,pel_titulo,pel_tema,pel_annio_estreno,dir_id) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, 333);
            statement.setString(2, "pelicula 11 desde java");
            statement.setString(3, "sobre el java1");
            statement.setInt(4, 2021);
            statement.setInt(5, 1);            
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0){
                System.out.println("Inserción exitosa!"); 
            }            
        }
        catch (SQLException ex){
            ex.printStackTrace();
        } 
    }    
}
