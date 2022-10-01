
package codigo;


public class Principal {
    
    public static void main(String[] args) {
     //**********************************
     //definicion de arreglos primitivos
     //*********************************
     int edades[] = new int [8];
     System.out.println("longitud del arreglo:" + edades.length);

     //********************************
     //********************************
     //modificar las posiciones con valores
     //********************************
     edades[0] = 35;
     edades[1] = 32;
     edades[2] = 24;
     edades[3] = 50;
     edades[4] = 46;
     edades[5] = 10;
     edades[6] = 1;
     edades[7] = 16;
     //********************************
     //********************************
     //acceder a los valores indexacion o las posiciones
     //********************************
        System.out.println("edades 0 = " + edades [0]);
        System.out.println("edades 2 = " + edades [2]);
        System.out.println("edades 4 = " + edades [4]);
     //********************************
     //********************************
     //recorrer arreglo con ciclo for
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades posicion " + i ":" + edades[i]);
            
        }
        
        //***********************************
        //**********************************
        //llenar arreglo con ciclo for
        //********************************
        float notas[] = new float[15];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = i+i;
        
        }
        
        System.out.println("*********************");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas posicion " + i + ":" + notas[i]);
        }
        
        //************************************
        //************************************
        //Definir el arreglo con datos 
        //***********************************
        String frutas[] = {"naranja", "banano", "uva", "mango", "mandarina"};
            System.out.println("frutas posicion " + i + ":" + frutas[i]);
            
        //*************************************
        
    }
}
