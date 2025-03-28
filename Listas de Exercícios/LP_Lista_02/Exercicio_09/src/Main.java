import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double km, result;

        System.out.println("Digite uma distância em km:");
        km = in.nextDouble();//utilização do scanner

        result = km/1.6;
        System.out.println(km+" km em milhas é " + result);
    }
}
