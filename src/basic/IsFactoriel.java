/******************************************************************************
 * Compilation:  javac IsFactoriel.java
 * Execution:    java IsFactoriel
 * <p>
 * la factoriel d'un nombre est le produit de la multiplication de tous les nombres inférieurs
 * par exemple, la factoriel de 10 (noté 10!) est égale à 1x2x3x4x5x6x7x8x9x10
 * ce programme prend un nombre en paramètre et détermine s'il correspond à une factoriel
 * par exemple le chiffre 24 est la factoriel de 4
 ******************************************************************************/

package basic;

/**
 * Created by olemoigne on 06/03/16.
 */
public class IsFactoriel {
    private int factoriel;

    public IsFactoriel(int factoriel){
        this.factoriel = factoriel;
    }

    public int rechercheRacine(){
        for (int i=1 ; i < factoriel; i++){
            if(fact(i) == factoriel){
                return i;
            }
        }
        return 0;
    }

    /**
     * retourne la factoriel d'un nombre
     * @param i
     * @return
     */
    private int fact(int i){
        if(i>1){
            return i*fact(i-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        IsFactoriel isFactoriel = new IsFactoriel(24);
        System.out.println("la factoriel de 4 est : "+isFactoriel.fact(4));
        System.out.println("la recherche de la racine de 24 est : "+isFactoriel.rechercheRacine());
    }
}
