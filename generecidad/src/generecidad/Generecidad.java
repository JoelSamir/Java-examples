/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generecidad;

/**
 *
 * @author EHT7557A
 */
public class Generecidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        caja<String> caja = new caja<String>("Pedro Pa´ramo"); 
        System.out.println( caja.decorar() ); 
        char c = caja.obtener().charAt(2); 
        System.out.println(c); 
        caja<Double> caja2 = new caja<Double>(20.34); 
        System.out.println( caja2.decorar() );
        double y = caja2.obtener() + 20.0;
        System.out.println(y);
}
