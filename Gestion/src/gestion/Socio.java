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
public class Socio extends Persona {
    public String antiguedad;
    
    public Socio(String nombre, String identificacion, String telefono, String direccion,String antiguedad){
        super(nombre,identificacion,telefono,direccion);
        this.antiguedad=antiguedad;
    }
    
    @Override
    public String toString(){
        return ("\tPersona Socio - Nombre: "+nombre+"\n"+
                "\tIdentificación: "+identificacion+"\n"+
                "\tTeléfono: "+telefono+"\n"+
                "\tDirección: "+direccion+"\n"+
                "\tAntigüedad: "+antiguedad+" años");
    }
}
