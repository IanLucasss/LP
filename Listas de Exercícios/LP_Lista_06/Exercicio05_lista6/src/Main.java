import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] vetor = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};

        System.out.print("Digite o valor que deseja buscar: ");
        int valor = in.nextInt();

        int posicao = busca(vetor, valor);

        if(posicao != -1) {
            System.out.println("Valor encontrado na posição: " + posicao);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

        public static int busca(int[] vetor, int valor) {
            int inicio = 0;
            int fim = vetor.length - 1;

            while(inicio <= fim) {
                int meio = (inicio + fim) / 2;

                if(vetor[meio] == valor) {
                    return meio;
                } else if(vetor[meio] < valor) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
            return -1;
        }
}
