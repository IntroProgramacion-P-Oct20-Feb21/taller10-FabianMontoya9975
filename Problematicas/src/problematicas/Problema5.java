/*
    Dado el siguiente arreglo

            String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                    {"Carrie Burton", "Lauren Rice"},
                    {"Emma Escobar", "Lori Flores"},
                    {"Steven West", "Toni Martin"}
            };
    Imprima en pantalla a través de una variable acumuladora solo los
    estudiantes que tienen como primera letra S,P,T
 */
package problematicas;

/**
 *
 * @author josef
 */
public class Problema5 {

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
        String nombre;
        char inicial;
        String cadena = "";
        for (int fila = 0; fila < estudiantes.length; fila++) {
            for (int columna = 0; columna < estudiantes[fila].length;
                    columna++) {
                // Se extrae cada nombre
                nombre = estudiantes[fila][columna];
                // A partir del nombre extraido, se extrae la inicial
                inicial = nombre.charAt(0);
                // Se compara La inicial con Las tras S, P y T 
                // En caso de ser verdadera la condición el nombre se
                // acumulará en una cadena para luego ser presentada en 
                // pantalla
                switch (inicial) {
                    case 'S':
                    case 'P':
                    case 'T':
                        cadena = String.format("%s%s\n",
                                cadena,
                                estudiantes[fila][columna]);
                        break;
                }
            }
        }
        /*
        Sarah Ward
        Philip Payne
        Steven West
        Toni Martin
        */
        System.out.printf("%s", cadena);
    }

}
