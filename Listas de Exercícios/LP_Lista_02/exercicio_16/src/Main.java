import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Receber o raio e a altura de um cone e calcular seu volume.

        Scanner in = new Scanner(System.in);

        double  radius, height, volume;


        System.out.println("Digite o raio e a altura separados por espaço: ");
        radius=in.nextDouble();
        height =in.nextDouble();

        volume =(Math.PI*(radius*radius)*height)/3;
        System.out.printf("O volume do cone é: %.2f", volume);
        }
    }