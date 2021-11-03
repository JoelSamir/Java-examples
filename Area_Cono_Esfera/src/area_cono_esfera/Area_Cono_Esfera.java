/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area_cono_esfera;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Area_Cono_Esfera {
    public static double volumen_esfera(double radio_esfera){
        return (4*Math.PI*radio_esfera*radio_esfera*radio_esfera)/3;        
    }
    
    public static double volumen_cono(double radio_cono,double altura_cono){
        return (Math.PI*radio_cono*radio_cono*altura_cono)/3;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radio_esfera,radio_cono,altura_cono,volumen_total;
        
        System.out.println("Digite Radio Esfera: ");
        radio_esfera=sc.nextDouble();
        System.out.println("Digite Radio Cono: ");
        radio_cono=sc.nextDouble();
        System.out.println("Digite Altura Cono: ");
        altura_cono=sc.nextDouble();
        
        System.out.println("Volumen Esfera: "+volumen_esfera(radio_esfera));
        System.out.println("Volumen de Cono: "+volumen_cono(radio_cono,altura_cono));
        
        volumen_total=volumen_esfera(radio_esfera)+volumen_cono(radio_cono,altura_cono);
        System.out.println("Volumen Total: "+volumen_total);
        // TODO code application logic here
    }    
}
