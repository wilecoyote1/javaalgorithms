package liste;

/**
 * Created by olemoigne on 10/03/16.
 */
public class Noeud {
    private int valeur;
    private Noeud suivant;

    public Noeud(int valeur){
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }
}
