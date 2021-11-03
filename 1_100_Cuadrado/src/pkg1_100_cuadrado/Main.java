/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_100_cuadrado;

/**
 *
 * @author EHT7557A
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO code application logic here
        
        System.out.println("Con For ----------------------");
        
        for (int i = 1; i <= 33; i++) {
            System.out.println("Numero " + i +" y su cuadrado "+i*i);
        }
        
        System.out.println("Con while ----------------------");
        
        int i=34;
        while (i<=66) {
            System.out.println("Numero " + i +" y su cuadrado "+i*i);
            i++;
        }
        
        System.out.println("Con Do While----------------------");
       
        do {            
            System.out.println("Numero " + i +" y su cuadrado "+i*i);
            i++;
        } while (i<=100);
        
    }
    
}
