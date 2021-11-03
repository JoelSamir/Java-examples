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
public class caja <T>{
    protected T obj;
    public caja (T obj){
        this.obj=obj;
    }
    
    public T obtener (){
        return obj;
    }
    
    public String decorar (){
        String s=obj.toString();
        String linea="*";
        for (int i = 0; i < s.length(); i++) {
            linea +="*";
        }
        linea +="*";
        return linea + "\n*" + s + "*\n" + linea; 
    }
}
