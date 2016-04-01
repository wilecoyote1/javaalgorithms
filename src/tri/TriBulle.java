/******************************************************************************
 * Compilation:  javac TriInsertion.java
 * Execution:    java TriInsertion
 * Dependencies: UtilTri.java
 * <p>
 * on parcours le tableau du début à la fin et on compare les éléments 2 à 2. on les permute si le premier est supérieur au suivant.
 * on arrête lorsqu'il n'y a plus de permutation
 * <p>
 * par exemple, trions la liste 5 7 2 4 8
 * <p>
 * exemple d'itération
 * 5 7 2 4 8 (itération 1)
 * 5 2 4 7 8 (indice 2)
 * 2 5 4 7 8 (indice 3)
 * 2 4 5 7 8 (indice 4)
 * <p>
 * dans le meilleur des cas, si la liste est déjà trié, on fera n comparaison. Si par contre, dans le pire des cas, le tableau est complètement à l'envers, on fera
 * n2 comparaison
 */
package tri;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by croquette on 30/03/2016.
 */
public class TriBulle {

    /**
     * prend un tableau alï¿½atoire en paramï¿½tre et le retourne triï¿½, en utilisant l'algorithme de tri par sï¿½lection
     * ordinaire.
     *
     * @param array tableau alï¿½atoire ï¿½ trier
     * @param debug affiche les diffï¿½rentes ï¿½tapes du tri
     * @return le tableau triï¿½
     */
    public static int[] tribulle(int[] array, boolean debug) {

        int iteration = 0;
        boolean permutation = true;
        while (permutation) {

            if (debug) {
                System.out.println(Arrays.toString(array));
            }

            permutation = false;
            for (int i = 0; i < array.length - 1; i++) {
                iteration++;
                if (array[i] > array[i + 1]) {
                    int pivot = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = pivot;
                    permutation = true;
                }
            }
        }

        if (debug) {
            System.out.println("itération :" + iteration);
        }

        return array;
    }

    /**
     * trie par sï¿½lection sans mode debug
     * @param array
     * @return
     */
    public static int[] tribulle(int[] array) {
        return tribulle(array, false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre d'éléments du tableau :");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Veuillez saisir la valeur maximale du tableau :");
        int max = Integer.parseInt(sc.nextLine());

        System.out.println(Arrays.toString(tribulle(UtilTri.getArrayAleatoire(n, max), true)))
        ;
    }
}
