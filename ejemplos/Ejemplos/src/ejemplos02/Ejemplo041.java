/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        int [][] arreglo1 = {{1,2,3}, {3,2,4}, {2,6,2}};
        int [][] arreglo2 = {{1,2,3}, {2,2,2}, {3,1,2}};
        int [][] respuesta = new int [3][3];
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo2.length; j++) {
                respuesta[i][j] = obtenerMultiplicacion(arreglo1[i][j], 
                        arreglo2[i][j]);
            }
        }
        presentarPantalla(arreglo1);
        presentarPantalla(arreglo2);
        presentarPantalla(respuesta);
    }
        
    public static int obtenerMultiplicacion(int a, int b){
        int mult;
        mult = a * b;
        return mult;
    }
    
    public static void presentarPantalla(int arregloa[][]){
        String cadena = "";
        for (int i = 0; i < arregloa.length; i++) {
            for (int j = 0; j < arregloa[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, 
                        arregloa[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
}
