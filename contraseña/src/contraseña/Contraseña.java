/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;
import java.util.Scanner;

/**
 *
 * @author EHT7557A
 */
public class Contraseña {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int longitud=7;
        Psw contraseña=new Psw(longitud);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("contraseña creada:"+contraseña.contraseña);              
        System.out.println("Es fuerte? "+contraseña.esFuerte());
        System.out.println(contraseña.toString());
        System.out.println("");
        
        System.out.print("Digite una contraseña para cambiar la creada: ");
        contraseña.cambiarContraseña(sc.nextLine());
        System.out.println("La contraseña creada es: "+contraseña.contraseña);
        System.out.println("La contraseñan creada Es fuerte? "+contraseña.esFuerte());
        System.out.println(contraseña.toString());
    }
}
