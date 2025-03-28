import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double altura, base, area;

        System.out.println("Digite o valor da altura: ");
        altura = in.nextDouble();

        System.out.println("Digite o valor da base");
        base = in.nextDouble();

        area = (base*altura)/2;
        System.out.println("A área é de = "+area);
    }
}