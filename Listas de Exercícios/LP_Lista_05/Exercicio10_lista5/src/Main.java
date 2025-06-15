//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};
        int[][] b = {{7, 8}, {9, 10}};
        int[][] resultado = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }

        System.out.println("Matriz produto:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}