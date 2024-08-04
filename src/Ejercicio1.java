
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.println("Ingrese una palabra:");
        String palabra=lea.next();
        char letra;
        for(int indice=0;indice<=palabra.length()-1;indice++){
            for (int i = 0; i < indice; i++) {
                System.out.print(" ");
            }
            System.out.println(palabra.toUpperCase().charAt(indice));
        }
        for(int indice=palabra.length()-1;indice>=0;indice--){
            for (int i =0 ; i < indice; i++) {
              System.out.print(" "); 
            }
           System.out.println(palabra.toUpperCase().charAt(indice)); 
           
        }
        
      
        
        
    }
}
