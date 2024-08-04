
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Colindres_Jafet_Loops {
    
    
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        //Variable
    int menu=0;
    
    //Loop menu
    while(menu!=4){
    
        System.out.println("----Tarea #2----");
        System.out.println("----Seleccione un ejercicio:----");
        System.out.println("1->El ingreso de una palabra e imprimir de manera diagonal:");
        System.out.println("2->Pirámide de numero:");
        System.out.println("3->Listado de Palíndromo y No.  :");
        System.out.println("4->Salir");
        menu=lea.nextInt();
        
       //loop 1
        while(menu<1 || menu>4){
            
            //menu 2
         System.out.println("ACCION NO VALIDA INGRESE DE NUEVO: ");   
        System.out.println("----Prueba #1----");
        System.out.println("----Seleccione un ejercicio:----");
        System.out.println("1->El ingreso de una palabra e imprimir de manera diagonal:");
        System.out.println("2->Pirámide de numero:");
        System.out.println("3->Listado de Palíndromo y No.  :");
        System.out.println("4->Salir");
        menu=lea.nextInt();
        }
        
        
        //Variables
        
        
        
        
         if(menu==1){
             System.out.println("----El ingreso de una palabra e imprimir de manera diagonal----");
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
        System.out.println("");
        }
                     
    
         if(menu==2){
         System.out.println("----Pirámide de numero----");
         
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
         System.out.println("");
         }
         
         
         
         if(menu==3){
         System.out.println("----Listado de Palíndromo y No.----");
             
             System.out.println("Ingresar la cantidad de palabras");
             int cantidad=lea.nextInt();
             
             //variables
             int conteo=0;
             int conteoPalindromo=0;
             int conteoNoPalindromo=0;
             String palabrasPalindromas="";
             String palabrasNoPalindromas="";
             
             while(conteo<cantidad){
                 conteo++;
                 
                 System.out.println("Palabra #"+conteo+": ");
                 String palabra=lea.next();
                 String palabrainvertida="";
                 //detectando palindromas
                  for (int indice = palabra.length() - 1; indice >= 0; indice--) {
			
			palabrainvertida += palabra.charAt(indice);
		}
                  
                  
                  //resultado de "detectando palindromas"
                 if(palabrainvertida.equalsIgnoreCase(palabra)){
                     conteoPalindromo++;
                     palabrasPalindromas=palabrasPalindromas+"\n"+conteoPalindromo+"-"+
                                         palabra;
                 }else{
                     conteoNoPalindromo++;
                     palabrasNoPalindromas=palabrasNoPalindromas+"\n"+conteoNoPalindromo+"-"+
                                           palabra;
                 }
                 
                 
             }
            //Salida
             System.out.println("Palindromo: \n"+palabrasPalindromas);
             System.out.println("");
             System.out.println("No palindromo: \n"+palabrasNoPalindromas);
             System.out.println("");
         }
        
    }
     
    }
    
    
    
}
