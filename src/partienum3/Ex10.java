package partienum3;
public class Ex10 {
      public static void main(String[] args) {
        int[][] m = {
            {123,342,563},
            {400,511,678},
            {787,678,549}
        };

        int[][] t = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[j][i] = m[i][j];
            }
        }

        System.out.println("Transposée :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }   
}
