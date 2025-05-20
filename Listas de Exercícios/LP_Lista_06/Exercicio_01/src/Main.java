import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um inteiro maior que zero: ");
            numero = in.nextInt();
        } while (numero <= 0);

        System.out.println("A soma dos antecessores de " + numero + " é: " + somarNumeros(numero));
    }

    public static int somarNumeros(int numero) {
        if (numero == 1)
            return 1;
        return numero + somarNumeros(numero - 1);
    }
}