/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;

/**
 *
 * @author EHT7557A
 */
public class Psw {
    int longitud=8;
    String contraseña;
    
    public Psw (int longitud){        
        this.longitud=longitud;
        this.contraseña=create_psw(longitud);        
    }
    
    public Psw (){        
        this.longitud=longitud;
        this.contraseña=create_psw(longitud);        
    }
    
    public int getlongitud(){
        return longitud;
    }
    
    public void setlongitud(int newlongitud){
        this.longitud=newlongitud;
    }
    
    private String create_psw(int largo){
        String psw_creado="";
        char[] password=new char[largo];
        int[] posicion=new int[largo];
        int aleatorio;
        
        for (int i = 0; i < largo; i++) {
            posicion[i]=-1;
        }
        
        for (int i = 0; i < largo; i++) {            
            do {                
                aleatorio=(int) (Math.random()*(largo));
                boolean contiene=false;                
                for (int j = 0; j < largo; j++) {
                    contiene=contiene||(posicion[j]==aleatorio);                    
                }
            posicion[i]=(contiene==false)?aleatorio:-1;            
            } while (posicion[i]==-1);     
            
            
            if (i==0) {
                //obtener 1 mayuscula
                password[aleatorio]=(char)((int) (Math.random()*26+65));
            } else if (i==1) {
                //obtener 1 minuscula
                password[aleatorio]=(char)((int) (Math.random()*26+97));
            }else if (i>1 && i<=7) {
                //obtener al menos 5 numeros            
                password[aleatorio]=(char)((int) (Math.random()*10+48));
            }else{
                //ultimos char aleatorios minuscula, mayuscula, numero
                switch ((int) (Math.random()*3+1)){
                    case 1:
                        //obtener 1 mayuscula
                        password[aleatorio]=(char)((int) (Math.random()*26+65));
                        break;
                    case 2:
                        //obtener 1 minuscula
                        password[aleatorio]=(char)((int) (Math.random()*26+97));
                        break;
                    case 3:
                        //obtener al menos 5 numeros
                        password[aleatorio]=(char)((int) (Math.random()*10+48));
                        break;
                }                
            }           
        }
        
        for (int k = 0; k < largo; k++) {
                psw_creado=psw_creado+password[k];
        }
        return psw_creado;
    }
    
    public boolean esFuerte(){
        int may=0,min=0,num=0;
        for (int i = 0; i < longitud; i++) {
            if ((int) contraseña.charAt(i)>=65&&(int) contraseña.charAt(i)<=90) {
                may=may+1;
            }else if ((int) contraseña.charAt(i)>=97&&(int) contraseña.charAt(i)<=122) {
                min=min+1;
            }else if ((int) contraseña.charAt(i)>=48&&(int) contraseña.charAt(i)<=57) {
                num=num+1;
            }
        }        
        if (may>=1&&min>=1&&num>5) {
            return true;
        }else{
            return false;
        }
    }
    
    public void cambiarContraseña(String nuevaContraseña){
        contraseña=nuevaContraseña;
        longitud=nuevaContraseña.length();
    }
    
    public String toString(){
        String fuerte=(esFuerte())?"es una contraseña fuerte":"no es una contraseña fuerte";
        return "La contraseña es "+contraseña+" con "+longitud+" caracteres y "+fuerte;
    }
}
