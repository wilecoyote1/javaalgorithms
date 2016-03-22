/******************************************************************************
 * Compilation:  javac Calculette.java
 * Execution:    java Calculette
 * objet: création d'une calculette simplifiée. Je dois pouvoir saisir une opération arithmétique, le programme java me retourne le résultat de l'opéréation
 * dans cette première itération, les opérandes seront uniquement des + et des -
 * exemple : la saisie de 123-76+14 me retournera la valeur 61
 ******************************************************************************/

package basic;

import java.util.Scanner;

/**
 * Created by olemoigne on 17/03/16.
 */
public class Calculette {
    public static int calculette(String in){
        int total = 0;

        String nombre = "";
        char operation = '+';

        nombre += in.charAt(0);

        for (int i = 1; i < in.length() ; i++) {
            char car = in.charAt(i);
            if (car == ' '){
                total += ajout(operation,nombre);
                nombre = "";
                //operation = '+';
            }
            else if(car == '+'){
                total += ajout(operation,nombre);
                nombre = "";
                operation = '+';
            }
            else if(car == '-'){
                total += ajout(operation,nombre);
                nombre = "";
                operation = '-';
            } else {
                nombre += car;
            }
        }

        //dernière opération
        total += ajout(operation,nombre);

        return total;
    }

    private static int ajout(char operation,String nombre){
        if((nombre == null)||(nombre=="")){
            return 0;
        }
        if(operation == '+'){
            return Integer.parseInt(nombre);
        } else {
            return -Integer.parseInt(nombre);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une opération :");
        String s = sc.nextLine();
        System.out.println("la somme de " + s + " est de : "+ calculette(s));

    }
}
