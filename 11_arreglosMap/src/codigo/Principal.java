
package codigo;

import java.util.Collection;


public class Principal {
    
    public static void main(String[] args) {
       
       //**********************************
       //Definicion de arreglo tipo map o arreglo asociativo
       //***********************************
       HashMap miMapa;
       //***********************************
       //***********************************
       //Creacion dhobjetos
       //***********************************
       miMapa = new HashMap();
       //***********************************
       //**********************************
       //Agregar elementos al arreglo
       miMapa.put("nombre_persona", "CARLOS ANDRES");
       miMapa.put("EDAD_persona", "25");
       miMapa.put("celular_persona", 31566440490L);
       miMapa.put("email_persona", "lizeth18villa@gmail.com");
       //****************************************
       //**************************************
       //Acceder a los valores del arreglo
       //****************************************
       String nombrePersona = (String) miMapa.get("nombre_persona");
       int edadPersona = (int) miMapa.get("edad_persona");
       long celularPersona = (long) miMapa.get("celular_persona");
       String emailPersona = (String) miMapa.get("email_persona");
       //*************************************************
       //Recorrer el arreglo con un ciclo
       //***********************************
        System.out.println("impre las claves de arreglo");
        imprimir(miMapa.keySet());
        System.out.println("imprime los valores del arreglo");
        imprimit(miMapa.values());
    }   
    
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento ->) {
            = System.out.println("elemento = " + elemento);
     
    }
    
    }
}
