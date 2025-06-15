//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] m = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int determinante =
                        m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
                        m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
                        m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        System.out.println("Determinante = " + determinante);
    }
}