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
public class Tienda {
        
    public ArrayList<String> met_filtrar_productos(ArrayList<String> lista){
        String valor;
        ArrayList<String> productos=new ArrayList();
        
        for (int i = 0; i < lista.size(); i++) {
            if (!productos.contains(lista.get(i))) {
                productos.add(lista.get(i));
            }
        }
    return productos;
    }
    
    public ArrayList<Integer> met_productos_faltantes(ArrayList<Integer> posiciones, ArrayList<String> faltantes,String elemento){  
        ArrayList<Integer> salida=new ArrayList();
        
        for (int i = 0; i < posiciones.size(); i++) {
            if (faltantes.get(posiciones.get(i)).equals(elemento)) {
                salida.add(posiciones.get(i));
            }
        }
    return salida;           
    }
    
    public ArrayList<String> met_encontrar_faltantes(ArrayList<String> l_pedido,ArrayList<String> l_mis_productos){
        ArrayList<String> salida=new ArrayList();
        
        for (int i = 0; i < l_pedido.size(); i++) {
            if (!l_mis_productos.contains(l_pedido.get(i))) {
                salida.add(l_pedido.get(i));
            }
        }
    return salida;
    }
    
    public Integer met_obtener_intercambiables(ArrayList<String> l_sobrantes_otros,ArrayList<String> l_sobrantes_mios){
        ArrayList<String> productos_lista_1=new ArrayList();
        ArrayList<String> productos_lista_2=new ArrayList();
        
        productos_lista_1=met_encontrar_faltantes(l_sobrantes_otros,l_sobrantes_mios);
        productos_lista_2=met_encontrar_faltantes(l_sobrantes_mios,l_sobrantes_otros);
        
        if (productos_lista_1.size()<productos_lista_2.size()) {
            return productos_lista_1.size();
        }else{
            return productos_lista_2.size();
        }        
    }
}
