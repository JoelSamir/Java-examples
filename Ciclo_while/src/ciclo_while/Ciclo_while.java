/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo_while;

/**
 *
 * @author EHT7557A
 */
public class Ciclo_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=2;
        int j=25;
        while (i<j){
            System.out.println(i+", "+j);
            i*=2;
            j+=10;
        }
        System.out.println("valores finales "+i+", "+j);
    }    
}
