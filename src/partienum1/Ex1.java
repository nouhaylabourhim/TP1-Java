
package partienum1;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Bonjour nouhayla ");
        System.out.println("Entrez un entier : ");
        int nombre = sc.nextInt();
        
        if (nombre > 0) {
            System.out.println("Le nombre est positif");
        } 
        else if (nombre < 0) {
            System.out.println("Le nombre est negatif");
        } 
        else {
            System.out.println("Le nombre est nul");
        }
    
    
}
}
