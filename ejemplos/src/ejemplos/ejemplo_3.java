/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;

/**
 *
 * @author Noel
 */
//Las subclases deben preceder a las superclases
//Captura de excepciones de subclase
public class ejemplo_3 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        //Aqui num es mas grande que denom
        int nums[] ={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};
        
        for (int i=0;i< nums.length;i++){
            try {
                System.out.println(nums[i]+"/"+
                        denom[i]+" es "+nums[i]/denom[i]);;
            }catch (ArrayIndexOutOfBoundsException exc){
                //capturando la excepcion (subclase)
                System.out.println("No se encontro ningun elemento");
            }
            catch (Throwable exc){
                //capturando la excepcion (subclase)
                System.out.println("alguna excepcion ocurrió");
            }
        }
    }
    
}
