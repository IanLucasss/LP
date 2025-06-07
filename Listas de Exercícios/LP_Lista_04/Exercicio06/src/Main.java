import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Peça para o usuário inserir dois números inteiros e exiba todos os
        // números naturais existentes entre os números digitados.

        Scanner in = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = in.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = in.nextInt();

        while (num1<=num2){
            System.out.println(num1);
            num1++;
        }
        while (num2<=num1){
            System.out.println(num2);
            num2++;
        }
        while (num1==num2){
            System.out.println("Os valores digitados são iguais");
        }
    }
}


