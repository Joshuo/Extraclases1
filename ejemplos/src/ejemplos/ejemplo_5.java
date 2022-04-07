/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Noel
 */
public class ejemplo_5 {
    public static void main(String[] ar){
        Scanner teclado =new Scanner(System.in);
        int num;
        boolean continua;
        do{
            try{
                continua=false;
                System.out.print("Ingrese un valor entero:");
                num= teclado.nextInt();
                int cuadrado=num*num;
                System.out.print("el cuadrado de "+num+"es"+cuadrado);
            } catch(InputMismatchException ex){
                System.out.println("Debe ingresar obligatoriamente un numero entero");
                teclado.next();
                continua=true;
            }
        }while(continua);
            }
        }
    
    

