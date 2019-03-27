package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;

public class Pile2 implements PileI {
    /** par delegation : utilisation de la class Stack */
    private Stack<Object> stk;

    /** la capacite de la pile */
    private int capacite;
    private int taille;

    /**
     * Creation d'une pile.
     * 
     * @param taille
     *            la taille de la pile, la taille doit etre > 0
     */
    public Pile2(int taille) {
        // prevoir le cas <=0
        // a completer
        if(capacite>0){
            this.capacite=capacite;
        }else{
            this.capacite=CAPACITE_PAR_DEFAUT;
        }
        stk=new Stack<Object>();
    }

    // constructeur fourni
    public Pile2() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public void empiler(Object o) throws PilePleineException {
        // a completer
         if(taille==capacite){throw new PilePleineException();}       
        stk.push(o);
        taille++;
    }

    public Object depiler() throws PileVideException {
        // a completer
        if(stk.isEmpty()){throw new PileVideException();}  
        taille--;
        return stk.pop();
    }

    public Object sommet() throws PileVideException {
        // a completer
        if(stk.isEmpty()){throw new PileVideException();}  
        return stk.peek();
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est vide, faux autrement
     */
    public boolean estVide() {
        // a completer
        return taille==0;
    }

    /**
     * Effectue un test de l'etat de la pile.
     * 
     * @return vrai si la pile est pleine, faux autrement
     */
    public boolean estPleine() {
        // a completer
        return taille==capacite;
    }

    /**
     * Retourne une representation en String d'une pile, contenant la
     * representation en String de chaque element.
     * 
     * @return une representation en String d'une pile
     */
    public String toString() {
         String s = "[";
        if(!estVide()){
            try{
                Pile2 temp = (Pile2)this.clone();
                int temptaille=temp.taille();
                System.out.println("IN THE BEGINNING:"+temptaille);
                for(int i=0;i<temptaille;i++){
                    System.out.println("IN FOR:"+temptaille+"   "+i+"   "+temp.taille());
                    s+=temp.depiler().toString();
                    if (!temp.estVide())
                        s+=", ";
                }
            }
            catch(CloneNotSupportedException e){
                e.printStackTrace();
            }
            catch(PileVideException e){
                e.printStackTrace();
            }
        }      
        // a completer
        return s + "]";
    }

    public boolean equals(Object o) {
        // a completer
        return false;
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

    /**
     * Retourne le nombre d'element d'une pile.
     * 
     * @return le nombre d'element
     */
    public int taille() {
        // a completer
        return taille;
    }

    /**
     * Retourne la capacite de cette pile.
     * 
     * @return le nombre d'element
     */
    public int capacite() {
        // a completer
        return capacite;
    }
    
   
} // Pile2.java
