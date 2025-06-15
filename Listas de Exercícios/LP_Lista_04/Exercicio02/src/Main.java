import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número inteiro: ");
            int num = in.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

    }
}