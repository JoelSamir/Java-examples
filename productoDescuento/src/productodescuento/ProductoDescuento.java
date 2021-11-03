/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productodescuento;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class ProductoDescuento {
    public static double valorPagar(int cantidad,double precio){
        double valor;
        if (cantidad <5){
            valor =cantidad*precio;
        }else if (5<cantidad && cantidad<=10){
            valor =cantidad*precio*0.95;
        }else if (10<cantidad && cantidad<=20){
            valor =cantidad*precio*0.9;
        }else{
            valor =cantidad*precio*0.8;
        }
        return valor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int cantidad;
        double precio;
        System.out.println("Ingrese cantidad de productos: ");
        cantidad=sc.nextInt();
        System.out.println("Ingrese precio de producto: ");
        precio=sc.nextDouble();
        System.out.println("Total a Pagar: " + valorPagar(cantidad,precio));
    }    
}
