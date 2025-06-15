//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] v1 = {0,1,2,3,4,5,6,7,8,9};
        int[] v2 = new int[10];

        for (int i = 0; i < v1.length; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        System.out.println("Vetor original:");
        for (int num : v1) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor invertido:");
        for (int num : v2) {
            System.out.print(num + " ");
        }
    }
}