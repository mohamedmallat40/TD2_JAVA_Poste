
package td2;

import java.util.Scanner;

public class TD2 {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Poste p=new Poste();
        int x;
        do {
        System.out.println("1.ajouter une lettre");
        System.out.println("2.ajouter un colis");
        System.out.println("3.afficher tout les couriers");
        System.out.println("4.afficher les lettres");
        System.out.println("5.afficher les colis");
        System.out.println("0.Sortir");
        x=sc.nextInt();
        
        switch(x){
            case 1: p.ajouter_lettre();break;
            case 2: p.ajouter_colis();break;
            case 3: p.afficher();break;
            case 4: p.afficher_lettre();break;
            case 5: p.afficher_colis();break;
        }
        
        
        }
        while (x!=0);



    }
    
}
