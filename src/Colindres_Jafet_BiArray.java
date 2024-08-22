
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Colindres_Jafet_BiArray {
    public static void main(String[] args) {
        
        Scanner lea= new Scanner(System.in);
        Random numAleatorio = new Random();
        
        System.out.println("Ingresar la cantidad de filas y columnas del array:");
        int tamano=lea.nextInt();
        
        //variables
        int numero=0;
        
        int[][] arrayDosDigit= new int[tamano][tamano];
        
        int sumadiagP=0;
        int sumadiagS=0;
        
        //llenar array
        for(int filas=0;filas<tamano;filas++){
            for(int columnas=0;columnas<tamano;columnas++){
                numero=numAleatorio.nextInt(10,99);
                while(numero<10 && numero>=100){
                numero=numAleatorio.nextInt(10,99);
                }
                
                  arrayDosDigit[filas][columnas]=numero;
                
                
               
                }
            }
        //print array
        for(int filas=0;filas<tamano;filas++){
            for(int columnas=0;columnas<tamano;columnas++){
                System.out.print(arrayDosDigit[filas][columnas]+"   ");
                
                //diagonal principal
                if(columnas==filas){
                sumadiagP+=arrayDosDigit[filas][columnas];
                }
                
                
                
                }
             System.out.println(" ");
            }
        
        //diagonal secundaria
        for(int filas=0;filas<tamano;filas++){
            int conteo=0;
         for(int columnasconteo=tamano-1;columnasconteo>=0;columnasconteo--){
             conteo++;
             if(columnasconteo==tamano-conteo && filas<tamano){
                 sumadiagS+=arrayDosDigit[filas][columnasconteo];
             }
         }
         
       }
        
        //print
            System.out.println("Suma de la Diagonal Principal: "+sumadiagP);
            System.out.println("Suma de la Diagonal Secundaria: "+sumadiagS);
        
        
        }
    }

