
package td2;

import java.util.Scanner;
import java.util.Vector;

public class Poste {
    private Vector <Courier> liste=new Vector();
    
    public void ajouter_lettre(){
        liste.add(new Lettre());
    }
    
    
    public void ajouter_colis(){
        liste.add(new Colis());
    }
    
    
    public void afficher_colis(){
        for (int i=0;i<liste.size();i++)
            if (liste.get(i) instanceof Colis) {
                System.out.println(liste.get(i).toString());
            }
    }
    
    public void afficher_lettre(){
        for (int i=0;i<liste.size();i++)
            if (liste.get(i) instanceof Lettre) {
                System.out.println(liste.get(i).toString());
            }
    }
    
    public void afficher(){
        for (int i=0;i<liste.size();i++){
                System.out.println(liste.get(i).toString());
            }
    }
}
