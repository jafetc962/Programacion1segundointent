
import java.text.DecimalFormat;
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
public class EstudiantesPromedio {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
         DecimalFormat df = new DecimalFormat("#.00");
         
         try{
        
        String desicion="";
        double nota1=0;
        double nota2=0;
        double nota3=0;
        String estudianteNom="";
        double promedio=0;
        String resul="";
        int conteo=0;
        String AproDesApro="";
        
        while(!desicion.equalsIgnoreCase("no")){
            conteo++;
            System.out.println("Ingrese el nombre del estudiante: ");
            estudianteNom=lea.next();
            
            System.out.println("Ingrese nota 1:");
            nota1=lea.nextInt();
            while(nota1<0 || nota1>100){
                System.out.println("Ingrese numeros entre 0 y 100");
                System.out.println("Ingrese nota 1:");
            nota1=lea.nextInt();
            }
            
            System.out.println("Ingrese nota 2: ");
            nota2=lea.nextInt();
            while(nota2<0 || nota2>100){
                System.out.println("Ingrese numeros entre 0 y 100");
                System.out.println("Ingrese nota 1:");
            nota2=lea.nextInt();
            }
            
            System.out.println("Ingrese nota 3:");
            nota3=lea.nextInt();
            while(nota3<0 || nota3>100){
                System.out.println("Ingrese numeros entre 0 y 100");
                System.out.println("Ingrese nota 1:");
            nota3=lea.nextInt();
            }
            promedio=(nota1+nota2+nota3)/3;
            AproDesApro=(promedio>=70)?"Aprobado":"Reprobado";
            
            if(conteo==1){
                resul="Estudiante: "+estudianteNom+", Promedio: " +df.format(promedio)+", Resultado: "+AproDesApro;
            }else{
                resul+="\nEstudiante: "+estudianteNom+", Promedio: " +df.format(promedio)+", Resultado: "+AproDesApro;
            }
            System.out.println("¿Desea ingresar otro estudiante? (si/no): ");desicion=lea.next();
        }
        System.out.println(resul);
         }catch(InputMismatchException e){
             System.out.println("Ingrese solo numeros para las notas");
         
        }
    }
}
