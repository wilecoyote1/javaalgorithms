/******************************************************************************
 * Compilation:  javac TriSelectionOrdinaire.java
 * Execution:    java TriSelectionOrdinaire
 * Dependencies: In.java StdIn.java StdOut.java
 * <p>
 * le principe du Tri par insertion est un des plus simple que l'on puisse imaginer :
 * vous parcourez la liste de valeur, de la premiÃ¨re Ã  la derniÃ¨re case, en recherchant la plus petite valeur. vous inversez ensuite la plus petite valeur avec
 * l'Ã©lement courant, vous avancez ensuite d'un dans la liste
 *
 * par exemple, trions la liste 5 7 2 4 8
 * on part de l'indice 0 et on recherche la plus petite valeur de la liste. Nous trouvons 2. Nous inversion alors le 5 avec le 2. Nous avancons alors Ã  l'indice
 * 1 et on recommence la boucle, jusqu'au dernier indice
 *
 * exemple d'itÃ©ration
 * 5 7 2 4 8 (indice 0)
 * 2 7 5 4 8 (indice 1)
 * 2 4 5 7 8 (indice 2)
 * 2 4 5 7 8 (indice 3)
 * 2 4 5 7 8 (indice 4)
 *
 * on voit rapidement que la complexitÃ© algorithmique est Ã©gale Ã  O(n). Dans tous les cas, on parcours tous les Ã©lÃ©ments de la liste
 ******************************************************************************/

package tri;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tri par insertion
 * Created by croquette on 02/03/2016.
 */
public class TriSelectionOrdinaire {

    /**
     * prend un tableau alï¿½atoire en paramï¿½tre et le retourne triï¿½, en utilisant l'algorithme de tri par sï¿½lection
     * ordinaire.
     *
     * @param array tableau alï¿½atoire ï¿½ trier
     * @param debug affiche les diffï¿½rentes ï¿½tapes du tri
     * @return le tableau triï¿½
     */
    public static int[] triSelectionOrdinaire(int[] array, boolean debug) {
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
     * trie par sï¿½lection sans mode debug
     * @param array
     * @return
     */
    public static int[] triSelectionOrdinaire(int[] array) {
        return triSelectionOrdinaire(array, false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre d'Ã©lÃ©ment du tableau :");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Veuillez saisir la valeur maximale du tableau :");
        int max = Integer.parseInt(sc.nextLine());

        System.out.println(Arrays.toString(triSelectionOrdinaire(UtilTri.getArrayAleatoire(n, max))))
        ;
    }
}
