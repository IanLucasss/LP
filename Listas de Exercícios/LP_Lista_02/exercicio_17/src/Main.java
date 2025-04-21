import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
         Scanner in = new Scanner(System.in);

         double v1, aceleration, time, v2;

        System.out.println("Digite a velocidade inicial: ");
         v1=in.nextDouble();
        System.out.println("Digite a aceleração: ");
         aceleration = in.nextDouble();
        System.out.println("Digite o tempo de percurso do corpo: ");
        time = in.nextDouble();

        v2 = v1+(aceleration*time);
        System.out.printf("A velocidade final do corpo é de: %.2f", v2);

        }
    }