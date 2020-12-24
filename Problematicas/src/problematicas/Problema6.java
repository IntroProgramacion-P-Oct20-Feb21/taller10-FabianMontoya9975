/*
    Dado el siguiente arreglo

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                {"Carrie Burton", "Lauren Rice"},
                {"Emma Escobar", "Lori Flores"},
                {"Steven West", "Toni Martin"}
        };

    Imprima en pantalla a través de una variable acumuladora solo los
    estudiantes que tengan 11 caracteres (se cuentan también los espacios
    en blanco)
 */

package problematicas;

/**
 * 
 * @author josef
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadena = "";
        int numeroLetras;
        for (int fila = 0; fila < estudiantes.length; fila++){
            for (int columna = 0 ; columna < estudiantes[fila].length; 
                    columna++){
                // se almacena el numero de elementos que tiene
                // el arreglo estudiantes[fila][columna]
                numeroLetras = estudiantes[fila][columna].length();
                // Si el numero de numero de elemtos es igual a 11
                // ingrtesa al condicional
                if (numeroLetras == 11){
                    // Se acumulan los nombres que cumplen las condiciones
                    // para luego presentarlos en pantalla
                    cadena = String.format("%s%s\n",
                            cadena,
                            estudiantes[fila][columna]);
                }
            }
        }
        /*
        Lauren Rice
        Lori Flores
        Steven West
        Toni Martin
        */
        System.out.printf("%s", cadena);
    }

}
