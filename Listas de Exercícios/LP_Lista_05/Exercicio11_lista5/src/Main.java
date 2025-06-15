import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe linhas da 1ª matriz:");
        int l1 = in.nextInt();
        System.out.println("Informe colunas da 1ª matriz:");
        int c1 = in.nextInt();

        System.out.println("Informe linhas da 2ª matriz:");
        int l2 = in.nextInt();
        System.out.println("Informe colunas da 2ª matriz:");
        int c2 = in.nextInt();

        // Verifica se é possível multiplicar
        if (c1 != l2) {
            System.out.println("Não é possível multiplicar as matrizes.");
            return;
        }

        int[][] m1 = new int[l1][c1];
        int[][] m2 = new int[l2][c2];
        int[][] resultado = new int[l1][c2];

        System.out.println("Digite os valores da 1ª matriz:");
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = in.nextInt();
            }
        }

        System.out.println("Digite os valores da 2ª matriz:");
        for (int i = 0; i < l2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("Matriz resultado:");
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}