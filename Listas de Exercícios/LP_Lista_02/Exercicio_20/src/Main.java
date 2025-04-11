import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double b,c, x1,x2;
                Scanner in = new Scanner(System.in);
        System.out.println("Digite os valores de x1 e x2 separados por espaço: ");
        x1= in.nextDouble();
        x2=in.nextDouble();

        b= (-x1)+(-x2);
        c= (-x1)*(-x2);

        System.out.println("x² + "+ b +"x + "+ c +" = 0");
    }
}