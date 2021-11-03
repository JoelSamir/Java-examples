/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaimc_edad;

/**
 *
 * @author EHT7557A
 */
public class PersonaIMC_Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers=new Persona("Andres", 19, 'M', 66.5,1.8);
        System.out.println(pers.toString());
        System.out.println(pers.calcularIMC());
    }
    
}
