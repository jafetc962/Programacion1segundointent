
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
public class Apellido_Nombre_Prueba1P2 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        Random rd=new Random();
      
        String palabras[ ] = { "radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed" };
        
        System.out.println("Lista de Palabras: ");
        
        //print lista entera
        for(int conteo=0;conteo<palabras.length;conteo++){
            System.out.println("["+conteo+"]: "+palabras[conteo]);
        }
        
        //tamano arreglo
        System.out.println("Ingresar el tamaño de los arreglos: "); int tamano=lea.nextInt();
        
        
        //Arreglos y variables
        int tamanoArray=100;
        String listaA[]=new String[tamano];
        String listaB[]=new String[tamano];
        String palabraInvertida="";
        String random[]=new String[tamanoArray];
        
        //guardandoPalindromas
        for(int cont=0;cont<palabras.length;cont++){
            String palabra="";
            palabraInvertida="";
            palabra=palabras[cont];
           
         for (int indice = palabra.length() - 1; indice >= 0; indice--) {
			
			palabraInvertida += palabra.charAt(indice);
		}
          
           if(palabra.equalsIgnoreCase(palabraInvertida)){
             
               
               
               random[cont]=palabra;
               
           }
        }
        
        //Ingresando palindromo lista
        for(int conteo=0;conteo<tamano;conteo++){
            listaA[conteo]=random[rd.nextInt(tamanoArray-1)];
            listaB[conteo]=random[rd.nextInt(tamanoArray-1)];
        }
       
        //print A
        System.out.println("Lista Palabras Palíndroma arreglo A:");
        for(int pos=0;pos<tamano;pos++){
            System.out.println("["+pos+"]: "+listaA[pos]);
        }
        System.out.println("Lista Palabras Palíndroma arreglo B:");
       for(int pos=0;pos<tamano;pos++){
            System.out.println("["+pos+"]: "+listaB[pos]);
        }
        
        
        
    }
   
}
