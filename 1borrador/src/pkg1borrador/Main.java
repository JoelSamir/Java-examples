/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1borrador;

/**
 *
 * @author EHT7557A
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto="Alejandro mide 1.34 con 34 años";
        String[] separado=texto.split(" ");
        String nombre=separado[0];
        double estatura=Double.parseDouble(separado[2]);
        int edad=Integer.parseInt(separado[4]);
        String edad_texto=Integer.toString(edad);
        String estatura_texto=String.valueOf(estatura);
        
        System.out.println("la información completa: "+nombre+" "+estatura+" "+edad);
        System.out.println("Información modificada: "+nombre+" "+estatura_texto+" "+edad_texto);
    }
    
}
