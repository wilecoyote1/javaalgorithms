/******************************************************************************
 * Compilation:  javac Base8.java
 * Execution:    java Base8
 * <p>
 * objectif
 * cette fonction convertie un nombre de la base 10 (que nous utilisons habituellement !) en base 8
 * si nous prenons par exemple le chiffre 2500, en base 8 ce chiffre est maintenant de 4704
 * au lien suivant vous avez accès à une calculatrice http://wims.unice.fr/wims/wims.cgi
 * méthode
 * nous allons procéder par une suite de division entière en cascade
 * si nous appliquons 2500 / 8 = 312, reste 4
 * ensuite 312 / 8 = 39, reste 0
 * ensuite 39 / 8 = 4, reste 7
 * et pour finir 4/ 8 = 0 reste 4
 ******************************************************************************/
package basic;

/**
 * Created by olemoigne on 09/03/16.
 */
public class Base8 {

    public static int calculBase8(int valeur){
        String resultat = "";
        int partieentiere = valeur;
        while (valeur != 0){
            partieentiere= valeur / 8;
            int reste = valeur %8;
            resultat = reste + resultat;
            valeur = partieentiere;
        }
        //System.out.printf(partieentiere+"");
        //resultat = partieentiere%8 + resultat;

        return Integer.parseInt(resultat);
    }

    public static void main(String[] args) {
        System.out.println("le nombre 2500 en base 8 est égale à :"+calculBase8(2500));
    }
}
