
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class EstructuraControl {
    
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        /*
        Estructura de control(loop)
        
        1-while
        2-do...while
        3-for
        4-foreach
        */
        
        
        /*
        boolean r=true;
        int conteo=0;
        while(r==true){
            
            conteo++;
            System.out.println("0"+" "+conteo);
            
            if(conteo>100){
                r=false;
            }
        }
        */
        System.out.println("Ingresar tabla: ");
        
        int opcion=0;
        
        do{
            
            System.out.println("----MENU----");
            System.out.println("1->Tabla");
            System.out.println("2->desconocido");
            System.out.println("3->SALIR");
            System.out.println("\nEscoja una opcion:");
            opcion=lea.nextInt();
         
            switch(opcion){
                case 1:
              System.out.println("Ingresar tabla: ");
        
        
              int tabla=lea.nextInt();
        
                  System.out.println("Ingresar limite de tabla:");
        
        
                   int conteo=0,resul=0,limite=lea.nextInt(),total=0;
        
               /* System.out.println("----Tabla del "+tabla+"----");
        
            while(conteo<limite){
            conteo++;
            resul=tabla*conteo;
            System.out.println(tabla+" x "+conteo+" = "+tabla*conteo);
            total=total+resul;
        }
        System.out.println("Suma Total = "+total);
        
        */
        //Do while
        do{
         conteo++;
         resul=tabla*conteo;
            System.out.println(tabla+" x "+conteo+" = "+tabla*conteo);
            total=total+resul;
        }
        while(conteo<limite);
        break;
        
                case 2:
                    System.out.println("Ejercicio Desconocido");
                    break;
                default:
                    System.out.println("Saliendo del programa!");
                    break;
        
            }
        }while(opcion!=3);
    }
    
    
}
