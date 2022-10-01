
package codigo;

import java.util.Scanner;


public class Principal {
    
    public static void main(String[] args) {
        //*********************************
        //definicion de variables
        //********************************
        Scanner teclado;
        int numero;
        String numeroTexto;
        //********************************
        //********************************
        //creacion de objetos
        //********************************
        teclado = new Scanner(System.in);
        //********************************
        //********************************
        //capturar datos por teclado
        //********************************
        System.out.println("ingrese un numero entero: ");
        numero = teclado.nextInt();
        //********************************
        //********************************
        //logica de negocio
        //********************************
        switch (numero) {
            case 1:
                numeroTexto = "numero uno";
                break;
            
            case 2:
            numeroTexto = "numero dos";
            break;
            
            case 3:
            numeroTexto = "numero tres";
            break;
            
            case 4:
            numeroTexto = "numero cuatro";
            break;
            
            case 5:
            numeroTexto = "numero cinco";
            break;
            
            default:
                numeroTexto = "Opcion no valida";
                                
        }
     
         System.out.println(numeroTexto);
         
    }
    
}
