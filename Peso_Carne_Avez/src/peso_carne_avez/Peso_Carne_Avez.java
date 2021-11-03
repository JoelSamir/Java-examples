/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peso_carne_avez;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Peso_Carne_Avez {
    static public int kilos_aves(int gallinas,int gallos,int pollitos){
        int peso_gallinas=6,peso_gallos=7,peso_pollitos=1;
        return (gallinas*peso_gallinas + gallos*peso_gallos + pollitos*peso_pollitos);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gallinas,gallos,pollitos;
        
        System.out.print("Cantidad de gallinas: ");
        gallinas=sc.nextInt();
        System.out.print("Cantidad de gallos: ");
        gallos=sc.nextInt();
        System.out.print("Cantidad de pollitos: ");
        pollitos=sc.nextInt();
        
        System.out.println("Total de kilos de las avez: "+kilos_aves(gallinas,gallos,pollitos));
        // TODO code application logic here
    }
    
}
