
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class arreglosbidi {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int[][] tabla={{1,2,3},
                       {4,5,6}};        
       
        int suma=0;
        int suma2=0;
        int suma3=0;
        for(int filas=0;filas<tabla.length;filas++){
            for(int columnas=0;columnas<tabla[filas].length;columnas++){
                System.out.print(tabla[filas][columnas]+"  ");
                
                switch(columnas){
                    
                    case 0:   
                suma=suma+tabla[filas][columnas];
                break;
                    case 1:
                suma2=suma2+tabla[filas][columnas];
                break;
                    case 2:    
                suma3=suma3+tabla[filas][columnas];
                break;
                } 
                
             }
            System.out.println(" ");
        }
        
        System.out.print(suma+" "+suma2+" "+suma3);
        System.out.println("");
        
        
        
        
        }
    }
