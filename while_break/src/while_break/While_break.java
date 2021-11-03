/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_break;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class While_break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int suma=0;
        while (true){
            System.out.print("Ingrese numero entero ");
            System.out.println("a sumar o 0 para salir: ");
            int dato=Integer.parseInt(sc.nextLine());
            if (dato==0)break;
            suma +=dato;
        }
        System.out.println("La suma es: "+suma);
        
        //uso del DoWhile
        int dato;
        suma=0;
        do {            
            System.out.print("Ingrese numero entero ");
            System.out.println("a sumar o 0 para salir: ");
            dato=Integer.parseInt(sc.nextLine());            
            suma +=dato;
        } while (dato != 0);
        System.out.println("La suma es: "+suma);
    }
    
}
