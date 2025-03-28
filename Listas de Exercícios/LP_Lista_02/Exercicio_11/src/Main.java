import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double celsius, result;

        System.out.println("Digite uma temperatura em graus celsius:");
        celsius = in.nextDouble();//utilização do scanner

        result = celsius*1.8+32;
        System.out.println(celsius+"°C = " + result +"°F");
    }
}
