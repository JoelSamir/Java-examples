/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_min_num_maquina;

/**
 *
 * @author EHT7557A
 */
public class While_min_num_maquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x0=1.0;
        double xi=x0/2;
        int i=0;
        while (xi>0){
            x0=xi;
            xi=x0/2;
            i++;
        }
        System.out.println("Minimo Maquina: "+x0);
        System.out.println("Numero de ciclos realizados en el While: "+i);
    }
    
}
