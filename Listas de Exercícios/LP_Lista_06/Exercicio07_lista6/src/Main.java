import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = in.nextInt();
        System.out.println("Fatorial: " + fatorial(n));
    }

    public static int fatorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }return n * fatorial(n - 1);
        }
    }