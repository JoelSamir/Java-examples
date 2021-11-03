/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_char_simetrica;

/**
 *
 * @author EHT7557A
 */
public class Matriz_char_simetrica {
    public static boolean matriz_simetrica(char[][] x){
        boolean bandera = true;
        for (int i = 0; i < x.length; i++) {
            for (int j = i+1; j < x.length; j++) {
                bandera &= (x[i][j]==x[j][i]);                
            }            
        }
        return bandera;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] matriz_char = {{'2','3','a'},
                                {'3','e','r'},
                                {'a','r','g'}};
        
        int [][] matriz_entera = {{1,2,3,5},{3,6,8,9}};
        int [][] matriz_2 = new int[2][3];
        
        System.out.println(matriz_simetrica(matriz_char));
    }
    
}
