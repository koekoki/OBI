package E2020;

import java.util.Scanner;

public class FissuraPerigosa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int f = ler.nextInt();
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ler.next().charAt(0);
            }
        }

        //condições

        if (Character.getNumericValue(matriz[0][0]) <= f) {
            matriz[0][0] = '*';
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        try {
                            if (Character.getNumericValue(matriz[i][j]) <= f &&
                                    (matriz[i][j] != '*') &&
                                    ((matriz[i - 1][j] == '*') ||
                                            (matriz[i + 1][j] == '*') ||
                                            (matriz[i][j - 1] == '*') ||
                                            (matriz[i][j + 1] == '*'))
                            ) matriz[i][j] = '*';
                        } catch (ArrayIndexOutOfBoundsException e) {
                        }
                    }
                }
            }
        // saida
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}



