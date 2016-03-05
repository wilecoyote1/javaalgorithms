/******************************************************************************
 * Compilation:  javac AmortissementCredit.java
 * Execution:    java AmortissementCredit
 * <p>
 * affiche le tableau d'amortissement d'un crédit à taux fixe et annuité constante
 * le principe d'un crédit immobilier est le suivant :
 * l'assurance est un taux mensuel appliqué au capital initial
 * la mensualité hors assurance (M) est calculé en fonction du nombre de mois restant (N), du capital restant dû (C)
 * à l'échéance précédente, du taux d'intérêt mensuel hors assurance
 * <p>
 * a = C x i / (1 - (1+i)^-n)
 ******************************************************************************/

package basic;

/**
 * Created by croquette on 05/03/2016.
 */
public class AmortissementCredit {

    Double taux;
    int n;
    int C;

    public AmortissementCredit(double taux, int n, int C) {
        this.taux = taux;
        this.n = n;
        this.C = C;
    }

    public static void main(String[] args) {
        AmortissementCredit am = new AmortissementCredit(0.0385 / 12, 7 * 12, 70000);

        System.out.println(am.calculAnnuité());
    }

    double calculAnnuité() {
        return C * taux / (1 - Math.pow(1 + taux, -n));
    }

    void printTableauAmortissement() {
        System.out.println("capital");

    }
}
