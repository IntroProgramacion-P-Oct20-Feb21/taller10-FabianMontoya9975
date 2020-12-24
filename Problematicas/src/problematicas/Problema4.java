/*
Realice un proceso que permita ingresar los valores por teclado
para el siguiente arreglo

double[][] datos = new double[2][2];
 */

package problematicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author josef
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double[][] datos = new double[2][2];
        /*
        0    0
        0    0
        */
        double valor;
        String cadena = "";
        for (int fila = 0; fila < datos.length; fila++){
            for (int columna = 0; columna < datos[fila].length; columna++){
                // Se pide ingresar valores por teclado
                System.out.println("Ingresar un valor numérico: ");
                valor = entrada.nextDouble();
                // El valor ingresado se le asigna a una posición del 
                // del arreglo datos[][]
                datos[fila][columna] = valor;
                cadena = String.format("%sPosición[%d][%d] = %.2f\n",
                        cadena,
                        fila,
                        columna,
                        datos[fila][columna]);
            }
        }
        System.out.printf("%s", cadena);
    }

}
