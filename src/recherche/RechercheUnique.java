/******************************************************************************
 * Compilation:  javac RechercheUnique.java
 * Execution:    java RechercheUnique
 * Dependencies: In.java StdIn.java StdOut.java
 * <p>
 * Nous recherchons dans un tableau tous les éléments uniques
 * exemple : si on prend en entrée le tableau suivant : [ 1, 2, 3, 1, 2] le tableau final sera [1, 2, 3]
 ******************************************************************************/

package recherche;

import tri.UtilTri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by olemoigne on 04/03/16.
 */
public class RechercheUnique {
    public static int[] run(int[] array) {

        List<Integer> _listunique = new ArrayList<Integer>();


        for (int anArray : array) {
            boolean exist = false;

            for (Integer a_listunique : _listunique) {
                if (a_listunique == anArray) {
                    exist = true;
                }
            }
            if (!exist) {
                _listunique.add(anArray);
            }

        }
        return toIntArray(_listunique);
    }

    /**
     * fonction utilitare pour convertir une list d'Integer en tableau de int
     * @param list
     * @return tableau de int
     */
    private static int[] toIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = list.get(i);
        return ret;
    }



    public static void main(String[] args) {

        int[] array = UtilTri.getArrayAleatoire(100, 50);
        System.out.println("liste de départ :");
        System.out.println(Arrays.toString(array));

        System.out.println("liste unique :");
        System.out.println(Arrays.toString(run(array)));
    }
}
