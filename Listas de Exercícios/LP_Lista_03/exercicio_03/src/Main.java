import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        double score1,score2,mean;

        System.out.println("Digite duas notas separadas por espaço: ");
        score1=in.nextDouble();
        score2=in.nextDouble();

        mean=(score1+score2)/2;
        System.out.println("Média= "+mean);

        System.out.println(mean<=50?"Reprovado":"Aprovado");
    }
}