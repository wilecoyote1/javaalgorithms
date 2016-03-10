package liste;

import tri.UtilTri;

/**
 * Created by olemoigne on 10/03/16.
 */
public class ListeChainee {

    private Noeud debut;
    private Noeud fin;

    public ListeChainee(){}

    public void add(Noeud noeud){
        if (debut == null){
            debut = noeud;
            fin = noeud;
            noeud.setSuivant(null);
        } else {
            fin.setSuivant(noeud);
            fin = noeud;
        }
    }

    @Override
    public String toString() {
        String string = "[";
        if(debut != null){
            Noeud courant = this.debut;
            while(courant != null){
                string += courant.getValeur()+", ";
                courant = courant.getSuivant();
            }
        }
        string += "]";
        return string;
    }

    public static void main(String[] args) {

        int[] tableau = UtilTri.getArrayAleatoire(10,50);
        ListeChainee listeChainee = new ListeChainee();
        for(int i = 0; i < tableau.length; i++){
            listeChainee.add(new Noeud(tableau[i]));
        }
        System.out.println("list : "+listeChainee);
    }
}
