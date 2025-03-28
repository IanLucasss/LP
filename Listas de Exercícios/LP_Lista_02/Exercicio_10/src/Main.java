import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double miles, result;

        System.out.println("Digite uma distância em milhas:");
        miles = in.nextDouble();//utilização do scanner

        result = miles*1.6;
        System.out.println(miles+" milhas em km é " + result);
    }
}
