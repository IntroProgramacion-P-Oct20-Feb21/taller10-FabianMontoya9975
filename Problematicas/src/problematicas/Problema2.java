/*
    Se requiere ingresar las ventas totales diaras de 2 vendedores; realizadas
    de lunes a viernes. Los vendedores están representados en una estructura
    unidimensional de dos elementos. El arreglo se llama vendedores 

    Jessica Cole     Robert Wallace

    El arreglo bimensional que permitirá almacenar las ventas diarias tiene
    2 filas y 5 columnas. El arreglo se llama ventas

    0     0     0     0     0
    0     0     0     0     0

    Existe una relación entre el índice 0 del arreglo vendedores y
    la fila de índice 0 del arreglo ventas.

    Luego de ingresar los valores se necesita presentar el total de ventas
    de todos los vendedores de la siguiente forma:

    Vendedor(a) Jessica Cole	
    Vendedor(a) Robert Wallace
    Ha realizado un total de ? en ventas.
 */

package problematicas;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author josef
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        int[][] ventas = new int[2][5];
        /*
        0     0     0     0     0
        0     0     0     0     0
        */
        int suma = 0;
        int valor;
        String cadenaFinal = "";
        for (int fila = 0; fila < ventas.length; fila++){
            // Se indica sobre que vendedor dse van a ingresar el numero
            // de ventas
            System.out.printf("Ingresar valor de ventas diarias de %s:\n",
                    vendedores[fila]);
            for (int columna = 0; columna < ventas[fila].length; columna++){
                // Se pide ingresar las ventas de cada día
                System.out.printf("Ventas Día %d:\n",
                        (columna + 1));
                valor = entrada.nextInt();
                ventas[fila][columna] = valor;
                // Se suman el numero de ventas de los dos vendedores en
                // los 5 días
                suma = suma + ventas[fila][columna];
            }
                
        }
        for (int fila = 0; fila < ventas.length; fila++){
            cadenaFinal = String.format("%sVendedor(a) %s\n",
                    cadenaFinal,
                    vendedores[fila]);
        }
        cadenaFinal = String.format("%sHa realizado un total de %d en "
                + "ventas.\n",
                cadenaFinal,
                suma);
        /*
        Vendedor(a) Jessica Cole
        Vendedor(a) Robert Wallace
        Ha realizado un total de 86 en ventas.
        */
        System.out.printf("%s", cadenaFinal);
    }

}
