import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int n = in.nextInt();
            System.out.println("Soma: " + soma(n));
    }

    public static int soma ( int n){
        if (n == 1) {
                return 1;
        }return n + soma(n - 1);
    }
}
