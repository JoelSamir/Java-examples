/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Factorial {
    public static int hallar_factoria(int n){
        int resultado=n;
        for (int i = n-1; i > 0; i--) {
            resultado*=i;
        }
        return resultado;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int value;
        System.out.print("Ingrese numero entero diferente de cero: ");
        value=sc.nextInt();
        System.out.println("El Factorial de " + value + " es " + hallar_factoria(value));
    }    
}
