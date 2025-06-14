import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, digite um número maior que 0.");
        } else {
            System.out.print("Sequência de Fibonacci: ");
            long a = 0, b = 1;


            for (int i = 1; i <= n; i++) {
                System.out.print(a);
                if (i < n) {
                    System.out.print(", ");
                }


                long proximo = a + b;
                a = b;
                b = proximo;
            }
        }

    }
}