import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        O usuário digita um número inteiro e o programa diz
        qual o dia da semana correspondente, por exemplo:

        - 1 – domingo <br>
        - 2 – segunda-feira <br>
        - e assim por diante. <br>
                */

        Scanner in = new Scanner(System.in);

        int day;
        System.out.println("Digite o dia do mês: ");
        day = in.nextInt();

        if (day == 1 || day ==8 || day == 15 || day == 22 || day ==29){
            System.out.println("O dia da semana é domingo");
        }
        else if (day == 2 || day ==9 || day == 16 || day == 23 || day ==30){
            System.out.println("O dia da semana é segunda-feira");
        }
        else if (day == 3 || day == 10  || day == 17 || day == 24 || day == 31){
            System.out.println("O dia da semana é terça-feira");
        }
        else if (day ==4 || day == 11 || day == 18 || day == 25){
            System.out.println("O dia da semana é quarta-feira");
        }
        else if(day ==5 || day == 12 || day == 19 || day == 26){
            System.out.println("O dia da semana é quinta-feira");
        } else if (day ==6 || day == 13 || day == 20 || day == 27) {
            System.out.println("O dia da semana é sexta-feira");
        }
        else if (day ==7 || day == 14 || day == 21 || day == 28){
            System.out.println("O dia da semana é sábado");
        }
        else {
            System.out.println("Sem correspondência");
        }
    }
}