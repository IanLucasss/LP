public class Main {
    public static void main(String[] args) {

        //Declare e inicialize um vetor de 10 posições
        // em seguida percorra este vetor alterando seus
        // valores conforme a seguinte regra: some 2 a
        // todos os valores situados em posições com índice par
        // e para as posições de índice ímpar multiplique seu valores por 2.

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<=numbers.length-1;i++){

            if (i%2 == 0){
                numbers[i] = numbers[i]+2;
                System.out.println(numbers[i]);
            } else {
                numbers[i] = numbers[i]*2;
                System.out.println(numbers[i]);
            }
        }
    }
}