public class Main {
    public static void main(String[] args) {

        //Declare e inicialize um vetor de 10 posições, em seguida imprima este vetor em ordem inversa.

        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}