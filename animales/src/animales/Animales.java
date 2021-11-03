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
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        perro miPerro=new perro(5,"Toby","Azul");
        perro miPerro1=new perro(7,"All","negro");
        perro miPerro2=new perro(9,"Col","blanco");
        perro miPerro3=new perro(10,"Tell","verde");
        
        System.out.println(miPerro.nombre);
        System.out.println(miPerro.colorOjos);
        System.out.println(miPerro.edad);
        
        System.out.println(miPerro1.nombre);
        System.out.println(miPerro1.colorOjos);
        System.out.println(miPerro1.edad);
        
        System.out.println(miPerro2.nombre);
        System.out.println(miPerro2.colorOjos);
        System.out.println(miPerro2.edad);
        
        System.out.println(miPerro3.nombre);
        System.out.println(miPerro3.colorOjos);
        System.out.println(miPerro3.edad);
        
        miPerro.saludar();
        miPerro.ladrar();
        
        miPerro1.saludar();
        miPerro1.ladrar();
        
        miPerro2.saludar();
        miPerro2.ladrar();
        
        miPerro3.saludar();
        miPerro3.ladrar();
        
        System.out.println("");
        miPerro1.quieEsMayor(miPerro2);
    }    
}
