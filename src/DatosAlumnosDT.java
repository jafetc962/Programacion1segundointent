
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class DatosAlumnosDT {
    public static void main(String[] args) {
         Scanner lea=new Scanner(System.in);
         lea.useDelimiter("\n");
         
         //Solicitud de datos
         System.out.println("Ingrese el numero de cuenta del Alumno:");
         int CuentaAlumno=lea.nextInt();
         
         System.out.println("Ingrese el nombre del Alumno: ");
         String nombreAlumno=lea.next();
         
         System.out.println("Ingrese el Apellido del Alumno: ");
         String apellidoAlumno=lea.next();
         
         System.out.println("Ingrese la edad del Alumno: ");
         int edad=lea.nextInt();
         
         System.out.println("Ingrese la nota final#1 del Alumno: ");
         double nota1=lea.nextDouble();
         
         System.out.println("Ingrese la nota final#2 del Alumno: ");
         double nota2=lea.nextDouble();
         
         //proceso
         double promedio=(nota1+nota2)/2;
         
         //salida pantalla
         System.out.println("----Datos del Alumno----");
         System.out.println("Numero de Cuenta: "+CuentaAlumno);
         System.out.println("Nombre: "+nombreAlumno);
         System.out.println("Apellido: "+apellidoAlumno);
         System.out.println("Edad: "+edad);
         System.out.println("Nota#1: "+nota1);
         System.out.println("Nota#2: "+nota2);
         System.out.println("Promedio: "+promedio+" %");

         
        
       
     }
}
