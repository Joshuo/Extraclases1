/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author Noel
 */
//Uso de un bloque try anidado
public class ejemplo_4 {
    public static void main(String[] args){
        //num es mayor que denom
        int nums[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};
        
        try{ //try externo
            for (int i=0; i<nums.length;i++){
                try{//try anidado
                    System.out.println(nums[i]+"/"+
                            denom[i]+"es"+nums[i]/denom[i]);
                } catch(ArithmeticException exc){
                    //capturando la excepcion
                    System.out.println("no se puede dividir entre 0");
                }
                
                }
            } catch(ArrayIndexOutOfBoundsException exc){
                //capturando la excepcion
                System.out.println("alguna excepcion ocurrio");
                System.out.println("ERROR: programa terminado");
        }
    }
    
}
