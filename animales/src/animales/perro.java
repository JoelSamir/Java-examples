/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

/**
 *
 * @author EHT7557A
 */
public class perro {
    //atributos
    public int edad;
    public String nombre;
    public String colorOjos;
    
    //constructor
    perro (int edad,String nombre,String colorOjos){
        this.edad=edad;
        this.nombre=nombre;
        this.colorOjos=colorOjos;
    }
    
    //metodos
    public void ladrar (){
        System.out.println("Guau Guau");
    }
    
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ nombre);
    }
    
    public void quieEsMayor(perro otroPerro){
        if (this.edad>otroPerro.edad) {
            System.out.println("soy mayor que "+otroPerro.nombre);
        }else if (this.edad==otroPerro.edad){
            System.out.println("Tenemos la misma edad");
        }else{
            System.out.println(otroPerro.nombre+" es mayor que yo");
        }
    }
}
