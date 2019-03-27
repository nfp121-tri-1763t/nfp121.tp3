package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;
    private int taille;

    public Pile3() {
        this(0);
    }

    public Pile3(int taille) {
        // traiter le cas <=0
        // à compléter
        if(taille>0){
          v=new Vector<Object>(taille);}
          else{v=new Vector<Object>(CAPACITE_PAR_DEFAUT);}
          this.taille=0;
    }

    public void empiler(Object o) throws PilePleineException {
        // à compléter
        if(taille==v.capacity()){throw new PilePleineException();}
           v.add(taille++, o);
    }

    public Object depiler() throws PileVideException {
        // à compléter
       if(taille==0) { throw new PileVideException();} 
        return v.get(--taille);
    }

    public Object sommet() throws PileVideException {
        // à compléter
        if(taille==0){throw new PileVideException();}
            return v.get(taille-1);
       
    }

    public int taille() {
        // à compléter
        return taille;
    }

    public int capacite() {
        // à compléter
        return v.capacity();
    }

    public boolean estVide() {
        // à compléter
        return taille==0;
    }

    public boolean estPleine() {
        // à compléter
        return taille==v.capacity();
    }

    public String toString() {
        // à compléter
        String s = "[";
         
        for(int i=taille-1;i>=0;i--){
            s+=v.get(i).toString();
            if (i>0)
                s+=", ";
        }
        return s + "]";
    }

    public boolean equals(Object o) {
        // à compléter
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }
    
  

}
