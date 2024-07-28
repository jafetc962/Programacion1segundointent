
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class OperadorTernario {
     public static void main(String[] args) {
         Scanner lea=new Scanner(System.in);
         
     /*
         El operador condicional (ternario) es el único operador 
         en JavaScript que tiene tres operandos. Este operador se usa 
         con frecuencia como atajo para la instrucción if.
         
         Sintaxis
condición ? expr1 : expr2
Parámetros
condición
Una expresión que se evalúa como true o false.

expr1, expr2
Expresión con valores de algún tipo.

Descripción
Si la condición es true, el operador retorna el valor de la expr1;
de lo contrario, devuelve el valor de expr2. Por ejemplo, para mostrar 
         un mensaje diferente en función del valor de la variable 
         isMember, se puede usar esta declaración:

JS
Copy to Clipboard
"La Cuota es de:  " + (isMember ? "$2.00" : "$10.00");
También puedes asignar variables dependiendo 
         del resultado de la condición ternaria:

JS
Copy to Clipboard
var elvisLives = Math.PI > 4 ? "Sip" : "Nop";
También es posible realizar evaluaciones ternarias
         múltiples (Nota: El operador condicional es asociativo):

JS
Copy to Clipboard
var firstCheck = false,
  secondCheck = false,
  access = firstCheck
    ? "Acceso Denegado"
    : secondCheck
      ? "Acceso Denegado"
      : "Acceso Permitido";

console.log(access); // muestra "Acceso Permitido"
También puede usar operaciones ternarias en espacio
         vacío con el propósito de realizar diferentes operaciones:

JS
Copy to Clipboard
var stop = false,
  age = 16;

age > 18 ? location.assign("continue.html") : (stop = true);
También puede realizar más de una operación por caso, 
         separándolas con una coma:

JS
Copy to Clipboard
var stop = false,
  age = 23;

age > 18
  ? (alert("OK, puedes continuar."), location.assign("continue.html"))
  : ((stop = true), alert("Disculpa, eres menor de edad!"));
También puede realizar más de una operación durante la 
         asignación de un valor. En este caso, el último 
         valor separado por una coma del paréntesis será el valor asignado.
         */
     
     
     //variables
     int opcionMenu=0;
     
     //loop tarea
     while(opcionMenu!=4){
         
         
     //menu
         System.out.println("Bienvenido inge,seleccione una de las cuatro opciones:");
         System.out.println("1->El uso de valor constante");
         System.out.println("2->Con variables");
         System.out.println("3->Con fórmulas");
         System.out.println("4->Salida");
         opcionMenu=lea.nextInt();
         
         
     if(opcionMenu==1){    
     //caso Uno USO DE VALOR CONSTANTE
     System.out.println("----USO DE VALOR CONSTANTE----");
     //precio1= 1 lipton        precio2=2 churros grandes con una cocacola 3 litros
     double precio1=29.15,precio2=99.99;
     double precioMayor=(precio1>precio2)?precio1:precio2;
     String producto=(precioMayor==precio1)?" 1 lipton":" 2 churros grandes con una cocacola 3 litros";
     
         System.out.println("El precio mas alto es de: lps."+precioMayor+" con los siguientes productos:"+producto);
         
     }  
      if(opcionMenu==2) {  
    //caso 2   variables (con variables entendi que se referia a variables desde teclado)
          System.out.println("----con variables----");
         System.out.println("ingrese nota 1:");
         
         double nota1=lea.nextDouble();
         
         System.out.println("ingrese nota 1:");
         
         double nota2=lea.nextDouble();
         
         
         double notamayor=(nota1>nota2)? nota1:nota2;
         
         double notamenor=(nota1<nota2)? nota1:nota2;
         
         double promedio=nota1+nota2/2;
         
         String mejorNota=(nota1>nota2)? "La mejor nota es la nota 1":"La mejor nota es la nota 2";
         
          System.out.println("Nota mas alta: "+notamayor);
          System.out.println("Nota mas baja: "+notamenor);
          System.out.println(mejorNota);
          System.out.println("Promedio: "+promedio);
          
      }
      
      if(opcionMenu==3){
          //con formulas
          System.out.println("----con formulas----");
          
          System.out.println("Ingrese la figura a calcular:");
          System.out.println("1->Triangulo Rectangulo");
          System.out.println("2->Cuadrado");
          int seleccionFigura=lea.nextInt();
          
          System.out.println("Ingrese la base:");
          double base=lea.nextDouble();
          System.out.println("Ingrese la altura/ancho:");
          double altura_ancho=lea.nextDouble();
          
          double resultado=(seleccionFigura==1)?(base*altura_ancho)/2:base*altura_ancho;
          String figura=(seleccionFigura==1)?"Triangulo Rectangulo":"Cuadrado";
          
          System.out.println("Figura: "+figura);
          System.out.println("Lado 1: "+base );
          System.out.println("Lado 2: "+altura_ancho);
          System.out.println("Area: "+resultado);
          
          
          
      }
     
     }
         System.out.println("Gracias por su tiempo inge,que tenga un feliz dia (( o noche yo no se  :) ) ");   
     }
}
