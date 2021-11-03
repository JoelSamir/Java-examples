/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valor.absoluto;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class ValorAbsoluto {
    public static double valorabsoluto (double x){
        double valor;
        if (x>=0){
            valor=x;            
        }else{
            valor=-x;
        }
        return valor;        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada = new Scanner(System.in);
        double n;
        System.out.println("Ingrese un Número: ");
        n=Entrada.nextDouble();
        System.out.println("El Valor absoluto de: "+ n + " es " + valorabsoluto(n));
    }
    
}
