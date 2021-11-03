/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercbolean;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Ejercbolean {
    public static boolean condicional (boolean p, boolean q){
        //return (p==true&&q==false)? false:true;
        return (p&&!q)? false:true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        boolean p;
        boolean q;
        System.out.println("Ingrese valor p: ");
        p=sc.nextBoolean();
        System.out.println("Ingrese valor q: ");
        q=sc.nextBoolean();
        System.out.println("El condicionale es: " + condicional(p,q));
    }    
}
