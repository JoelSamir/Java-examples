/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares_impares;

/**
 *
 * @author EHT7557A
 */
public class Pares_impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rango=100;
        
        for (int i = 1; i < rango; i+=2) {
            System.out.println("Impar: "+ i);
        }
        
        int j=2;        
        while (j<=rango) {
            System.out.println("Par: "+j);
            j+=2;
        }
        
    }
    
}
