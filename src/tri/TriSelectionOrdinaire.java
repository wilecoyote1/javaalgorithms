/******************************************************************************
 * Compilation:  javac TriSelectionOrdinaire.java
 * Execution:    java TriSelectionOrdinaire
 * Dependencies: In.java StdIn.java StdOut.java
 * <p>
 * le principe du Tri par insertion est un des plus simple que l'on puisse imaginer :
 * vous parcourez la liste de valeur, de la première à la dernière case, en recherchant la plus petite valeur
 ******************************************************************************/

package tri;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

/**
 * Tri par insertion
 * Created by croquette on 02/03/2016.
 */
public class TriSelectionOrdinaire {

    static final Logger log = Logger.getLogger(TriSelectionOrdinaire.class.getName());
    static final ConsoleHandler consoleHandler = new ConsoleHandler();


    /**
     * prend un tableau aléatoire en paramètre et le retourne trié, en utilisant l'algorithme de tri par sélection
     * ordinaire.
     *
     * @param array tableau aléatoire à trier
     * @param debug affiche les différentes étapes du tri
     * @return le tableau trié
     */
    public static int[] runDebug(int[] array, boolean debug) {
        for (int i = 0; i < array.length; i++) {
            if (debug) {
                System.out.println(Arrays.toString(array));
            }
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int pivot = array[i];
            array[i] = array[min];
            array[min] = pivot;
        }
        return array;
    }

    /**
     * trie par sélection sans mode debug
     * @param array
     * @return
     */
    public static int[] run(int[] array) {
        return runDebug(array, false);
    }

    public static void main(String[] args) {
        log.addHandler(consoleHandler);
        log.fine(Arrays.toString(run(UtilTri.getArrayAleatoire(10, 50))));
    }
}
