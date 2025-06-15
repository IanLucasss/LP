import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};

        System.out.print("Digite o valor que deseja buscar: ");
        int valor = in.nextInt();

        int posicao = busca(vetor, valor, 0, vetor.length - 1);

        if(posicao != -1) {
            System.out.println("Valor encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static int busca(int[] vetor, int valor, int inicio, int fim) {
        if(inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if(vetor[meio] == valor) {
            return meio;
        } else if(vetor[meio] < valor) {
            return busca(vetor, valor, meio + 1, fim);
        } else {
            return busca(vetor, valor, inicio, meio - 1);
        }
    }
}