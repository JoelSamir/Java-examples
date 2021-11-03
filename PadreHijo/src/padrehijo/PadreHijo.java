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
public class PadreHijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hijo1 hijo=new hijo1("Lucas",12,1.45,"Hernandez");
        nieto nieto1=new nieto("Julian",4,50.9,"Gomez",true);
        System.out.println(hijo.sumar(2,3));
        System.out.println(nieto1.sumar(2,3));
    }    
}
