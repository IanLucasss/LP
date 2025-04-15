import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Calculadora geométrica: exibir em um menu a opção de escolha entre três
        formageométricas: círculo, triangulo retângulo ou retângulo. Após a seleção
        da opção oprograma deverá solicitar que o usuário insira os dados necessário para realizar
        os cálculos de área e perímetro da forma selecionada, os resultados devem ser exibidos em seguida.
        Exemplo:

        Menu:
        1. Círculo
        2. Triangulo Retângulo
        3. Retângulo
                --------------------------
        Escolha uma opção: 2
                --------------------------
        Informe a base: 3
        Informe a altura: 4
                --------------------------
        Área = 6
        Perímetro = 12
                */

        Scanner in = new Scanner(System.in);

        int option;

        double raio,base,altura,area,perimetro, x;

        System.out.println("------------------------------\n" +
                "Menu:\n"+
        "1. Círculo\n"+
        "2. Triangulo Retângulo\n"+
        "3. Retângulo\n"+
                "------------------------------");
        option = in.nextInt();

        switch(option){
            case 1:
                System.out.println("Informe o raio: ");
                raio = in.nextDouble();

                area =(raio*raio)*Math.PI;
                perimetro = 2*Math.PI*raio;
                System.out.printf("O valor da área é %.2f \n", area);
                System.out.printf("O valor do perímetro é %.2f", perimetro);
                break;

            case 2:
                System.out.println("Informe a base e a altura separadas por espaço: ");
                base = in.nextDouble();
                altura  = in.nextDouble();

                area =(base*altura)/2;
                x = (base*base)+(altura*altura);
                perimetro = base+altura+Math.sqrt(x);
                System.out.printf("O valor da área é %.2f \n", area);
                System.out.printf("O valor do perímetro é %.2f", perimetro);
                break;

            case 3:
                System.out.println("Informe a base e a altura separadas por espaço: ");
                base = in.nextDouble();
                altura  = in.nextDouble();

                area =(base*altura);
                perimetro =2*(base+altura);
                System.out.printf("O valor da área é %.2f \n", area);
                System.out.printf("O valor do perímetro é %.2f", perimetro);
                break;

        }
    }
}