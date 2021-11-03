/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares_descendente;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Pares_descendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int value;
        
        System.out.print("Digite numero menor 2: ");
        value=sc.nextInt();
        
        while (value>=2) {
            if (value%2==0) {
                System.out.println("Numero: "+value);
            }
            value--;
        }
    }
    
}
