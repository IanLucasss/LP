import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um programa que contenha um vetor de inteiros de 10 posições
        // (inicializar o vetor junto com sua declaração). O programa deve
        // solicitar ao usuário um número inteiro(armazenar em uma variável comum inteira)
        // e então realizar uma busca dentro do vetor.Caso a variável digitada exista dentro
        // do vetor, exibir sua posição no vetor caso contrário exibir a mensagem “Valor não encontrado”.

        Scanner in = new Scanner (System.in);

    int [] numbers = {1,2,3,4,5,6,7,8,9,10};
    int valor;

        System.out.println("Digite o número :");
        valor=in.nextInt();

        for(int i=0;i< numbers.length;i++){
            if(valor==numbers[i]){
                System.out.println("O valor digitado se encontra no vetor na posição "+i);
                return;
            }
        }
        System.out.println("Valor Não encontrado.");
    }
}