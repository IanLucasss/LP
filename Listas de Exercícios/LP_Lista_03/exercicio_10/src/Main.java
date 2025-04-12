import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Receber três números inteiros e exibi-los em ordem crescente.

        Scanner in = new Scanner(System.in);

        int a,b,c;
        int menor, meio, maior;

        System.out.print("Digite os três valores separados por espaço: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

    }
}
