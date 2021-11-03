/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int estudiante,asistente,entrenador;
        
        System.out.println("Digite número de Asistentes: ");
        asistente=sc.nextInt();
        
        estudiante=(2*asistente)+4;
        entrenador=(estudiante+asistente)/5;
        
        System.out.println(asistente+" "+estudiante+" "+entrenador);
        
        if (entrenador<=20) {
            System.out.println("uno");
        } else if (entrenador>20 & entrenador<=30){
            System.out.println("dos");
        }else if (entrenador>30 & entrenador<=50){
            System.out.println("tres");
        }else {
            System.out.println("cuatro");
        }
    }
}
