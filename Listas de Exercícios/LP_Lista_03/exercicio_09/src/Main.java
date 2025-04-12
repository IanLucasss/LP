import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a,b,c;

        System.out.println("Digite os três lados do triângulo separados por espaço: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a<(b+c) && (b<(a+c)) && c<(b+a) && a>Math.abs(b-c) && b>Math.abs(a-c) && c>Math.abs(a-b)) {
            System.out.println("A, B e C formam um triângulo");

            if (a == b && b == c) {
                System.out.println("O triângulo é Equilátero.");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("O triângulo é Isóceles.");
            }
            else {
                System.out.println("O triângulo é Escaleno.");
            }
        }
        else {
                System.out.println("A, B e C não formam um triângulo");
            }
        }
    }
