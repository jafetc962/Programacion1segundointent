
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Colindres_Jafet_Projecto1 {
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
         int cantidadProductoCliente1=0;
         int cantidadProductoCliente2=0;
         int cantidadProductoCliente3=0;
         int cantidadProductoCliente4=0;
         double precioVentas;
         String desicionventas="";
         int totalkilogramosventas1=0;
         int totalkilogramosventas2=0;
         int totalkilogramosventas3=0;
         int totalkilogramosventas4=0;
         String facturaventas = null;
         int conteowhile=0;
         double totalventas1=0;
         double totalventas2=0;
         double totalventas3=0;
         double totalventas4=0;
         int contadorcompras=0;
         int revisionfacturaventas1=0;
         int revisionfacturaventas2=0;
         int revisionfacturaventas3=0;
         int revisionfacturaventas4=0;
         double subtotal=0;
         double descuento=0;
         double impuesto=0;
         double totalventas=0;
         String descuentoMensaje="";
         int numeroventasR=0;
         int numerocomprasR=0;
         double totalcompras=0; 
         double mayorgananciaV=0;
         double mayorgastoC=0;
         int ventaAzucar=0;
         int ventaAvena=0;
         int ventaTrigo=0;
         int ventaMaiz=0;
         String primerGrupo="";
         String segundoGrupo="";
         String tercerGrupo="";
         String cuartoGrupo="";
         int cantidadGrupo1=0;
         int conteoRanking=1;
         String productoActual="";
         int cantidadActual=0;
         int cantidadGrupo2=0;
         int cantidadGrupo3=0;
         int cantidadGrupo4=0;
         int conteoCierreCaja=0;
         
         //banco
         double BANCO=0;
         double cantidadGuardarB=0;
         double verificacion=0;
         
         
                String     producto1="Azucar";
                String     producto2="Avena";
                String     producto3="Trigo";
                String     producto4="Maiz";
                     
                int     producto1c=ventaAzucar;
                int     producto2c=ventaAvena;
                int     producto3c=ventaTrigo;
                int     producto4c=ventaMaiz;
         
         
         //loop menu
         
         while(menu!=6){
             
             //menu opciones
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
             
             //accion invalida
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
           
           if(conteoCierreCaja<1){
           //ingreso a caja
               System.out.println("Ingrese el dinero a guardar en caja:");
               ingresoCCaja=lea.nextDouble();
               while(ingresoCCaja<1){
                   System.out.println("No se puede ingresar numeros negativos o 0:");
                   System.out.println("Ingrese el dinero a guardar en caja:");
               ingresoCCaja=lea.nextDouble();
               }
               
           }
           }
           //ventas
           if(menu==2 && contadorAbrircaja>=1 && contadorcompras>=1){
            System.out.println("----Ventas----"); 
            
            while(!desicionventas.equalsIgnoreCase("no")){
            conteowhile++;   
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
            
            //Cliente A
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
                 System.out.println("Kilogramos disponibles: "+inventarioProducto1);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente1=lea.nextInt();
                
                 if(cantidadProductoCliente1<=inventarioProducto1){
                 inventarioProducto1=inventarioProducto1-cantidadProductoCliente1; 
                     numeroventasR++;
                     precioVentas=cantidadProductoCliente1*30;
                 System.out.println("Total a pagar: "+precioVentas); 
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas1=totalkilogramosventas1+cantidadProductoCliente1;
                 totalventas1=totalventas1+precioVentas;
                 if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                 ventaAzucar++;
                 if(cantidadProductoCliente1<=inventarioProducto1 || revisionfacturaventas1<1){
                     
                 facturaventas=facturaventas+"\n"+" Azucar: \nKilogramos: "+totalkilogramosventas1+"\nPrecio Unitario: "+totalventas1;
                 revisionfacturaventas1++;
                  
                 }
                 }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
                 
                 }
             
                  //Producto2
             if(codigoProducto==2){
                 precioVentas=0;
                 System.out.println("Codigo: 2 -> Avena -> Precio = lps.25");
                 System.out.println("Kilogramos disponibles: "+inventarioProducto2);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente2=lea.nextInt();
                 if(cantidadProductoCliente2<=inventarioProducto2){
                  numeroventasR++;
                  inventarioProducto2=inventarioProducto2-cantidadProductoCliente2;   
                     precioVentas=cantidadProductoCliente2*25;
                 System.out.println("Total a pagar: "+precioVentas);
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas2=totalkilogramosventas2+cantidadProductoCliente2;
                 totalventas2=totalventas2+precioVentas;
                 if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                 ventaAvena++;
                 if(cantidadProductoCliente2<=inventarioProducto2 || revisionfacturaventas2<1){
                     
                 facturaventas=facturaventas+"\n"+" Avena: \nKilogramos: "+totalkilogramosventas2+"\nPrecio Unitario: "+totalventas2;
                 revisionfacturaventas2++;
                 }
                
                 }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
                 
                 }
             //Producto3
             if(codigoProducto==3){
                 precioVentas=0;
                 System.out.println("Codigo: 3 -> Trigo -> Precio = lps.32");
                 System.out.println("Kilogramos disponibles: "+inventarioProducto3);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente3=lea.nextInt();
                 if(cantidadProductoCliente3<=inventarioProducto3){
                  numeroventasR++;
                  inventarioProducto3=inventarioProducto3-cantidadProductoCliente3;   
                     precioVentas=cantidadProductoCliente3*32;
                 System.out.println("Total a pagar: "+precioVentas); 
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas3=totalkilogramosventas3+cantidadProductoCliente3;
                  totalventas3=totalventas3+precioVentas;
                  if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                  ventaTrigo++;
                  if(cantidadProductoCliente3<=inventarioProducto3 || revisionfacturaventas3<1){
                     
                 facturaventas=facturaventas+"\n"+" Trigo: \nKilogramos: "+totalkilogramosventas3+"\nPrecio Unitario: "+totalventas3;
                 revisionfacturaventas3++;
                  
                 }
                 
                 }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
                 
                 }
                 //Producto4
                  if(codigoProducto==4){
                     PrecioCompras=0;
                     System.out.println("Codigo: 4 -> Maiz -> Precio = lps.20");
                     System.out.println("Kilogramos disponibles: "+inventarioProducto4);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente4=lea.nextInt();
                 if(cantidadProductoCliente4<=inventarioProducto4){
                  inventarioProducto4=inventarioProducto4-cantidadProductoCliente4;
                     numeroventasR++;
                     precioVentas=cantidadProductoCliente4*20;
                 System.out.println("Total a pagar: "+precioVentas);
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas4=totalkilogramosventas4+cantidadProductoCliente4;
                 totalventas4=totalventas4+precioVentas;
                 if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                 ventaMaiz++;
                 if(cantidadProductoCliente4<=inventarioProducto4 || revisionfacturaventas4<1){
                     
                 facturaventas=facturaventas+"\n"+" Maiz: \nKilogramos: "+totalkilogramosventas4+"\nPrecio Unitario: "+totalventas4;
                 revisionfacturaventas4++;
                 }
                 
                 
                  }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
             
             }
             
             
                
            }//Cliente B
             else if(tipoCliente==2){
                 System.out.println("Productos disponibles para cliente B:");
                 
             System.out.println("Codigo: 1 -> Azucar -> Precio = lps.30");
             System.out.println("Codigo: 2 -> Avena -> Precio = lps.25");
             System.out.println("Codigo: 3 -> Trigo -> Precio = lps.32");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();
             
             //Accion Invalida
             while(codigoProducto<1 && codigoProducto>3 ){
                 
             
                 System.out.println("Accion invalida, Ingresar numeros 1 o 4");
               System.out.println("Codigo: 1 -> Azucar -> Precio = lps.30");
               System.out.println("Codigo: 2 -> Avena -> Precio = lps.25");
             System.out.println("Codigo: 3 -> Trigo -> Precio = lps.32");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
                 
             
             
             //Producto1
             if(codigoProducto==1){
                 precioVentas=0;
                 System.out.println("Codigo: 1 -> Azucar -> Precio = lps.30");
                 System.out.println("Kilogramos disponibles: "+inventarioProducto1);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente1=lea.nextInt();
                 if(cantidadProductoCliente1<=inventarioProducto1){
                numeroventasR++;
                 inventarioProducto1=inventarioProducto1-cantidadProductoCliente1;    
                     precioVentas=cantidadProductoCliente1*30;
                 System.out.println("Total a pagar: "+precioVentas);
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas1=totalkilogramosventas1+cantidadProductoCliente1;
                 totalventas1=totalventas1+precioVentas;
                 if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                 ventaAzucar++;
                 if(cantidadProductoCliente1<=inventarioProducto1 || revisionfacturaventas1<1){
                      
                 facturaventas=facturaventas+"\n"+" Azucar: \nKilogramos: "+totalkilogramosventas1+"\nPrecio Unitario: "+totalventas1;
                 revisionfacturaventas1++;
                
                 }
                 }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
                 
                 }
             
                  //Producto2
             if(codigoProducto==2){
                 precioVentas=0;
                 System.out.println("Codigo: 2 -> Avena -> Precio = lps.25");
                 System.out.println("Kilogramos disponibles: "+inventarioProducto2);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente2=lea.nextInt();
                 if(cantidadProductoCliente2<=inventarioProducto2){
                 inventarioProducto2=inventarioProducto2-cantidadProductoCliente2; 
                     numeroventasR++;
                     precioVentas=cantidadProductoCliente2*25;
                 System.out.println("Total a pagar: "+precioVentas); 
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas2=totalkilogramosventas2+cantidadProductoCliente2;
                totalventas2=totalventas2+precioVentas;
                if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                ventaAvena++;
                 if(cantidadProductoCliente2<=inventarioProducto2 || revisionfacturaventas2<1){
                     
                 facturaventas=facturaventas+"\n"+" Avena: \nKilogramos: "+totalkilogramosventas2+"\nPrecio Unitario: "+totalventas2;
                 revisionfacturaventas2++;
                 
                 }
                  
                 }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
                 
                 }
             //Producto3
             if(codigoProducto==3){
                 precioVentas=0;
                 System.out.println("Codigo: 3 -> Trigo -> Precio = lps.32");
                 System.out.println("Kilogramos disponibles: "+inventarioProducto3);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente3=lea.nextInt();
                 if(cantidadProductoCliente3<=inventarioProducto3){
                  inventarioProducto3=inventarioProducto3-cantidadProductoCliente3;
                     numeroventasR++;
                     precioVentas=cantidadProductoCliente3*32;
                 System.out.println("Total a pagar: "+precioVentas); 
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas3=totalkilogramosventas3+cantidadProductoCliente3;
                 totalventas3=totalventas3+precioVentas;
                 if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                 ventaTrigo++;
                if(cantidadProductoCliente3<=inventarioProducto3 || revisionfacturaventas3<1){
                    
                 facturaventas=facturaventas+"\n"+" Trigo: \nKilogramos: "+totalkilogramosventas3+"\nPrecio Unitario: "+totalventas3;
                 revisionfacturaventas3++;
                 
                 }
                  
                 }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
                 
                 }
                 
             
             
                
            }
            
             //Cliente C
             if(tipoCliente==3){
                 System.out.println("Productos disponibles para cliente C:");
                 
             System.out.println("Codigo: 4 -> Maiz -> Precio = lps.20");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();
             
             //Accion Invalida
             while(codigoProducto<4 && codigoProducto>4 ){
                 
             
             System.out.println("Codigo: 4 -> Maiz -> Precio = lps.20");
             System.out.println("Ingrese el Codigo del producto:");
             codigoProducto=lea.nextInt();   
             }
                 
             
             
             //Producto4
                  if(codigoProducto==4){
                     PrecioCompras=0;
                     System.out.println("Codigo: 4 -> Maiz -> Precio = lps.20");
                      System.out.println("Kilogramos disponibles: "+inventarioProducto4);
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 cantidadProductoCliente4=lea.nextInt();
                 if(cantidadProductoCliente4<=inventarioProducto4){
                 inventarioProducto4=inventarioProducto4-cantidadProductoCliente4; 
                     numeroventasR++;
                     precioVentas=cantidadProductoCliente4*20;
                 System.out.println("Total a pagar: "+precioVentas); 
                 ingresoCCaja+=precioVentas;
                 totalkilogramosventas4=totalkilogramosventas4+cantidadProductoCliente4;
                 totalventas4=totalventas4+precioVentas;
                 if(precioVentas>mayorgananciaV){
                     mayorgananciaV=precioVentas;
                 }
                 ventaMaiz++;
                  if(cantidadProductoCliente4<=inventarioProducto4 || revisionfacturaventas4<1)
                 
                 facturaventas=facturaventas+"\n"+" Maiz: \nKilogramos: "+totalkilogramosventas4+"\nPrecio Unitario: "+totalventas4;
                 revisionfacturaventas4++;
                 
                 }else{
                     System.out.println("----NO SE PUEDE COMPRAR DICHO PRODUCTO----");
                 }
             
             }
             
             
                
            }
            System.out.println("¿Desea efectuar otra compra?");
                desicionventas=lea.next(); 
             
             }
            
            
            
            //calculos
            subtotal=totalventas1+totalventas2+totalventas3+totalventas4;
            
            if(subtotal>=1000 && subtotal<=5000){
                descuento=subtotal*0.05;
                descuentoMensaje="5%";
            }else if(subtotal>5000){
               descuento=subtotal*0.10;
               descuentoMensaje="10%";
            }else{
                descuento=0;
                descuentoMensaje="No hay Descuento";
            }
            impuesto=0.07*subtotal;
            totalventas=(subtotal-descuento)+impuesto;
            
            
             //factura
             
               System.out.println("----Factura----");
               
               if(cantidadProductoCliente1<=inventarioProducto1 && revisionfacturaventas1>=1){
                   System.out.println("\n"+" Azucar: \nKilogramos: "+totalkilogramosventas1+"\nPrecio Unitario: "+totalventas1);
               }
               if(cantidadProductoCliente2<=inventarioProducto2 && revisionfacturaventas2>=1){
                   System.out.println("\n"+" Avena: \nKilogramos: "+totalkilogramosventas2+"\nPrecio Unitario: "+totalventas2);
               }
               if(cantidadProductoCliente3<=inventarioProducto3 && revisionfacturaventas3>=1){
                   System.out.println("\n"+" Trigo: \nKilogramos: "+totalkilogramosventas3+"\nPrecio Unitario: "+totalventas3);
               }    
                if(cantidadProductoCliente4<=inventarioProducto4 && revisionfacturaventas4>=1){
                   System.out.println("\n"+" Maiz: \nKilogramos: "+totalkilogramosventas4+"\nPrecio Unitario: "+totalventas4);
               }    
               System.out.println("Subtotal: "+subtotal);
               System.out.println("Descuento "+"-"+descuentoMensaje+"-"+": "+descuento);
               System.out.println("ISV 7%: "+impuesto);
               System.out.println("Total con ISV: "+totalventas);
            //Aumento a caja
            ingresoCCaja=ingresoCCaja+totalventas;
            
            
           }else if(menu==2 && contadorAbrircaja<1 && contadorcompras<1){
               System.out.println("Abrir caja o comprar productos para poder vender");
           }
           
           
           
           
           //compras
           if(menu==3 && contadorAbrircaja>=1 && ingresoCCaja>50){
            System.out.println("----COMPRAS----"); 
            contadorcompras++;
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
                 inventarioProducto1=inventarioProducto1+CantidadProducto1;
                 PrecioCompras=CantidadProducto1*25;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     numerocomprasR++;
                     totalcompras=totalcompras+PrecioCompras;
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                     if(PrecioCompras>mayorgastoC){
                     mayorgastoC=PrecioCompras;
                 }
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }}
                 //Producto4
                  if(codigoProducto==4){
                     PrecioCompras=0;
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto4=lea.nextInt();
                 inventarioProducto4=inventarioProducto4+CantidadProducto4;
                 PrecioCompras=CantidadProducto4*18;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     numerocomprasR++;
                     totalcompras=totalcompras+PrecioCompras;
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                     if(PrecioCompras>mayorgastoC){
                     mayorgastoC=PrecioCompras;
                 }
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
                 inventarioProducto2=inventarioProducto2+CantidadProducto2;
                 PrecioCompras=CantidadProducto2*20;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     numerocomprasR++;
                     totalcompras=totalcompras+PrecioCompras;
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                     if(PrecioCompras>mayorgastoC){
                     mayorgastoC=PrecioCompras;
                 }
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }}
                 //Producto3
                  if(codigoProducto==3){
                     PrecioCompras=0;
                 System.out.println("Ingrese la cantidad (EN KILOGRAMOS):");
                 CantidadProducto3=lea.nextInt();
                 inventarioProducto3=inventarioProducto3+CantidadProducto3;
                 PrecioCompras=CantidadProducto3*30;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     numerocomprasR++;
                     totalcompras=totalcompras+PrecioCompras;
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                     if(PrecioCompras>mayorgastoC){
                     mayorgastoC=PrecioCompras;
                 }
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
                 inventarioProducto2=inventarioProducto2+CantidadProducto2;
                 PrecioCompras=CantidadProducto2*22;
                 System.out.println("Efectivo en caja: "+ingresoCCaja);
                 System.out.println("Total a pagar: "+PrecioCompras);
                 if(ingresoCCaja>=PrecioCompras){
                     numerocomprasR++;
                     totalcompras=totalcompras+PrecioCompras;
                     ingresoCCaja=ingresoCCaja-PrecioCompras;
                     if(PrecioCompras>mayorgastoC){
                     mayorgastoC=PrecioCompras;
                 }
                 }else{
                     System.out.println("No Se Puede Pagar Compra");
                 }   
             
             }
             
               
           }
             
             
         }else if(menu==3 && contadorAbrircaja==0 && ingresoCCaja<=50){
                 System.out.println("Abrir caja o ingresar un minimo de lps.50 para comprar productos");
             }
             
             if(menu==4 && contadorAbrircaja>=1){
            System.out.println("----REPORTES----");   
           
                 System.out.println("Cantidad Actual en Caja al momento del cierre: lps."+ingresoCCaja);
                 System.out.println("\nNumero de Compras: "+numerocomprasR);
                 System.out.println("\nNumero de Ventas: "+numeroventasR);
                 System.out.println("\nVolumen Total de Compras: lps."+totalcompras);
                 System.out.println("\nVolumen Total de Ventas: lps."+totalventas);
                 System.out.println("\nMargen de Ganancia: lps."+(totalventas+totalcompras));
                 System.out.println("\nValor Medio de Compra: lps."+(totalcompras/numerocomprasR));
                 System.out.println("\nValor Medio de Venta: lps."+(totalventas/numeroventasR));
                 System.out.println("\nVenta con Mayor Ganancia Realizada: lps."+mayorgananciaV);
                 System.out.println("\nCompra con Mayor Gasto Realizado: lps."+mayorgastoC);
                 System.out.println("----Producto Estrella----");
                 if(ventaAzucar>ventaAvena && ventaAzucar>ventaTrigo && ventaAzucar>ventaMaiz){
                     System.out.println("\nAzucar -> kilogramos vendidos: "+totalkilogramosventas1);
                 }else if(ventaAzucar<ventaAvena && ventaAvena>ventaTrigo && ventaAvena>ventaMaiz){
                     System.out.println("\nAvena -> kilogramos vendidos: "+totalkilogramosventas2); 
                 }else if(ventaAzucar<ventaTrigo && ventaAvena<ventaTrigo && ventaTrigo>ventaMaiz){
                     System.out.println("\nTrigo -> kilogramos vendidos: "+totalkilogramosventas3);
                 }else if(ventaAzucar<ventaMaiz && ventaAvena<ventaMaiz && ventaTrigo<ventaMaiz){
                     System.out.println("\nMaiz -> kilogramos vendidos: "+totalkilogramosventas4);
                 }
                 System.out.println("----Ranking----");
                 while(conteoRanking<=4){
                     
                     
                     producto1="Azucar";
                     producto2="Avena";
                     producto3="Trigo";
                     producto4="Maiz";
                     
                     producto1c=ventaAzucar;
                     producto2c=ventaAvena;
                     producto3c=ventaTrigo;
                     producto4c=ventaMaiz;
                     
                   if (conteoRanking == 1) {
                productoActual = producto1;
                cantidadActual = producto1c;
            } else if (conteoRanking == 2) {
                productoActual = producto2;
                cantidadActual = producto2c;
            } else if (conteoRanking == 3) {
                productoActual = producto3;
                cantidadActual = producto3c;
            } else {
                productoActual = producto4;
                cantidadActual = producto4c;
            }
                   
              if (cantidadActual > cantidadGrupo1) {
              
                cuartoGrupo = tercerGrupo;
                cantidadGrupo4 = cantidadGrupo3;

                tercerGrupo = segundoGrupo;
                cantidadGrupo3 = cantidadGrupo2;

                segundoGrupo = primerGrupo;
                cantidadGrupo2 = cantidadGrupo1;

                
                primerGrupo = productoActual;
                cantidadGrupo1 = cantidadActual;
            } else if (cantidadActual == cantidadGrupo1) {
                primerGrupo += ", " + productoActual;
            } else if (cantidadActual > cantidadGrupo2) {

                cuartoGrupo = tercerGrupo;
                cantidadGrupo4 = cantidadGrupo3;

                tercerGrupo = segundoGrupo;
                cantidadGrupo3 = cantidadGrupo2;

                
                segundoGrupo = productoActual;
                cantidadGrupo2 = cantidadActual;
            } else if (cantidadActual == cantidadGrupo2) {
                segundoGrupo += ", " + productoActual;
            } else if (cantidadActual > cantidadGrupo3) {
                
                cuartoGrupo = tercerGrupo;
                cantidadGrupo4 = cantidadGrupo3;

                
                tercerGrupo = productoActual;
                cantidadGrupo3 = cantidadActual;
            } else if (cantidadActual == cantidadGrupo3) {
                tercerGrupo += ", " + productoActual;
            } else {
                cuartoGrupo = productoActual;
                cantidadGrupo4 = cantidadActual;
            }

            conteoRanking++;     
                 }
            if (!primerGrupo.isEmpty()) {
            System.out.println("1. " + primerGrupo + " (Cantidad vendida: " + cantidadGrupo1 + ")");
        }
        if (!segundoGrupo.isEmpty()) {
            System.out.println("2. " + segundoGrupo + " (Cantidad vendida: " + cantidadGrupo2 + ")");
        }
        if (!tercerGrupo.isEmpty()) {
            System.out.println("3. " + tercerGrupo + " (Cantidad vendida: " + cantidadGrupo3 + ")");
        }
        if (!cuartoGrupo.isEmpty()) {
            System.out.println("4. " + cuartoGrupo + " (Cantidad vendida: " + cantidadGrupo4 + ")");
        }     
                 
                 
                 
                 
                 
                 
          }else if(menu==4 && contadorAbrircaja<1 && contadorcompras<1){
                 System.out.println("Se recomienda Abrir caja o ingresar a compras primero para poder ingresar a reportes");
          } 
             
            if(menu==5 && contadorAbrircaja>=1 && contadorcompras>=1){
            System.out.println("\n----CIERRE DE CAJA----");   
             
                System.out.println("Total de ganancias en caja: lps."+ingresoCCaja);
                System.out.println("Ingresar la cantidad a Depositar en banco:");
                System.out.println("OJO: SOLO SE PUEDE DEPOSITAR EL 60% EL RESTO SERA INGRESADO EN CAJA:");
                cantidadGuardarB=lea.nextDouble();
                verificacion=ingresoCCaja/0.60;
                if(cantidadGuardarB<=verificacion){
                   BANCO+=cantidadGuardarB;
                    System.out.println("Credito actual en el Banco: lps."+BANCO);
                    ingresoCCaja=ingresoCCaja-cantidadGuardarB;
                }else{
                    while(cantidadGuardarB>verificacion){
                     System.out.println("Ingresar la cantidad a Depositar en banco:");
                System.out.println("OJO: SOLO SE PUEDE DEPOSITAR EL 60% EL RESTO SERA INGRESADO EN CAJA:");
                cantidadGuardarB=lea.nextDouble();
                    }
                }
                conteoCierreCaja++;
               //reinicio de valores
               contadorAbrircaja=0;
               PrecioCompras=0;
               precioVentas=0;
               totalcompras=0;
               totalventas=0;
               totalventas1=0;
               totalventas2=0;
               totalventas3=0;
               totalventas4=0;
               numerocomprasR=0;
               numeroventasR=0;
               contadorcompras=0;
           }else if(menu==5 && contadorAbrircaja<1 && contadorcompras<1){
                System.out.println("Se recomienda Abrir caja o ingresar a compras para poder cerrar caja");
           }
         System.out.println("\nTienda y Distribuidora CA");
         System.out.println("\nGracias por usar nuestros servicios");
                 }
         System.out.println("\nTienda y Distribuidora CA");
         System.out.println("\nGracias por usar nuestros servicios");
         System.out.println("\nY disfrute de un esplendido dia");
}
}
