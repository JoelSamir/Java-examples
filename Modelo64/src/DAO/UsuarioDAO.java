/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author jhmae
 */
public class UsuarioDAO {
    
    public static String crearUsuario(Usuario usuario){
        String sql = "insert into usuario(usu_identificacion, usu_nombre, usu_apellido, usu_fecha_nacimiento) values (?,?,?,?)";
        try {
            PreparedStatement ps = Conectar.conec().prepareStatement(sql);
            ps.setInt(1, usuario.getIdentificacion());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setDate(4, usuario.getFechaNacimiento());
            
            int control = ps.executeUpdate();
            if(control > 0){
               return "Inserción exitosa";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Usuario no insertado en la DB";
    }
    
    
    public static Usuario consultarUsuario(int identificacion){
        String sql = "select * from usuario where usu_identificacion = ? ";
        try {
            PreparedStatement ps = Conectar.conec().prepareStatement(sql);
            ps.setInt(1, identificacion);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                System.out.println(resultado);
                Usuario usuario = new Usuario(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getDate(4));
                return usuario;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static String actualizarUsuario(Usuario usuario){
        String sql = "update usuario set usu_nombre = ?, usu_apellido = ?, usu_fecha_nacimiento = ? where usu_identificacion = ? ";
        try {
            PreparedStatement ps = Conectar.conec().prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setDate(3, usuario.getFechaNacimiento());
            ps.setInt(4, usuario.getIdentificacion());
            
            int control = ps.executeUpdate();
            if(control > 0){
                return "Registro actualizado correctamente";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Registro no pudo ser actualizado";
    }
    
    public static String eliminarUsuario(int identificacion){
        String sql = "delete from usuario where usu_identificacion = ?";
        try {
            PreparedStatement ps = Conectar.conec().prepareStatement(sql);
            ps.setInt(1,identificacion);
            
            int control = ps.executeUpdate();
            if(control > 0){
                return "Usuario eliminado correctamente";
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Usuario no pudo ser eliminado";
    }
}
