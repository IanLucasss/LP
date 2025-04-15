import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Elaborar uma minicalculadora, o programa recebe 2 números e exibe um menu para que o usuário escolha a operação e em seguida exibe o resultado. Exemplo:

        Digite o primeiro numero: 2
        Digite o segundo numero: 3
                ------------------------------
        Menu:
        1. Soma
        2. Subtracao
        3. Multiplicacao
        4. Divisao
                ------------------------------
        Escolha uma opcao: 3
                ------------------------------
        Resultado: 2.0 x 3.0 = 6.0*/


        Scanner in = new Scanner(System.in);

        int option;
        double num1, num2, resultado;

        System.out.println("Digite os dois valores separados por espaço: ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();

        System.out.println("Menu:\n" +
                "        1. Soma\n" +
                "        2. Subtracao\n" +
                "        3. Multiplicacao\n" +
                "        4. Divisao");

        option = in.nextInt();

        switch (option) {
            case 1:
                resultado = num1 + num2;
                System.out.println("O resultado da soma de " + num1 + " + " + num2 + " é = " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("O resultado da subtração de " + num1 + " - " + num2 + " é = " + resultado);
                break;

            case 3:
                resultado = num1*num2;
                System.out.println("O resultado da multiplicação de " + num1 + " x " + num2 + " é = " + resultado);
                break;

            case 4:
                resultado = num1/num2;
                System.out.println("O resultado da divisão de " + num1 + " / " + num2 + " é = " + resultado);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}