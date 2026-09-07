/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_4_objetos;

/**
 *
 * @author EZC
 */
public class EVA_4_OBJETOS {
    public static void main(String[] args) {
        
        Prueba prueba = new Prueba();
        System.out.println(prueba);
        //ELIMINAR prueba:
        //Terminar el programa --> garbage collector (libera memoria automáticamente)
        //eliminar "directamente" el objeto:
        prueba = null;
        
    }
    
}

class Prueba{
    
}
