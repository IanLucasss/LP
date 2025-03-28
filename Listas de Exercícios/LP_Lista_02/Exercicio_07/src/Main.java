import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //configura o scanner

        double mm, result;

        System.out.println("Digite uma medida em mm :");
        mm = in.nextDouble();//utilização do scanner

        result = mm/25.4;
        System.out.println(mm+" mm em polegada é " + result);
    }
}
