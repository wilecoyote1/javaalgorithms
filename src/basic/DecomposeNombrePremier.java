/******************************************************************************
 * Compilation:  javac DecomposeNombrePremier.java
 * Execution:    java DecomposeNombrePremier
 * objet: un petit rappel mathématique :
 * "Tout entier naturel N supérieur ou égal à 2 est décomposable en un produit de facteurs premiers. Cette décomposition est unique"
 * si nous prenons le chiffre 240, sa décomposition en nombre premier est de 2x2×2×2×3×5

 ******************************************************************************/

package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by olemoigne on 17/03/16.
 */
public class DecomposeNombrePremier {

    private static String decomposition(int i){
        String decomp = "";
        int reste = i;

        //on recherche les nombres premiers inférieurs à i
        List<Integer>premiers = recherchePremierInferieur(i);
        while(reste>1){
            for(Integer x : premiers){
                if (reste % x == 0){
                    decomp += x+" x ";
                    reste = reste / x;
                    System.out.println("reste "+reste+" "+x);
                    break;
                }
            }
        }

        return decomp;
    }

    public static boolean isPremier(int valeur){
        int reste = 0;
        int iteration = 0;
        for(int i= 2; i< valeur; i++){
            iteration++;
            if (valeur % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * retourne les nombres premiers inférieur ou égale à une valeur
     * par exemple, pour la valeur 10, cette fonction retourne 2,3,5,7
     * @param j
     * @return
     */
    public static List<Integer> recherchePremierInferieur(int j){
        List<Integer> resultat = new ArrayList<Integer>();
        int nbtrouve = 0;
        int i = 2;
        while(i < j){
            if (isPremier(i)){
                resultat.add(i);
            }
            i++;
        }
        return resultat;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une valeur :");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("la décomposition en nombre premier de " + i + " est de : "+decomposition(i));
    }
}
