import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Base: ");
        int x = in.nextInt();
        System.out.print("Expoente: ");
        int y = in.nextInt();
        System.out.println("Resultado: " + potencia(x, y));
    }

    public static int potencia(int x, int y) {
        if(y == 0) {
            return 1;
        }return x * potencia(x, y - 1);
    }
}