
package codigo;


public class Principal {
    
    public static void main(String[] args) {
        //*************************************
        //Definicion de variables
        //*************************************
        int cantidadEstudiantes;
        String nombreEstudiante;
        Double nota1, nota2, nota3;
        Scanner teclado;
        //************************************
        //************************************
        //Creacion de objetos
        //************************************
        //************************************
        teclado = new Scanner(System.in);
        //************************************
        System.out.println("A cuantos estudiantes desesas calcular la nota final?");
        cantidadEstudiantes = teclado.nextInt();
        
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("ingrese el nombre del estudiante" + i + ":");
            nombreEstudiante = teclado.next();
            
            nota1 = leerNota(1);
            nota2 = leerNota(2);
            nota3 = leerNota(3);
            
            notaFinal = calcularNotaFinal(nota1, nota2, nota3, nombreEstudiante);
            imprimirResultado(nota1, nota2, nota3,notaFinal, nombreEstudiante);
            
        }
    }
    
    public static double leerNota(int numeroNota) {
        Scanner teclado;
        double nota;
        teclado = new Scanner(System.in);
        
        System.out.println("ingrese la nota" + numeroNota + ":");
        nota = teclado.nextDouble();
        
        while (nota < 0 || nota >5) {
        System.out.println("error: el rango de la nota debe estar entre 0 y 5");
        System.out.println("ingrese la nota" + numeroNota + ":");
        nota = teclado.nextDouble();
        
        }
        
        return nota;
    }
    
    public stati double calcularNotaFinal(double nota1 double nota2, double nota3, String estudiante) {
        double notaFinal1, notaFinal2, notaFinal3, definitivaNota;
        notaFinal1 = nota1 * 30/100;
        notafinal2 = nota2 * 30/100;
        notafinal3 = nota3 * 30/100;
        notaDefinitiva = notaFinal1 + notaFinal2 + notaFinal3;
        
        return definitivaNota;
        
    }
    
    public static void imprimirResultado(double nota1, double nota2, double nota3, double definitiva, String estudiante);
    String mensaje;
    
    mensaje = "**********************************\n";
    mensaje += "reporte de nota del estudiante" + estudiante + "\n";
    mensaje += "**********************************\n";
    mensaje += "Nota 1:" + nota1 + "\n";
    mensaje += "Nota 2:" + nota2 + "\n";
    mensaje += "Nota 3:" + nota3 + "\n";
    mensaje += "Definitiva" + definitiva + "\n";
    if (definitiva >=3) {
        mensaje +="aprobo la materia\n"
}else {
    
}
}
