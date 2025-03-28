import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius, area;

        System.out.println("Digite o raio: ");
        radius = in.nextDouble();

        area = Math.PI*Math.pow(radius,2);
        System.out.println("A área = "+area);
    }
}