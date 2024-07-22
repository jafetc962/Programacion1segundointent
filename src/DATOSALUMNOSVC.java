
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class DATOSALUMNOSVC {
     public static void main(String[] args) {
         Scanner lea=new Scanner(System.in);
         
         int numeroCuenta=22341274,edad;
         String nombreAlumno="Erick",apellidoAlumno;
         edad=24;
         apellidoAlumno="Amaya";
         Double promedio;
         promedio=59.4;
         
         System.out.println("----Datos del Alumno----");
         System.out.println("Numero de Cuenta: "+numeroCuenta);
         System.out.println("Nombre: "+nombreAlumno);
         System.out.println("Apellido: "+apellidoAlumno);
         System.out.println("Edad: "+edad);
         System.out.println("Promedio: "+promedio);
         
     }
}
