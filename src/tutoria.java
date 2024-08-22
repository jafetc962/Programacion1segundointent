
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class tutoria {
     public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
      
         System.out.println("Ingrese la cantidad de numeros: ");
         int conteo=lea.nextInt();
         double numArm=0;
         int num=0;
         String n="";
         String vista="";
         
         System.out.println("Ingrese los "+conteo+" numeros: ");
         for(int i=0;i<conteo;i++){
             System.out.println("Ingrese el numero");
             num=lea.nextInt();
          numArm=numArm+Math.pow(num, conteo);
          n=n+" "+num+" ";
          if(i==0){
              vista=num+"^"+conteo;
          }
         }
         System.out.println("Numero original: "+n);       
         System.out.println("Resultado: "+numArm);
                 
        
        
        
        
        
        
        
        
        
     }
}
