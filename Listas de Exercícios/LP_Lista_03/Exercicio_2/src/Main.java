import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int n1,n2;

        System.out.println("Digite dois números inteiros separados por espaço");
        n1= in.nextInt();
        n2=in.nextInt();


        if (n1>n2){
            System.out.println("O valor"+n1+"é maior que "+n2);
        }
        else if(n1<n2){
            System.out.println("O valor "+n2+"é maior que "+n1);
        }
        else{
            System.out.println("Os valores são iguais");
        }
    }
}