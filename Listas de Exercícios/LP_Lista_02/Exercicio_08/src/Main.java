import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double inch, result;

        System.out.println("Digite uma medida em polegadas :");
        inch = in.nextDouble();//utilização do scanner

        result = inch*25.4;
        System.out.println(inch+" pol em milímetros é " + result);
    }
}
