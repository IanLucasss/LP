import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        int number, result;

        System.out.println("Digite um número qualquer para saber o seu dobro :");
        number = in.nextInt();//utilização do scanner

        result = number * 2;
        System.out.println("O dobro de " + number + " é " + result);
    }
}
