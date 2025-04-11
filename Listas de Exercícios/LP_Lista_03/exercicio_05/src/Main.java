import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        double n1,n2,mean;

        System.out.println("Digite as duas notas entre 0 A 10 separadas por espaço : ");
        n1= in.nextDouble();
        n2=in.nextDouble();

        mean=(n1+n2)/2;

        if(mean>=8.5){
            System.out.println("a média de "+mean+" é nota A");
        }
        else if(mean>=7){
            System.out.println("a média de "+mean+" é nota B");
        }
        else if (mean>=5){
            System.out.println("a média de "+mean+" é nota C");
        }
        else{
            System.out.println("a média de "+mean+" é nota D");
        }
    }
}