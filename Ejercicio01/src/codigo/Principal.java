
package codigo;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        //**********************************
        //Definicion de variables
        //**********************************
        int cantidadFacturas;
        Double subtotalFactura, ivaFactura, reteFuente, reteIva, reteIca,calcularRetefuente;
        Scanner teclado;
        //*********************************
        //********************************
        //Creacion de objetos
        //*******************************
        teclado = new Scanner(System.in);
        //*******************************
        
        System.out.println("A cuantas facturas deseas calcular las retenciones?");
        cantidadFacturas = teclado.nextInt();
        
        for (int i = 0; i < cantidadFacturas; i++) {
            System.out.println("ingrese el subtotal para la factura" + i + ":");
            subtotalFactura = teclado.nextDouble();
            
            System.out.println("ingrese el iva para la factura"+ i + ":");
            ivaFactura = teclado.nextDouble();
            
            reteFuente = calcularRetefuente (subtotalFactura);
            reteIva = calcularReteIva (subtotalFactura);
            reteIca = calcularReteIca (subtotalFactura);
            
            imprimirValores(subtotalFactura, ivaFactura, reteFuente, reteIva, reteIca);
            
        }
    }
    
    public static double calcularReteFuente(double subtotal){
     double valorReteFuente;
     valorReteFuente = subtotal * 3.5/100;
     return valorReteFuente;
    }
    
    public static double calcularReteIva(double subtotal){
     double valorReteIva;
     valorReteIva = subtotal * 3.5/100;
     return valorReteIva;
    }
    
    
    public static double calcularReteIca(double subtotal){
     double valorReteIca;
     valorReteIca = subtotal * 3.5/100;
     return valorReteIca;
     
     
    }
    
    public static void imprimirValores(double subtotal, double iva, double reteFuente, double reteiva, double reteica) {
        String mensaje;
        
        mensaje = "****************************************\n";
        mensaje += "DETALLE DE LAS RETENCIONES DE LAS FACTURAS\n";
        mensaje += "*************************************\n";
        mensaje += "SUBTOTAL FACTURA: " + subtotalFactur +"\n";
        mensaje += "IVA FACTURA: " + iva +"\n";
        mensaje += "RETE FUENTE FACTURA: " + reteFuente +"\n";



    }
}
