/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poner_signo_mas_inicio;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Poner_signo_mas_inicio {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double valor;
        char signo;
        System.out.println("Digite un número: ");
        valor = sc.nextDouble();
        signo=(valor>0)?'+':' ';
        System.out.println("Resultado: "+signo+valor);
    }
    
}
