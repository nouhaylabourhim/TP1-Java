
package partienum3;


public class Ex9 {
      public static void main(String[] args) {
        int[][] m = {
            {1,52,3},
            {4,5,76},
            {17,38,9}
        };

        int somme = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somme += m[i][j];
            }
        }

        System.out.println("Somme = " + somme);
    }
    
}
