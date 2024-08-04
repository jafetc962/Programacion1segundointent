
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ExPalindromo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        //variablew
        
        String respuestaSiNo="";
        String nombreInvertida="";
        
        do{
            nombreInvertida="";
            System.out.println("Ingrese una palabra"); 
            String nombre=lea.next();
            
            //
            for (int indice = nombre.length() - 1; indice >= 0; indice--) {
			
			nombreInvertida += nombre.charAt(indice);
		}
            String resultado=(nombre.equalsIgnoreCase(nombreInvertida))?"La palabra es palindroma":"La palabra no es palindroma";
            System.out.println(resultado);
            
            System.out.println("Desea otra Palabra a evaluar?");
            respuestaSiNo=lea.next();
            
        }while(!respuestaSiNo.equalsIgnoreCase("no"));
        
        
        
    }
}
