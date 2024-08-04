
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        
        System.out.println("Ingresar fila:");
        int numfilas=lea.nextInt();
        
        String espacios="";
        int num = 0;
        
        //filas
        for (int i = numfilas; i > 0; i--) {
            System.out.print(espacios);
           num++;
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            
            
            for (int j = i; j >=1; j--) {
                System.out.print(j);
                
            }
            System.out.println();
            espacios+=" ";
        }
        
        
    }
}
