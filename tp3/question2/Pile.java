package question2;

import question1.PilePleineException;
import question1.PileVideException;

/**
 * A remplacer en partie par votre classe Pile de la question 1.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile implements PileI {

    private Object[] zone;
    private int ptr;

    public Pile(int taille) {
        // traiter le cas <=0
        // a completer
        if(taille>0){
            zone = new Object[taille];
        }else{
            zone = new Object[CAPACITE_PAR_DEFAUT];
        }
        ptr=0;
    }

    public Pile() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        // a completer
        if(estPleine()){throw new PilePleineException();}
        zone[ptr++]=o;
    }

    public Object depiler() throws PileVideException {
        // a completer
        if(estVide()){ throw new PileVideException();}
        return zone[--ptr];
    }

    public Object sommet() throws PileVideException {
        // a completer
        if(estVide()){throw new PileVideException();}   
        return zone[ptr-1];
    }

    public int capacite() {
        // a completer
        return zone.length;
    }

    public int taille() {
        // a completer
        return ptr;
    }

    public boolean estVide() {
        // a completer
        return ptr==0;
    }

    public boolean estPleine() {
        // a completer
        return ptr == zone.length;
    }

    public boolean equals(Object o) {
        // a completer
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        // a completer
        String result = "[";
        for (int i = ptr - 1; i >= 0; i--) {
            result+=zone[i].toString();
            if (i > 0)
                result+=", ";
        }
        result+="]";
        return result;
    }
   
}