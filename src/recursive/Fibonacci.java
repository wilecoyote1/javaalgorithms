/******************************************************************************
 * Compilation:  javac Fibonacci.java
 * Execution:    java Fibonacci
 * objet: la célèbre suite de Fibonacci est de la forme S(n) = s(n-1)+(n-2)
 * dans cette première itération, les opérandes seront uniquement des + et des -
 * exemple : la saisie de 123-76+14 me retournera la valeur 61
 ******************************************************************************/
package recursive;

import java.util.Scanner;

/**
 * Created by olemoigne on 17/03/16.
 */
public class Fibonacci {
    public static int  fibo(int i){
        if(i<=0){
            return 0;
        }
        if(i==1){
            return 1;
        } else {
            return fibo(i-1)+fibo(i-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une valeur :");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("la suite de Fibonnaci pour la valeur " + i + " est de : "+fibo(i));
    }
}
