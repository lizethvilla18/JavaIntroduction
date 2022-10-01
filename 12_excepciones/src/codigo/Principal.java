
package codigo;


public class Principal {
    
    public static void main(String[] args) {
      
        //*******************************
        //Definicion de variables
        //******************************
        int numero1, numero2, resultado;
        Scanner teclado;
        //******************************
        //*****************************
        //Creacion de objetos
        //****************************
        teclado = new Scanner(System.in);
        //*****************************
        //****************************
        //Capturar datos por teclado
        //****************************
        try {
            System.out.println("ingrese el numero 1:");
            numero1 = teclado.nextInt();
            
            System.out.println("ingrese el numero 2:");
            numero2 = teclado.nextInt();
            
            resultado = numero1/numero2;
            System.out.println("el resultado de la division es: " + resultado);
            
                    
        } catch (Exception e) {
            System.out.println("Ocurrio un error: ");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("se ejecuta siemore");
            
        }
    }
}
