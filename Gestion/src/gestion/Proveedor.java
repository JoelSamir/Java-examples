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
public class Proveedor extends Persona{
    public String producto;
    
    public Proveedor(String nombre, String identificacion, String telefono, String direccion,String producto){
        super(nombre,identificacion,telefono,direccion);
        this.producto=producto;
    }
    
    @Override
    public String toString(){
        return ("\tPersona Proveedor - Nombre: "+nombre+"\n"+
                "\tIdentificación: "+identificacion+"\n"+
                "\tTeléfono: "+telefono+"\n"+
                "\tDirección: "+direccion+"\n"+
                "\tProducto: "+producto);
    }
}
