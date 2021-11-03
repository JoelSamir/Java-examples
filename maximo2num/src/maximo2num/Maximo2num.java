/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maximo2num;
/**
 *
 * @author EHT7557A
 */
public class Maximo2num {
    public static double max(double a, double b){
        double valor;
        valor=(a>b)? a:b;
        return valor;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 10;
        double b = -123;
        System.out.println("El mayor es: " + max(a,b));
    }
    
}
