/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_matriz;

/**
 *
 * @author EHT7557A
 */
public class Array_matriz {
    public static int[][] cuadrados_matriz(int [][] x){
        int[][] y = new int[x.length][x[0].length];
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                y[i][j]=x[i][j]*x[i][j];
            }
        }
        return y;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] x=new int[][]{{1,2,3},{2,5,6}};
        int[][] y=new int[][]{};      
        
        y=cuadrados_matriz(x);
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                System.out.print("Posisición "+i+","+j+" matriz X: "+x[i][j]);
                System.out.println("-------Posisición "+i+","+j+" matriz Y: "+y[i][j]);
            }
        }       
    }
    
}
