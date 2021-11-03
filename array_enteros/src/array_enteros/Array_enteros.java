/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_enteros;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Array_enteros {
    public static int[] lee_arreglo_entero(Scanner sc,int n){
        int[] x=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Componente "+i+"-ésima");
            x[i]=sc.nextInt();
        }
        return x;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=3;
        int[] x=new int[n];
        x=lee_arreglo_entero(sc,n);
        
        for (int i : x) {
            System.out.println(i+",");
        }
        System.out.println(x[n]);
    }    
}
