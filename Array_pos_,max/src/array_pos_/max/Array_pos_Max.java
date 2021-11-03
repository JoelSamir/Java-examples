/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_pos_.max;

/**
 *
 * @author EHT7557A
 */
public class Array_pos_Max {
    public static int pos_max(int [] A){
        int m=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]>A[m]) {
                m=i;
            }            
        }
        return m;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector=new int[3];       
        
        System.out.println("Posición del valor mas alto: "+pos_max(vector));
        System.out.println("Longitud del arreglo: "+vector.length);
        
        // TODO code application logic here
    }
    
}
