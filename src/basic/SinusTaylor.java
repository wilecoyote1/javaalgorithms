/******************************************************************************
 * Compilation:  javac SinusTaylor.java
 * Execution:    java SinusTaylor
 * <p>
 * On peut approcher la valeur de sinus par la formule de Taylor-Maclaurin
 * Sin(x) = x - x^3/3! + x^5/5!
 *
 ******************************************************************************/

package basic;

/**
 * Created by olemoigne on 07/03/16.
 */
public class SinusTaylor {
    public static void sinusTaylor(double valeur,double precision){
        double _sinus = valeur;
        double _sinus2 = 0;
        int pas = 3;
        int signe = 0;
        int iteration = 0;
        double _precision = Math.abs(_sinus-_sinus2);
        String format = "%4s %20s %20s";
        System.out.printf(format,"iteration","sinus","precision");
        System.out.println();

        format = "%4d %20.15f %20.15f";

        while (_precision>precision){
            if(signe == 0){
                _sinus -= Math.pow(valeur,pas)/fact(pas);
                signe = 1;
            } else {
                _sinus += Math.pow(valeur,pas)/fact(pas);
                signe = 0;
            }
            iteration++;
            _precision = Math.abs(_sinus-_sinus2);
            System.out.printf(format,iteration,_sinus,_precision);
            System.out.println();
            pas+=2;
            _sinus2 = _sinus;
        }
    }

    private static int fact(int i){
        if(i>1){
            return i*fact(i-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Calcul du sin de "+0.42+" par la fonction native java :"+Math.sin(0.42));
        System.out.println("Calcul du sin de " + 0.42 + " par la fonction sinus Taylor :");
        sinusTaylor(0.42,0.00001);
    }
}
