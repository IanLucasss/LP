import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;

        System.out.println("Digite um número qualquer para saber o seu dobro :");
        Scanner in = new Scanner(System.in); //configura o scanner
        number = in.nextInt();

        int result = number * 2;
        System.out.println("O dobro de " + number + " é " + result);
    }
}
