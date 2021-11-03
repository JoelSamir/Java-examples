/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;
import java.util.*;
/**
 *
 * @author EHT7557A
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> lista_string=new ArrayList<>(Arrays.asList("arroz", "sal", "miel", "lentejas", "frijol", "leche", "lentejas", "arroz", "miel", "sal", "banano","arroz"));
        ArrayList<String> lista_string2=new ArrayList<>(Arrays.asList("arroz", "sal", "miel", "lentejas", "banano","frijol"));
        ArrayList<String> lista_string3=new ArrayList<>(Arrays.asList("sal", "miel", "ajo", "frijol","leche"));
        ArrayList<String> lista_string4=new ArrayList<>(Arrays.asList("arroz", "sal", "miel", "lentejas", "banano","frijol","papa","cebolla","aceite"));
        ArrayList<String> lista_string5=new ArrayList<>(Arrays.asList("sal", "miel", "ajo", "frijol","leche","garbanzo","lechuga","papa"));
        ArrayList<Integer> lista_Int=new ArrayList<>(Arrays.asList(0,3,4,2,1,5,6,8,11));
        Tienda objeto=new Tienda();
        ArrayList<String> salida;
        ArrayList<Integer> salida2;
        ArrayList<String> salida3;
        Integer salida4;
        
        salida=objeto.met_filtrar_productos(lista_string);                
        for (int i = 0; i < salida.size(); i++) {
            System.out.println(salida.get(i));
        }
        
        salida2=objeto.met_productos_faltantes(lista_Int, lista_string,"arroz");
        for (int i = 0; i < salida2.size(); i++) {
            System.out.println(salida2.get(i));
        } 
        
        salida3=objeto.met_encontrar_faltantes(lista_string2,lista_string3);
        for (int i = 0; i < salida3.size(); i++) {
            System.out.println(salida3.get(i));
        } 
        
        salida4=objeto.met_obtener_intercambiables(lista_string4, lista_string5);
        System.out.println(salida4);
        
        
    }
}
    
