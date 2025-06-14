import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jogarNovamente = 1;

        while (jogarNovamente==1) {
            int perdeu = 0;
            int acertos = 0;

            // Loop para as tabuadas de 1 a 10
            for (int i = 1; i <= 10 && perdeu==0; i++) {
                for (int j = 1; j <= 10 && perdeu==0; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = in.nextInt();
                    int resultadoCorreto = i * j;

                    if (resposta == resultadoCorreto) {
                        acertos++;
                    } else {
                        System.out.println("Resposta errada! Você perdeu!");
                        perdeu = 1;
                    }
                }
            }
            if (acertos == 100) {
                System.out.println("Parabéns! Você completou a tabuada sem erros");
            }
            System.out.print("Deseja jogar novamente? (sim:1 / não:2) ");
            jogarNovamente= in.nextInt();
        }
        System.out.println("Fim do jogo!");
    }
}