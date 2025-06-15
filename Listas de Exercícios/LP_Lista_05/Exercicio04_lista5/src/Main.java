import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que armazene 10 números
        // inteiros inseridos pelo usuário em um vetor.
        // Em seguida, percorra o vetor e indique onde
        // estão o maior e o menor número (imprima seus
        // valores e suas posições no vetor).

        Scanner in = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = in.nextInt();
        }
        int maior = numeros[0];
        int menor = numeros[0];
        int posMaior = 0;
        int posMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("\nMaior número: " + maior + " na posição " + posMaior);
        System.out.println("Menor número: " + menor + " na posição " + posMenor);
    }
}