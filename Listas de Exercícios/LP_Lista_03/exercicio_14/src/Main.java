import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Crie um sistema de vendas onde o usuário
        insere o valor da compra e escolhe a forma de pagamento que pode ser:
        débito, crédito ou pix.
        Após escolher a forma de pagamento o sistema deve mostrar o total a pagar
        que deve seguir as seguintes regras:

        Débito: Conceder desconto de 5%.
        Pix: Conceder desconto de 10%.
        Crédito: taxa de 2% do valor total em parcelamento até 4 vezes
        ou taxa de 5% do valor total em parcelamentos superiores a 4 vezes (limite 10x).*/

        Scanner in = new Scanner(System.in);

        double value, debito, credito, pix;
        int parcelamento, option;

        System.out.println("Digite o valor da compra: ");
        value = in.nextDouble();

        System.out.println("------------------------------\n"
                + "MENU DE PAGAMENTO\n"
                + "1. Débito (Desconto de 5%)\n"
                + "2. Pix (Desconto de 10%)\n"
                + "3. Crédito (Juros de 2% em até 4x ou 5% em até 10x\n"
                + "------------------------------");
        option = in.nextInt();

        switch (option) {
            case 1:
                debito = value - (value * 0.05);
                System.out.println("O valor final da compra é de: R$" + debito);
                break;

            case 2:
                pix = value - (value * 0.10);
                System.out.println("O valor final da compra é de: R$" + pix);
                break;

            case 3:
                System.out.println("Digite a quantidade de parcelas:");
                parcelamento = in.nextInt();

                if (parcelamento <= 4) {
                    credito = value + (value * 0.02);
                    System.out.println("O valor final da compra é de: R$" + credito);
                    break;
                } else if (parcelamento <= 10) {
                    credito = value + (value * 0.05);
                    System.out.println("O valor final da compra é de: R$" + credito);
                    break;
                } else {
                    System.out.println("O limite de parcelas é 10");
                    break;
                }

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}