/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operador_ternario;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Operador_ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int c=sc.nextInt();
        a=(c>10) ? c:-c;
        b=(c<10) ? c:-c;
        System.out.println("valor a: "+a+" "+"valor b: "+b);
    }    
}
