public class Main {
    public static void main(String[] args) {
        //Faça um programa que apresente na tela a
        // tabela de conversão de Graus Celsius para Fahrenheit,
        // de -80ºC até 80ºC com um incremento de 10ºC.

        //F = 9/5*C+32

        for (int celsius = -80; celsius <=80; celsius +=10){
            double f = (9/5 * celsius)+32;
            System.out.println("celsius: "+celsius+"\n Fahrenheit: "+f+"\n");
        }
    }
}