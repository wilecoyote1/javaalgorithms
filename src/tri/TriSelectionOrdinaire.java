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

/**
 * Tri par insertion
 * Created by croquette on 02/03/2016.
 */
public class TriSelectionOrdinaire {

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

    public static int[] run(int[] array) {
        return runDebug(array, false);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(run(UtilTri.getArrayAleatoire(10, 50))));
    }
}
