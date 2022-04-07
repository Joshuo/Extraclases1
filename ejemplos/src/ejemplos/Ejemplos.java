/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

/**
 *
 * @author Noel
 */
public class Ejemplos {
    public static void main(String[] args){
        int[] nums=new int[4];
        try{
            ejemplo_2.genExcepcion();
        }catch (ArrayIndexOutOfBoundsException exc){
            //captura excepcion
            System.out.println("indice fuera de los limites");
        }
        System.out.println("Despues de que se genere la excepcion");
    }

    
    
}
