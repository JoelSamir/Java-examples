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
public class hijo1 extends persona {
    public String apellido;
    
    public hijo1(String nombre,int edad,double estatura,String apellido){
        super(nombre,edad,estatura);
        this.apellido=apellido;
    }
    @Override
    public int sumar(int numero1,int numero2){
        return numero1+numero2;
    }
    
    public int restar(int numero1,int numero2){
        return numero1-numero2;
    }
}
