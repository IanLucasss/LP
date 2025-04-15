public class Main {
    public static void main(String[] args) {
        //declaração sem inicialização
    int [] numbers1 = new int [5];

    numbers1[0] = 0;
    numbers1[1] = 6;
    numbers1[2] = 5;
    numbers1[3] = 2;
    numbers1[4] = 1;

        //declaração com inicialização
    int [] numbers2 = {0,6,5,2,1};

    ///////////////////////////////////////////////////////////////////////////////

        //jeito fácil e correto
        for (int i=0; i<=4;i++){
            System.out.println(numbers1[i]);
        }

        //percorrer o for com o tamanho do vetor
        for(int i=0;i<= numbers1.length;i++){
            System.out.println(numbers1[i]);
        }


        //foreach
        for(int pointer:numbers1){
            System.out.println(pointer);
        }

    }
}