import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, n2, fatorial;
        fatorial=1;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = in.nextInt();
        n2=n;

        while (n>1) {
            fatorial = fatorial * n;
            n--;
        }

        System.out.println(n2 + "! = "+ fatorial);

    }
}
