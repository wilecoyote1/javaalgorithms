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
    boolean isAnnuel;
    String periode;

    public AmortissementCredit(double taux, int n, int C,boolean isAnnuel) {
        this.isAnnuel = isAnnuel;
        if(isAnnuel){
            this.taux = taux;
            this.n = n;
            periode = "année";
        } else {
            this.taux = taux/12;
            this.n = n*12;
            periode = "mois";
        }
        this.C = C;

    }

    double calculAnnuité() {
        return C * taux / (1 - Math.pow(1 + taux, -n));
    }

    void printTableauAmortissement() {
        double _capitalrestant = C;
        double _annuite = this.calculAnnuité();

        String format = "%5s %20s %20s %20s %20s";
        System.out.printf(format,periode,"capital","annuité","intérêt","capital remboursé");
        System.out.println();

        format = "%5d %20.1f %20.1f %20.1f %20.1f";
        for(int i = 0;i<n;i++){
            double _interet = _capitalrestant * this.taux;
            double _capitalrembourse = _annuite-_interet;
            System.out.printf(format,i+1,_capitalrestant,_annuite,_interet,_capitalrembourse);
            System.out.println();
            _capitalrestant -= _capitalrembourse;
        }

    }

    public static void main(String[] args) {
        AmortissementCredit am = new AmortissementCredit(0.0385, 7, 70000,true);

        System.out.println(am.calculAnnuité());
        am.printTableauAmortissement();
    }

}
