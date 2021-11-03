/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra_tienda_vueltas;
import java.util.Scanner;
/**
 *
 * @author EHT7557A
 */
public class Compra_tienda_vueltas {
    static public int debo_sobra(int panes,int leche,int huevos,int dinero){
        int p_panes=300,p_leche=3300,p_huevos=350;
        return dinero - (p_panes*panes + p_leche*leche + p_huevos*huevos);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panes, leche, huevos, dinero,total;
        String me_falta_sobra;
        System.out.println("Número de panes: ");
        panes=sc.nextInt();
        System.out.println("Número de leche: ");
        leche=sc.nextInt();
        System.out.println("Número de huevos: ");
        huevos=sc.nextInt();
        System.out.println("dinero: ");
        dinero=sc.nextInt();
        total=debo_sobra(panes,leche,huevos,dinero);
        
        me_falta_sobra=(total>0)? "Me sobra":"Me falta";
        
        System.out.println(me_falta_sobra+" " + total);
        
        // TODO code application logic here
    }
    
}
