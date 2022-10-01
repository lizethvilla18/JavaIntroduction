
package codigo;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        //********************************
        //definicion de variables
        //*******************************
        Scanner teclado; 
        String nombreEstudiante, apellidoEstudiante, direccionEstudiante, emailEstudiante, mensaje;
        Long celularEstudiante;
        byte edadEstudiante;
        //********************************
        //********************************
        //creacion de objetos
        //********************************
        teclado = new Scanner(System.in);
        //********************************
        //********************************
        //capturar datos por teclado
        //********************************
        System.out.println("ingrese su nombre: ");
        nombreEstudiante = teclado.nextLine();
        
        System.out.println("------>" + nombreEstudiante);
        
        System.out.println("ingrese sus apellidos: ");
        apellidoEstudiante = teclado.nextLine();
        
        System.out.println("ingrese su email: ");
        emailEstudiante = teclado.nextLine();
        
        System.out.println("ingrese su direccion: ");
        direccionEstudiante = teclado.nextLine();
        
        System.out.println("ingrese su numero de celular: ");
        celularEstudiante = teclado.nextLong();
        
        System.out.println("ingrese su edad: ");
        edadEstudiante = teclado.nextByte();
        //*****************************************
        //****************************************
        //imprimir por pantalla
        //*****************************************
        mensaje = "*************************\n";
        mensaje +="DATOS ESTUDIANTE\n";
        mensaje += "*************************\n";
        mensaje += "NOMBRE ESTUDIANTE: " + nombreEstudiante + "" + apellidoEstudiante + "\n";
        mensaje += "DIRECCION ESTUDIANTE: " + direccionEstudiante + "\n";       
        mensaje += "EMAIL ESTUDIANTE: " + emailEstudiante + "\n"; 
        mensaje += "CELULAR ESTUDIANTE: " + celularEstudiante + "\n"; 
        mensaje += "EDAD ESTUDIANTE: " + edadEstudiante + "\n"; 
        System.out.println(mensaje);
        
    }
    
}
