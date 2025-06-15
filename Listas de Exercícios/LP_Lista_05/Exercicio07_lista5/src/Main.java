import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        int maiorSomaLinha = 0;
        int maiorSomaColuna = 0;

        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha > maiorSomaLinha) maiorSomaLinha = somaLinha;
            if (somaColuna > maiorSomaColuna) maiorSomaColuna = somaColuna;
        }

        System.out.println("Maior soma das linhas: " + maiorSomaLinha);
        System.out.println("Maior soma das colunas: " + maiorSomaColuna);
    }
}