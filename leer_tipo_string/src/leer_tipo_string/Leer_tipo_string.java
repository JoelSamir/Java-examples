/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leer_tipo_string;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Leer_tipo_string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        


////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        String a="hola";
        String b="hola";
        String c="HOLA";
        
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
        
        System.out.println(a==c);//no se recomienda usar este metodo de comparación, mejor usar equals
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////77        
        String miCadena=sc.nextLine();
        String miCadena2=sc.nextLine();

        System.out.println(miCadena.equals(miCadena2));      
        
        System.out.println(miCadena.charAt(1));
    }
    
}
