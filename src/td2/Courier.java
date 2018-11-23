
package td2;

import java.util.Scanner;

public abstract class Courier {
    protected String des;
    protected String exp;
    protected int poids;
    
    public Courier(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Adresse de destination: ");
        this.des=sc.nextLine();
        System.out.println("Adresse d'expédition: ");
        this.exp=sc.nextLine();
            System.out.println("Poids en gramme: ");
            this.poids=sc.nextInt();
        }
                
    
    
    public abstract double calcul_Timbre() ;
    
    /* getters and setters */ 

    public String getDes() {
        return des;
    }

    public String getExp() {
        return exp;
    }

    public int getPoids() {
        return poids;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }
    
    @Override
    public String toString (){
        return ("Adresse de destination: " + this.des + "\tAdresse d'expédition: " + this.exp + "\tpoids: " + this.poids);
    }
    
}
