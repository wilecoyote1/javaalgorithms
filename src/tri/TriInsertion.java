/******************************************************************************
 * Compilation:  javac TriInsertion.java
 * Execution:    java TriInsertion
 * Dependencies: UtilTri.java
 * <p>
 * c'est le principe du tri du joueur de carte. On prend les cartes du  début à la fin. A chaque carte, on recherche sa place dans la liste on l'insère
 * vous parcourez la liste de valeur, de la premiÃ¨re Ã  la derniÃ¨re case, en recherchant la plus petite valeur. vous inversez ensuite la plus petite valeur avec
 * l'Ã©lement courant, vous avancez ensuite d'un dans la liste
 * <p>
 * par exemple, trions la liste 5 7 2 4 8
 * on part de l'indice 1 et on recherche on insèrer la valeur. Elle est à la bonne place, on la laisse en seconde position.
 * on repart de la valeur 2 et on la place en première position. on poursuit sur toute la liste
 * 1 et on recommence la boucle, jusqu'au dernier indice
 * <p>
 * exemple d'itération
 * 5 7 2 4 8 (indice 1)
 * 2 5 7 4 8 (indice 2)
 * 2 4 5 7 8 (indice 3)
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
public class TriInsertion {

    /**
     * prend un tableau alï¿½atoire en paramï¿½tre et le retourne triï¿½, en utilisant l'algorithme de tri par sï¿½lection
     * ordinaire.
     *
     * @param array tableau alï¿½atoire ï¿½ trier
     * @param debug affiche les diffï¿½rentes ï¿½tapes du tri
     * @return le tableau triï¿½
     */
    public static int[] triInsertion(int[] array, boolean debug) {

        int iteration = 0;

        for (int i = 1; i < array.length; i++) {

            iteration++;

            if (debug) {
                System.out.println(Arrays.toString(array));
            }

            int j = i - 1;
            int courant = i;
            while (j >= 0 && array[courant] < array[j]) {
                iteration++;
                int pivot = array[courant];
                array[courant] = array[j];
                array[j] = pivot;
                j--;
                courant--;
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
    public static int[] triInsertion(int[] array) {
        return triInsertion(array, false);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre d'éléments du tableau :");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Veuillez saisir la valeur maximale du tableau :");
        int max = Integer.parseInt(sc.nextLine());

        System.out.println(Arrays.toString(triInsertion(UtilTri.getArrayAleatoire(n, max), true)))
        ;
    }
}
