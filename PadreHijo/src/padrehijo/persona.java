/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrehijo;

/**
 *
 * @author EHT7557A
 */
public abstract class persona {
    public String nombre;
    public int edad;
    public double estatura;
    
    public persona(String nombre,int edad,double estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.estatura=estatura;
    }
    
    public void hablar(String palabras){
        System.out.println(palabras);
    }
    
    public void dormir(){
        System.out.println("zzz");
    }
    
    public abstract int sumar(int numero1,int nemero2);
}
