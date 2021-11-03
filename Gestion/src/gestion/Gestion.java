/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author EHT7557A
 */
public class Gestion {
    //inicialización de variables
     public static void Inicializacion(){
         ArrayList<Persona> pers=new ArrayList();
         ProcesarComando(pers); 
     }
     
     //adiciona la persona ingresada al arraylist
     public static void AgregarPersona(Persona entrada,ArrayList pers){
         pers.add(entrada);
     }
    
     //genera la impresión de salida con todos las persnas ingresadas
     public static void ListarPersona(ArrayList pers){
         System.out.println("***Inventario de Personas***");
         for (int i = 0; i < pers.size(); i++) {
            System.out.println(pers.get(i));
         }
     }
     
     //Lee los datos desde consola y decide si acumula datos, imprime o sale
     public static void ProcesarComando(ArrayList pers){
         
         Scanner sc=new Scanner(System.in);                  
         Persona pp;
         String[] informacion;
         boolean permanecer=false;
         
         do {
             String entrada=sc.nextLine();
             if (entrada.length()>1){
                 informacion=entrada.split("&");
                 if (informacion[1].equals("Socio")) {
                     pp=new Socio(informacion[2],informacion[3],informacion[4],informacion[5],informacion[6]);
                     AgregarPersona(pp,pers);
                 } else if(informacion[1].equals("Proveedor")) {
                     pp=new Proveedor(informacion[2],informacion[3],informacion[4],informacion[5],informacion[6]);
                     AgregarPersona(pp,pers);
                 }
                 permanecer=true;
             }else if(entrada.equals("2")){
                 ListarPersona(pers);
                 permanecer=true;
             }else if (entrada.equals("3")){
                 permanecer=false;
             }else{
                 permanecer=true;
             }
            } while (permanecer);
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Inicializacion();          
    }    
    
}
