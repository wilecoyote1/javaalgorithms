package tri;

import java.util.Arrays;

/**
 * Created by croquette on 02/03/2016.
 */
public class UtilTri {

    /**
     * fonction pour g�n�rer un tableau de valeur aleatoire
     *
     * @param n   nombre d'occurences
     * @param max valeur maximale al�toire possible
     * @return le tableau en entr�e tri�
     */
    public static int[] getArrayAleatoire(int n, int max) {
        int[] arrays = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * max + 1);
        }
        return arrays;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayAleatoire(23, 6)));
    }
}
