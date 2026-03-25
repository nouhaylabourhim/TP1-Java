package partienum4;

import java.util.Scanner;
public class Ex13 {
     public static void main(String[] args) {
         System.out.println("VEUILLEZ ENTRER UNE CHAINE DE CARACTERES");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String inv = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            inv += s.charAt(i);
        }

        System.out.println("Voila l'Inverse de votre chaine : " + inv);
    }
}
