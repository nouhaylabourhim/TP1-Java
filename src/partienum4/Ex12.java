
package partienum4;

import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        System.out.println("ENTRER UNE CHAINE DE CARACTERES");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));

            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y')
                count++;
        }

        System.out.println("Le nombre de Voyelles dans votre chaine est = " + count);
    
}
}
