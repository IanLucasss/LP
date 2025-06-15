import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String texto = in.next();
        if(ehPalindromo(texto)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }

    public static boolean ehPalindromo(String texto) {
        String invertido = "";
        for(int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }
        return texto.equals(invertido);
    }
}