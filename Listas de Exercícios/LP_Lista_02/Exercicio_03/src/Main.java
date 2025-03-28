import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double number, result;

        System.out.println("Digite um número qualquer: ");
        number = in.nextDouble();//utilização do scanner

        result = number/5;
        System.out.println("A quinta parte de " + number + " é " + result);
    }
}
