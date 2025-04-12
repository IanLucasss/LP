import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //O usuário entra com um número inteiro e o programa indica se o número é ímpar ou par.

        Scanner in  = new Scanner(System.in);

        int value;
        System.out.println("Digite o número: ");
        value = in.nextInt();

        if(value %2==0){
            System.out.println("O número "+value+" é par.");
        }
        else{
            System.out.println("O número "+value+" é impar.");
        }
    }
}