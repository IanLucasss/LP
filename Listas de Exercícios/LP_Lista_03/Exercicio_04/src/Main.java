import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        double score1,score2,mean, recovery;

        System.out.println("Digite duas notas separadas por espaço: ");
        score1=in.nextDouble();
        score2=in.nextDouble();

        mean=(score1+score2)/2;
        System.out.println("Média= "+mean);

        if (mean>=50){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Digite a nota da recuperação: ");
            recovery=in.nextDouble();

            mean = (mean + recovery)/2;
            System.out.println("Nova Média: "+mean);

            if(mean<=50){
                System.out.println("Reprovado");
            }
            else {
                System.out.println("Aprovado");
            }
        }
    }
    }