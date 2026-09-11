/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

/**
 *
 * @author EZC
 */
public class EVA1_7_ARREGLOS_SIZE {

    public static void main(String[] args) {

        int[] original = new int [10];
        for(int i = 0; i < original.length; i++){ //LLENAR CON DATOS ALEATORIOS
            original[i] = (int)(Math.random() * 100);
        }
        
        for(int i = 0; i < original.length; i++){ //IMPRIMIR
            System.out.print("[" + original[i] + "]");
        }
        
        System.out.println("");
        //CAMBIAR EL TAMAÑO (NO SE PUEDE)
        //RESPALDO
        int[] copia = original; // COPIO LA DIRECCION DEL ARREGLO ORIGINAL
        original = new int[5];
        System.out.println(original);
        //TRANSFERIR LA INFORMACION
        for (int i = 0; i < original.length; i++) {
            original[i] = copia[i];
        }
        for (int i = 0; i < original.length; i++) {//IMPRIMIR
            System.out.print("[" + original[i] + "]");
        }
        
    }
}
