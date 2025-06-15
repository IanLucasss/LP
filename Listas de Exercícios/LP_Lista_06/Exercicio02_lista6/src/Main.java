import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um inteiro maior que zero: ");
            numero = in.nextInt();
        } while (numero <= 0);

        System.out.println("O fatorial de "+numero+" é: "+fatorialNumeros(numero));
    }

    public static int fatorialNumeros(int numero){
        int fatorial=1;

        for(int i=numero;i<0;i--){
            fatorial*=i;
        }

        return fatorial;

    }

}