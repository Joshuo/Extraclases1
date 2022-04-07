/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author Noel
 */
public class ejemplo_2 {
    //Generando una excepcion
    static void genException(){
        int nums[]=new int[4];
        
        System.out.println("Antes de que se genere la excepcion");
        
        //generar una excepcion de indice fuera de limites
        nums[7]=10;
        System.out.println("Esto no se mostrara");
    }

    static void genExcepcion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
