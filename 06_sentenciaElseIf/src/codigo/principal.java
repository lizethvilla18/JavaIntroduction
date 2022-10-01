
package codigo;

import java.util.Scanner;


public class principal {
    
    public static void main(String[] args) {
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
        if (numero == 1) {
            numeroTexto = "numero uno";
            
        }else if (numero ==2) {
            numeroTexto = "numero dos";
                    
        }else if (numero ==3) {
            numeroTexto = "numero tres";
                    
        }else if (numero == 4) {
            numeroTexto = "numero cuatro";
        }else if (numero == 5) {
            numeroTexto = "numero cinco";           
        }else {
            numeroTexto == "Opcion no valida";
        }
        System.out.println(numeroTexto);
    }
    
}
