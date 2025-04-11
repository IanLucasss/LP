import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int answer;


        System.out.println("Escolha uma opção de produto:\n[5]Ovo\n[6]Pão\n[7]Leite\n"+
                                                          "[8]Farinha\n[9]Manteiga");

        answer=in.nextInt();

        switch(answer){

            case 5:
                System.out.println("Você escolheu ovo!");
                break;
            case 6:
                System.out.println("Você escolheu pão!");
                break;
            case 7:
                System.out.println("Você escolheu leite!");
                break;
            case 8:
                System.out.println("Você escolheu farinha!");
                break;
            case 9:
                System.out.println("Você escolheu manteiga!");
                break;
            default:
                System.out.println("Opção inválida!");

        }

    }
}