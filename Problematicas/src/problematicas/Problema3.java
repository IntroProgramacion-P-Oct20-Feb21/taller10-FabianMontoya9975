/*
    Dado los siguiente arreglos; llene el arreglo notasCualitativas
    relacionando las posiciones del arreglo notasCuantitativas.
    Tomar en consideración lo siguiente

	String[][] notasCualitativas = new String[3][3];
	double[][] notasCuantitativas = {{7.1, 8, 10},
                {3, 7, 9}, {10, 9, 2.1}};
        
        
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
        
 */
package problematicas;

/**
 *
 * @author josef
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10},
        {3, 7, 9}, {10, 9, 2.1}};
        double nota;
        String cadenaFinal = "";
        /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
         */
        for (int fila = 0; fila < notasCualitativas.length; fila++) {
            for (int columna = 0; columna < notasCualitativas[fila].length;
                    columna++) {
                nota = notasCuantitativas[fila][columna];
                // Se compara las notas con el rango establecido para
                // asignar una nota cualitativa dependiendo el caso
                if ((nota >= 0) && (nota <= 2.9)) {
                    notasCualitativas[fila][columna] = "Insuficiente";
                } else {
                    if ((nota >= 3) && (nota <= 4.9)) {
                        notasCualitativas[fila][columna] = "Regular";
                    } else {
                        if ((nota >= 5) && (nota <= 7.9)) {
                            notasCualitativas[fila][columna] = "Buena";
                        } else {
                            if ((nota >= 8) && (nota <= 9.5)) {
                                notasCualitativas[fila][columna] = "Muy Buena";
                            } else {
                                if ((nota >= 9.6) && (nota <= 10)) {
                                    notasCualitativas[fila][columna] = 
                                            "Sobresaliente";
                                }
                            }
                        }
                    }
                }
                // Los datos asignados las posiciones de los arreglo0s se
                // los acumula en una cadena para luego ser presentados en 
                // pantalla
                cadenaFinal = String.format("%s%.2f = %s\n",
                        cadenaFinal,
                        notasCuantitativas[fila][columna],
                        notasCualitativas[fila][columna]);
            }
        }
        /*
        7,10 = Buena
        8,00 = Muy Buena
        10,00 = Sobresaliente
        3,00 = Regular
        7,00 = Buena
        9,00 = Muy Buena
        10,00 = Sobresaliente
        9,00 = Muy Buena
        2,10 = Insuficiente
        */
        System.out.printf("%s", cadenaFinal);
    }

}
