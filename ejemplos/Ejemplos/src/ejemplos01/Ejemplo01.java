/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // si el metodo tiene en su cabecera la palabra void significa que es 
        // un procedimiento
        // String miCiudad = obtenerCiudadMayuscula("Loja");
        obtenerMultiplicacion(2, 10); // asi se invoca la funcion
        String miMensaje = obtenerMultiplicacionDos(7, 50);
        // se tiene que declarar el mismo tipo de variable o se lo puede 
        // convertir Ej: int a = (int)c+b
        System.out.println(miMensaje);
        // System.out.printf("%s\n", miCiudad);
       
    }
    public static String obtenerMultiplicacionDos(int tabla, int limite){
        int valor;
        String cadena = "";
        for (int i = 0; i < limite; i++) {
            valor = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, 
                    tabla, i, valor);
        }
        return cadena;
    }
    
    public static String obtenerCiudadMayuscula(String m){
        String m2 = m.toUpperCase();
        return m2;
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){
        String cadena = "";
        int valor;
        for (int i = 0; i < limite; i++) {
            valor = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, 
                    tabla, i, valor);
            System.out.println(cadena);
            
        }
    }
    
    public static String obtenerNombre(){
        return "Luis";
    }
    
    
}
