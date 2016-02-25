package basic;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * PGCD
 * le plus grand commun diviseur de deux nombre naturels est l'entier naturel le plus grand qui les divise tous les deux.
 * il est tel que pgcd(a,b) = pgcd(a-b,b) avec a>b = pgcd(a,b-a) avec a<b
 * nous utilisons ici la méthode des soustractions
 * Created by croquette on 21/02/2016.
 */
public class Pgcd {

    static final Logger log = Logger.getLogger(Pgcd.class.getName());


    private static int pgcd(int a, int b){
        while(a != b){
            if(a>b){
                a = a-b;
            } else {
                b = b-a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        log.addHandler(new ConsoleHandler());
        log.log(Level.INFO," le pgcd de 221 et 782 est");
        log.log(Level.INFO,pgcd(221,782)+"");

    }
}
