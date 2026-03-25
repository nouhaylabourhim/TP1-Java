package partienum1;

import java.util.Scanner;

public class Ex2 {
        public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir trois nombres : ");
        System.out.print("Saisir le premier nombre : ");
        int a = sc.nextInt();
        System.out.print("Saisir le deuxieme nombre : ");
        int b = sc.nextInt();
        System.out.print("Saisir le troisieme nombre : ");
        int c = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Le maximum est : " + max);
}
    
}
