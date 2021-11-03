/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poblacion_a_b_crecimiento;

/**
 *
 * @author EHT7557A
 */
public class Poblacion_A_B_crecimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //En 2022 el pa´ıs A tendr´a una poblaci´on de 25 millones de habitantes y el pa´ıs B de 18.9 millones. Las tasas de crecimiento anual de la poblaci´on ser´an de 2% y 3% respectivamente. Desarrollar un algoritmo para informar en qu´e an˜o la poblaci´on del pa´ıs B superar´a a la de A
        double A=25, B=18.9, c_A=1.02, c_B=1.03;
        int años=0;
        
        while (A>B) {
            años++;
            A*=c_A;
            B*=c_B;            
        }
        
        System.out.println("Población A: "+A+" Millones");
        System.out.println("Población B: "+B+" Millones");
        System.out.println("Años trascurridos: "+años);
        
        System.out.println("Con for______");
        
        A=25;
        B=18.9;
        int i=1;
        for (i = 1; i < 1000; i++) {
            A*=c_A;
            B*=c_B;
            if(A<B)break;
        }
        System.out.println("Población A: "+A+" Millones");
        System.out.println("Población B: "+B+" Millones");
        System.out.println("Años trascurridos: "+i);        
    }    
}
