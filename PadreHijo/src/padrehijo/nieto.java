/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrehijo;

/**
 *
 * @author EHT7557A
 */
public class nieto extends hijo1 {
    boolean bebe;
    
    public nieto(String nombre,int edad,double estatura,String apellido,boolean bebe){
        super(nombre,edad,estatura,apellido);
        this.bebe=bebe;
    }
    @Override
    public int sumar(int numero1,int numero2){
        return numero1+numero2*2;
    }
}
