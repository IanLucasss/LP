import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Exibir uma mensagem de aviso quando não houver raízes no conjunto de números Reais.

        double a, b, c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os valores A, B, C separados por vírgulas: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        delta = (b * b) - 4 * a * c;
        System.out.println("O valor de delta é= "+delta);
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.printf("O valor de X1= %.2f \n", x1);
            System.out.printf("O valor de X2= %.2f", x2);
        }
        else {
            System.out.println("Delta com número negativo, tente novamente. ");
        }
    }
}