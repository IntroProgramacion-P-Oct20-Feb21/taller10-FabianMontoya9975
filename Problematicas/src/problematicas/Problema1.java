/*
    Dadas las notas de tres (3) estudiantes; generar una solución que permita
    encontrar el promedio de las calificaciones por cada conjunto de notas de
    los estudiantes. La problemática sugiere el uso de estructuras de datos.
    Las notas están en un arreglo bidimensional llamado notas; notas tiene
    3 filas y 4 columnas.

    9      10      7      8
    10     5       7      9
    7      9.4     10     9

    Los nombres de los estudiantes están en un arreglo unidimensional que
    tiene 3 elementos. El arreglo se llama estudiantes

    Jerry Ponce     Gabriela Lewis     David Bell

    Atención; los valores del arreglo notas de la fila del índice 0 pertenecen
    al estudiante del índice 0 del arreglo estudiantes; y así con cada fila de
    notas e índice de estudiantes

    Cada promedio de notas de un estudiante deberá ser almacenado en una
    posición de un arreglo unidimensional llamado promedios; resaltar que el
    arreglo promedios tendrá 3 elementos.

    Al final se debe presentar el siguiente reporte:

    Estudiante: Jerry Ponce tiene un promedio de 8,5
    Estudiante: Gabriela Lewis tiene un promedio de 7,75
    Estudiante: David Bell tiene un promedio de 8,85	
 */
package problematicas;

/**
 *
 * @author josef
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma;
        String cadenaFinal = "";
        double[][] valores = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] nombres = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedio = new double[3];
        for (int fila = 0; fila < nombres.length; fila++){
            suma = 0;
            for (int columna = 0; columna < valores[fila].length; columna++){
                //se suman las notas de una sola fila
                suma = suma + valores[fila][columna];
            }
            // Se calcila los promedios y se almacena los resultados en el
            // arreglo promedios[]
            promedio[fila] = suma / valores[fila].length;
        }
        // Se utiliza un ciclo repetitivo y una cadena acumulativa para
        // ir por cada arreglo y luego presentar los datos en pantalla
        for (int fila = 0; fila < nombres.length; fila++){
            cadenaFinal = String.format("%sEstudiante: %s tiene un promedio "
                    + "de %.3f\n",
                    cadenaFinal,
                    nombres[fila],
                    promedio[fila]);
        }
        /*
        Estudiante: Jerry Ponce tiene un promedio de 8,500
        Estudiante: Gabriela Lewis tiene un promedio de 7,750
        Estudiante: David Bell tiene un promedio de 8,850
        */
        System.out.printf("%s", cadenaFinal);
    }
    
}
