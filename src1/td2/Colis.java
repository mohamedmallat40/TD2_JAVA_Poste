
package td2;


public class Colis extends Courier {
   
    private final double prix_g=0.3;
    
    public Colis(){
        super();
    }
    
    @Override
    public double calcul_Timbre(){
        if (super.getPoids() == 2000) return (4300);
        else return(super.getPoids()*prix_g);
    }
    
    @Override
    public String toString(){
        return (super.toString()+ "\tprix: " + calcul_Timbre() + "millimes");
    }
}
