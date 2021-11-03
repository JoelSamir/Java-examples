/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.List;
import DTO.Persona;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author EHT7557A
 */
public class DAOPersona {
    
    public static List<Persona> TodasPersona(){
        
        List<Persona> lista = new ArrayList<>();
        String sql = "select * from persona";        
        
        try {
            PreparedStatement statement = Conectar.conn().prepareStatement(sql);                       
            ResultSet resultado = statement.executeQuery(); 
            
            while(resultado.next()){
                Persona persona = new Persona(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getDate(4));
                lista.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static List<Persona> ConsultaPersona(int identificacion){
        
        List<Persona> lista = new ArrayList<>();
        String sql = "select * from persona where per_identificacion = ?";        
        
        try {
            PreparedStatement statement = Conectar.conn().prepareStatement(sql);
            
            statement.setInt(1,identificacion);            
            ResultSet resultado = statement.executeQuery(); 
            
            while(resultado.next()){
                Persona persona = new Persona(identificacion, resultado.getString(2), resultado.getString(3), resultado.getDate(4));
                lista.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public static String CrearPersona(int identificacion,String nombre,String apellido,Date fecha_nacimiento){
        
        String sql = "insert into persona (per_identificacion,per_nombre,per_apellido,per_fecha_nacimiento) values (?,?,?,?)";        
        
        try {
            PreparedStatement statement = Conectar.conn().prepareStatement(sql);
            
            statement.setInt(1,identificacion);
            statement.setString(2,nombre);
            statement.setString(3,apellido);
            statement.setDate(4,fecha_nacimiento);
            
            int control = statement.executeUpdate(); 
            if (control>0) {
                return "Datos ingresados correctamente";
            }else{
                return "NO se insertaron los datos";
            }            
        } catch (SQLException ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Favor Digite datos a ingresar, al menos número de identificación";
    }
    
    public static String ModificarPersona(int identificacion,String nombre,String apellido,Date fecha_nacimiento){
        
        String sql = "update persona set per_nombre=?,per_apellido=?,per_fecha_nacimiento=? where per_identificacion=?";        
        
        try {
            PreparedStatement statement = Conectar.conn().prepareStatement(sql);
            
            statement.setString(1,nombre);
            statement.setString(2,apellido);
            statement.setDate(3,fecha_nacimiento);
            statement.setInt(4,identificacion);
            
            int control = statement.executeUpdate(); 
            if (control>0) {
                return "Datos actualizados correctamente";
            }else{
                return "NO se actualizó el registro";
            }            
        } catch (SQLException ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Validar registros y/o ID de la persona";
    }
    
    public static String EliminarPersona(int identificacion){
        
        String sql = "delete FROM persona where per_identificacion=?";        
        
        try {
            PreparedStatement statement = Conectar.conn().prepareStatement(sql);
            
            statement.setInt(1,identificacion);            
            
            int control = statement.executeUpdate(); 
            if (control>0) {
                return "Registro de persona ID" +identificacion+" eliminado correctamente";
            }else{
                return "NO se eliminó el registro ó no existe en la BD";
            }            
        } catch (SQLException ex) {
            Logger.getLogger(DAOPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Validar registros y/o ID de la persona";
    }
       
}
