package liste;

import tri.UtilTri;

import java.util.LinkedList;
import java.util.List;

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

    public void remove(Noeud noeud){
        if(debut != null){
            Noeud precedent = null;
            Noeud courant = this.debut;
            while(courant != null){
                if(noeud.getValeur()==courant.getValeur()){
                    if(precedent == null){ //la liste ne contient qu'un élément
                        debut = null;
                    } else {
                        precedent.setSuivant(courant.getSuivant());
                    }
                    break;
                }
                precedent = courant;
                courant = courant.getSuivant();
            }
        }

    }

    @Override
    public String toString() {
        String string = "[";
        if(debut != null){
            Noeud courant = this.debut;
            while(courant != null){
                if (courant.getSuivant() == null){
                    string += courant.getValeur();
                } else {
                    string += courant.getValeur()+", ";
                }
                courant = courant.getSuivant();
            }
        }
        string += "]";
        return string;
    }

    public static void main(String[] args) {



        int[] tableau = UtilTri.getArrayAleatoire(10,50);
        ListeChainee listeChainee = new ListeChainee();

        listeChainee.add(new Noeud(1));
        listeChainee.add(new Noeud(2));
        listeChainee.add(new Noeud(3));
        listeChainee.remove(new Noeud(2));
        System.out.println("list : "+listeChainee);
        listeChainee.remove(new Noeud(3));
        System.out.println("list : "+listeChainee);
        listeChainee.remove(new Noeud(1));
        System.out.println("list : "+listeChainee);

        for(int i = 0; i < tableau.length; i++){
            listeChainee.add(new Noeud(tableau[i]));
        }
        System.out.println("list : "+listeChainee);

        //test de performance entre mon implémenentation de liste et
        int[] tableau2 = UtilTri.getArrayAleatoire(10000000,50);
        ListeChainee listeChainee1 = new ListeChainee();
        List <Noeud>list = new LinkedList<Noeud>();

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < tableau2.length; i++){
            listeChainee1.add(new Noeud(tableau2[i]));
        }
        long finishTime = System.currentTimeMillis();

        System.out.println("That took: "+(finishTime-startTime)+ " ms");

        startTime = System.currentTimeMillis();
        for(int i = 0; i < tableau2.length; i++){
            list.add(new Noeud(tableau2[i]));
        }
        finishTime = System.currentTimeMillis();

        System.out.println("That took: "+(finishTime-startTime)+ " ms");

    }
}
