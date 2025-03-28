import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double velocity, result;

        System.out.println("Digite a velocidade em m/s :");
        velocity = in.nextDouble();//utilização do scanner

        result = velocity*3.6;
        System.out.println(velocity+" m/s em km/h é " + result);
    }
}
