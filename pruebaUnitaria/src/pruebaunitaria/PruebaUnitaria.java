/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaunitaria;

/**
 *
 * @author EHT7557A
 */
public class PruebaUnitaria {
    public double suma(double num1,double num2){
        return num1+num2;
    }
    
    public double resta(double num1,double num2){
        return num1-num2;
    }
    
    public double multiplicacion(double num1,double num2){
        return num1*num2;
    }
    
    public double division(double num1,double num2){
//        double resultado=(num2!=0)? num1/num2: Double.NaN;
//        return resultado;
        if (num2!=0){
            return num1/num2;
        }else{
            return Double.NaN;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
