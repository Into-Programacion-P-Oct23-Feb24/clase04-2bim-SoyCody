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
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        int n;
        String mensajeSumaDos;
        int m;

        for (int i = 1; i <= 10; i++) {
            n = i;
            mensajeSuma = obtenerTablaSumar(10, n);
            System.out.printf("%s\n", mensajeSuma);
        }

        for (int i = 1; i <= 10; i++) {
            m = i;
            mensajeSumaDos = obtenerTablaMultiplicar(10, m);
            System.out.printf("%s\n", mensajeSumaDos);
        }
    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, 
                    tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, 
                    tabla, i,
                    operacion);
        }
        return cadena;

    }

}
