
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Colindres_jafet_TC {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        //Variables
        int conteo=0;
        int menu=0;
        double base=0;
        double altura=0;
        double area =0;
        String trianguloMayor=null;
        String trianguloMenor=null;
        double comparacionMayor=0;
        double comparacionMenor=0;
        
       try{
            while(menu!=4){
            System.out.println("Bienvenido al Menu"); 
            System.out.println("----Seleccione una opcion----");
            System.out.println("1 -> Area Triangulo");
            System.out.println("2 -> Mínimo Común Múltiplo y Máximo Común Divisor");
            System.out.println("3 -> Número perfecto");
            System.out.println("4 -> Salir");
            menu=lea.nextInt();
            while(menu<1 || menu>4){
                System.out.println("ERROR");
                System.out.println("----Seleccione una opcion----");
            System.out.println("1 -> Area Triangulo");
            System.out.println("2 -> Mínimo Común Múltiplo y Máximo Común Divisor");
            System.out.println("3 -> Número perfecto");
            System.out.println("4 -> Salir");
            menu=lea.nextInt();
            }
            
        
          if(menu==1){
               System.out.println("----Area Triangulo----");
            while(conteo<=7){
              conteo++;
                System.out.println("Base #"+conteo+": ");
                base=lea.nextDouble();
                System.out.println("Altura #"+conteo+": ");
                altura=lea.nextDouble();
                
                area=(base*altura)/2;
                comparacionMayor=(area>comparacionMayor)?area:comparacionMayor;
                comparacionMenor=(area<comparacionMenor)?area:comparacionMenor;
                System.out.println("Area #"+conteo+": "+area); 
                trianguloMayor="Triangulo con mayor Area: "+conteo+"-"+comparacionMayor;
                trianguloMayor="Triangulo con menor Area: "+conteo+"-"+comparacionMenor;
            }
              System.out.println(comparacionMayor);
              System.out.println(comparacionMenor);
               
           } 
           if(menu==2){
               System.out.println("----Minimo comun multiplo y Maximo comun Divisor----");
               
               System.out.println("Ingrese un numero Entero");
               int num1=lea.nextInt();
               System.out.println("Ingrese un numero Entero:");
               int num2=lea.nextInt();
               
               //variablea
               int minimocomun=0;
               int conteo2=0;
               int multi1=0;
               int multi2=0;
               int div1=0;
               int div2=0;
               int maxdiv=0;
               
               while(minimocomun==0){
                   conteo2++;
                  multi1=num1*conteo2;
                  multi2=num2*conteo2;
                  if(multi1==multi2){
                    minimocomun=multi1;  
                  }
                 
                           
               }
               
               
               
               
               
               
               
               
               System.out.println("Minimo comun multiplo de ");
               
               
               
               
               
               
           }
            
            
            
            
            
        }
  
        
        
        
    }catch(InputMismatchException e){
           System.out.println("Ingrese un numero,no una letra.");
    }
}}
