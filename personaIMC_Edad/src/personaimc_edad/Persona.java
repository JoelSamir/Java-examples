/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaimc_edad;

/**
 *
 * @author EHT7557A
 */
public class Persona {
    public String nombre;
    public int edad;
    public char genero;
    public double peso,altura;
    
    public Persona(String nombre, int edad, char genero, double peso,double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
        this.peso=peso;
        this.altura=altura;
    }
    
    public double calcularIMC (){
        return peso/(altura*altura);
    }
    
    public boolean esMayorEdad (){
        if (edad>=18){
            return true;
        }else
            return false;
    }
    
    public String toString(){
        return nombre + " tiene " + edad + " años" + " de genero " + genero;
    }
    
}
