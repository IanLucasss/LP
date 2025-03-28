import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius, altura, volume;

        System.out.println("Digite o raio: ");
        radius = in.nextDouble();

        System.out.println("Digite a altura: ");
        altura = in.nextDouble();

         volume = Math.PI*Math.pow(radius,2)*altura;
        System.out.println("O volume do cilindro é de = "+ altura);
    }
}