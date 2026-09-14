/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_matrices;

/**
 *
 * @author EZC
 */
public class EVA1_9_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = new int[5][3];
        System.out.println("matriz = " + matriz);
        System.out.println("matriz.length = " + matriz.length);
        System.out.println("matriz[0] = " + matriz[0]);
        System.out.println("matriz[0].length = " + matriz[0].length);
        System.out.println("matriz[1] = " + matriz[1]);
        System.out.println("matriz[1].length = " + matriz[1].length);
        //-------------
        for (int i = 0; i < matriz.length; i++) { //PRIMER DIMENSIÓN
            for (int j = 0; j < matriz[i].length; j++) { //SEGUNDA DIMENSIÓN
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        
        for (int i = 0; i < matriz.length; i++) { //PRIMER DIMENSIÓN
            for (int j = 0; j < matriz[i].length; j++) { //SEGUNDA DIMENSIÓN
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        
    }      
}