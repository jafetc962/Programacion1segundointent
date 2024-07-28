
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Colindres_Jafet_TiendaDistribuidoraCA {
       public static void main(String[] args) {
         Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
         
         //Variables
         
         int menu=0;
         int contadorAbrircaja=0;
         double ingresoCCaja = 0;
         int tipoProveedor;
         int CantidadProducto1 = 0;
         int CantidadProducto2=0;
         int CantidadProducto3=0;
         int CantidadProducto4=0;
         int inventarioProducto1=0;
         inventarioProducto1=inventarioProducto1+CantidadProducto1;
         int inventarioProducto2=0;
         inventarioProducto2=inventarioProducto2+CantidadProducto2;
         int inventarioProducto3=0;
         inventarioProducto3=inventarioProducto3+CantidadProducto3;
         int inventarioProducto4=0;
         inventarioProducto4=inventarioProducto4+CantidadProducto4;
         int codigoProducto=0;
         int PrecioCompras;
         int tipoCliente=0;
         int cantidadProductoCliente=0;
         int precioVentas;
         
         
         //loop menu
         
         while(menu!=6){
             
             //m3nu opciones
             System.out.println("Bienvenido a la Tienda y Distribuidora CA");
             System.out.println("----MENU----");
             System.out.println("1->ABRIR CAJA");
             System.out.println("2->VENTAS");
             System.out.println("3->COMPRAS");
             System.out.println("4->REPORTES");
             System.out.println("5->CIERRE DE CAJA");
             System.out.println("6->SALIR DEL SISTEMA");
             System.out.println("Seleccione un menu:");
             menu=lea.nextInt();
             
             while(menu<1 || menu>6){
               System.out.println("Accion invalida, Ingresar numeros del 1 al 6");
               System.out.println("----MENU----");
             System.out.println("1->ABRIR CAJA");
             System.out.println("2->VENTAS");
             System.out.println("3->COMPRAS");
             System.out.println("4->REPORTES");
             System.out.println("5->CIERRE DE CAJA");
             System.out.println("6->SALIR DEL SISTEMA");
             System.out.println("Seleccione un menu:");
             menu=lea.nextInt();
           }
          
          //abrir caja
           if(menu==1){
            System.out.println("----ABRIR CAJA----"); 
            
            //contador
           contadorAbrircaja++;
           
           
           //ingreso a caja
               System.out.println("Ingrese el dinero a guardar en caja:");
               ingresoCCaja=lea.nextDouble();
               
               
           }else if(menu==2){
            System.out.println("----Ventas----"); 
            
            
            //ingreso de tipo proveedor
               System.out.println("Ingrese el tipo de cliente:");
               
               System.out.println("1->A");
             System.out.println("2->B");
             System.out.println("3->C");
             tipoCliente=lea.nextInt();
             
             
             //Accion no valida
             while(tipoCliente<1 || tipoCliente>3){
                 System.out.println("Accion invalida, Ingresar numeros del 1 al 3");
                 System.out.println("Ingrese el tipo de cliente:");
               
               System.out.println("1->A");
             System.out.println("2->B");
             System.out.println("3->C");
             tipoCliente=lea.nextInt();
             }
            
            
            //Seleccion productos de acuerdo a tipo cliente
            
            //ProveedorA
             if(tipoCliente==1){
                 System.out.println("Productos disponibles para cliente A:");
                 
             System.out.println("Codigo: 1 -> Azucar -> Precio = lps.30");
             System.out.println("Codigo: 2 -> Avena -> Precio = lps.25");
             System.out.println("Codigo: 3 -> Trigo -> Precio = lps.32");
             System.out.println("Codigo: 4 -> Maiz -> Precio = lps.20");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();
             
             //Accion Invalida
             while(codigoProducto<1 && codigoProducto>4 ){
                 System.out.println("Accion invalida, Ingresar numeros 1 o 4");
               System.out.println("Codigo: 1 -> Azucar -> Precio = lps.30");
               System.out.println("Codigo: 2 -> Avena -> Precio = lps.25");
             System.out.println("Codigo: 3 -> Trigo -> Precio = lps.32");
             System.out.println("Codigo: 4 -> Maiz -> Precio = lps.20");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
                 
             
             
             //Producto1
             if(codigoProducto==1){
                 precioVentas=0;
                 System.out.println("Codigo: 1 -> Azucar -> Precio = lps.30");
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente=lea.nextInt();
                 precioVentas=cantidadProductoCliente*30;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+precioVentas);
                 if(ingresoCCaja>=precioVentas ){
                     ingresoCCaja=ingresoCCaja-precioVentas;
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }}
                 //Producto4
                  if(codigoProducto==4){
                     PrecioCompras=0;
                     System.out.println("Codigo: 4 -> Maiz -> Precio = lps.20");
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto4=lea.nextInt();
                 PrecioCompras=CantidadProducto4*18;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }
             
             }
             
             
             
             
             
             
             
             }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
           
           }else if(menu==3){
            System.out.println("----COMPRAS----"); 
            
            //ingreso de tipo proveedor
               System.out.println("Ingrese el tipo de proveedor:");
               
               System.out.println("1->A");
             System.out.println("2->B");
             System.out.println("3->C");
             tipoProveedor=lea.nextInt();
             
             
             //Accion no valida
             while(tipoProveedor<1 || tipoProveedor>3){
                 System.out.println("Accion invalida, Ingresar numeros del 1 al 3");
                 System.out.println("Ingrese el tipo de proveedor:");
               
               System.out.println("1->A");
             System.out.println("2->B");
             System.out.println("3->C");
             tipoProveedor=lea.nextInt();
             }
             
             //ProveedorA
             if(tipoProveedor==1){
                 System.out.println("Productos Ofrecidos por Proveedor A:");
                 
             System.out.println("Codigo: 1 -> Azucar -> Precio = lps.25");
             System.out.println("Codigo: 4 -> Maiz -> Precio = lps.18");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();
             
             //Accion Invalida
             while(codigoProducto!=1 && codigoProducto!=4 ){
                 System.out.println("Accion invalida, Ingresar numeros 1 o 4");
               System.out.println("Codigo: 1 -> Azucar -> Precio = lps.25");
             System.out.println("Codigo: 4 -> Maiz -> Precio = lps.18");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
             while(codigoProducto!=4 && codigoProducto!=1){
                 System.out.println("Accion invalida, Ingresar numeros 1 o 4");
               System.out.println("Codigo: 1 -> Azucar -> Precio = lps.25");
             System.out.println("Codigo: 4 -> Maiz -> Precio = lps.18");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
                 
             
             
             //Producto1
             if(codigoProducto==1){
                 PrecioCompras=0;
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto1=lea.nextInt();
                 PrecioCompras=CantidadProducto1*25;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }}
                 //Producto4
                  if(codigoProducto==4){
                     PrecioCompras=0;
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto4=lea.nextInt();
                 PrecioCompras=CantidadProducto4*18;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }
             
             }
             
             
             
             
             
             
             //Proveedor B
             }else if(tipoProveedor==2){
                 System.out.println("Productos Ofrecidos por Proveedor B:");
                 
             System.out.println("Codigo: 2 -> Avena -> Precio = lps.20");
             System.out.println("Codigo: 3 -> Trigo -> Precio = lps.30");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();
             
             //Accion invalida
             while(codigoProducto!=2 && codigoProducto!=3){
                 System.out.println("Accion invalida, Ingresar numeros 2 o 3");
             System.out.println("Codigo: 2 -> Avena -> Precio = lps.20");
             System.out.println("Codigo: 3 -> Trigo -> Precio = lps.30");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
             while(codigoProducto!=3 && codigoProducto!=2){
                 System.out.println("Accion invalida, Ingresar numeros 2 o 3");
             System.out.println("Codigo: 2 -> Avena -> Precio = lps.20");
             System.out.println("Codigo: 3 -> Trigo -> Precio = lps.30");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
             
             //Producto2
             if(codigoProducto==2){
                 PrecioCompras=0;
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto2=lea.nextInt();
                 PrecioCompras=CantidadProducto2*20;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }}
                 //Producto3
                  if(codigoProducto==3){
                     PrecioCompras=0;
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto3=lea.nextInt();
                 PrecioCompras=CantidadProducto3*30;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }  
                  }
             //proveedor C
             }else if(tipoProveedor==3){
                 System.out.println("Productos Ofrecidos por Proveedor C:");
                 
             System.out.println("Codigo: 2 -> Avena -> Precio = lps.22");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();
             
             //Accion Invalida
             while(codigoProducto!=2){
                 System.out.println("Accion invalida, Ingresar numero 2");
               System.out.println("Codigo: 2 -> Avena -> Precio = lps.22");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
             
             //Producto2
             if(codigoProducto==2){
                 PrecioCompras=0;
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto2=lea.nextInt();
                 PrecioCompras=CantidadProducto2*22;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }   
             
             }
             
               
           }else if(menu==4){
            System.out.println("----REPORTES----");   
           
           }else if(menu==5){
            System.out.println("----CIERRE DE CAJA----");   
           
           }
             
             
         
             
             
             
             
             
         }
         System.out.println("Tienda y Distribuidora CA");
         System.out.println("Gracias por usar nuestros servicios");
                 }
}}
