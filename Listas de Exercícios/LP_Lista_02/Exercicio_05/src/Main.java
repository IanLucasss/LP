import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double velocity, result;

        System.out.println("Digite a velocidade em km/h :");
        velocity = in.nextDouble();//utilização do scanner

        result = velocity/3.6;
        System.out.println(velocity+" km/h em m/s é " + result);
    }
}
