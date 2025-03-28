import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a,b,x;

        System.out.println("Digite o coeficiente angular: ");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente linear: ");
        b = in.nextDouble();

        x = -b/a;
        System.out.println(a+"x + "+b+ "= 0");
        System.out.println("x = "+ x);
    }
}
