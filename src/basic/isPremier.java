/******************************************************************************
 * Compilation:  javac isPremier.java
 * Execution:    java isPremier
 * <p>
 * objectif
 * un nombre premier est un nombre strictement supérieur à 1 et qui n'est divisible (au sens de la division entière)
 * que par 1 et par lui même. Ainsi, 1,2 3 sont des nombres premiers. 4 est divisible par 2 donc n'est pas premier
 *
 * méthode
 * nous allons diviser notre nombre par tous les nombres inférieurs. Si le reste de la division est égale à 0
 * ce n'est pas un nombre premier
 ******************************************************************************/

package basic;

import tri.UtilTri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by olemoigne on 09/03/16.
 */
public class isPremier {

    public static boolean isPremier(int valeur){
        int reste = 0;
        int iteration = 0;
        for(int i= 2; i< valeur; i++){
            iteration++;
            if (valeur % i == 0) {
                System.out.println("le nombre "+valeur+" n'est pas un nombre premier, il est divisible par "+i+" , résultat obtenu en "+iteration+" itérations");
                return false;
            }
        }
        System.out.println("le nombre "+valeur+" est un nombre premier, résultat obtenu en "+iteration+" itérations");
        return true;
    }

    public static List<Integer> recherchePremier(int nombreRecherche){
        List<Integer> resultat = new ArrayList<Integer>();
        int nbtrouve = 0;
        int i = 2;
        while(resultat.size() < nombreRecherche){
            if (isPremier(i)){
                resultat.add(i);

            }
            i++;
        }
        return resultat;
    }

    public static void main(String[] args) {
        isPremier(4);
        isPremier(13);
        isPremier(1000000001);
        System.out.println("la recherche des 10 premiers nombre premier est  "+ Arrays.toString(recherchePremier(10).toArray()));
    }
}
