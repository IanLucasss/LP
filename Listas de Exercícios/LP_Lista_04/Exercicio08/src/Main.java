import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar um programa onde o usuário entra com um número
        // e o programa diz se o número digitado é primo ou não.

        Scanner in = new Scanner(System.in);

        int num;

        System.out.println("Digite um número para verificação: ");
        num = in.nextInt();

        if (num <=1){
            System.out.println("O número digitado não é primo");
        }
        for(int i=2;i<=num-1;i++){
            if (num % i ==0){
                System.out.println("O número digitado não é primo");
                break;
            } else {
                System.out.println("O número digitado é primo");
                break;
            }
        }
    }
}