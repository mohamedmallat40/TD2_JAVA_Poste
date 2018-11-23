
package td2;

import java.util.Scanner;

public class Lettre extends Courier {
    private String type ;
    
    public Lettre(){
        super();
        Scanner sc=new Scanner(System.in);
        String x;
        do {
            System.out.println("type de lettre (prioritaire / ordinaire): ");
            x=sc.nextLine();
        }
        while(!"prioritaire".equals(x) && !"ordinaire".equals(x));
        //while("prioritaire".equals(x) || "ordinaire".equals(x));//
        this.type=x;
    }
        @Override
        public double calcul_Timbre(){
            if ("prioritaire".equals(this.type)) {
                if (super.getPoids()<=20) return 390;
                else if (super.getPoids()<=250) return(390+700);
                    else if (super.getPoids()<=1000) return(390+1500);
                        else if (super.getPoids()<=2000) return(390+2300);
                        }
            else {
               if (super.getPoids()<=20) return 250;
                else if (super.getPoids()<=250) return(250+700);
                    else if (super.getPoids()<=1000) return(250+1500);
                        else if (super.getPoids()<=2000) return(250+2300); 
        }
        return (0);
    }
        
        @Override
        public String toString(){
            return (super.toString() + "type de courier: " + this.type + "\tprix: " + calcul_Timbre() + "millimes");
        }
}
