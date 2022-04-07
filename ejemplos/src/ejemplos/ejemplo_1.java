/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author Noel
 */
public class ejemplo_1 {
    public static void main(String[] args){
        int nums[]=new int[4];
        
        try{
            System.out.println("Antes que se genere la ecvepcion");
            //generar una excepcion de indice fuera de limites
            nums[7]=10;
        }catch (ArrayIndexOutOfBoundsException exc){
            //capturar la excepcion
            System.out.println("Indice fuera de los limites!");
        }
        System.out.println("Despues de que se genera la excepcion");
    }
            
        }
        
    

