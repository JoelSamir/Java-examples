/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author EHT7557A
 */
public class Persona {
    public String nombre;
    public String identificacion;
    public String telefono;
    public String direccion;
    
    Persona(String nombre, String identificacion, String telefono, String direccion){
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.telefono=telefono;
        this.direccion= direccion;               
    }
    
    public String toString(){
        return ("\tPersona Socio - Nombre: "+nombre+"\n"+
                "\tIdentificación: "+identificacion+"\n"+
                "\tTeléfono: "+telefono+"\n"+
                "\tDirección: "+direccion+"\n");
    }    
}
