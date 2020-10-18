package homework;

public class Main {

    public static void main(String[] args) {
        float[] numbers = {1.1f,-1.2f,1.3f,1.4f,-1.5f ,2.1f,2.2f,2.3f,-2.4f,2.5f, 3.1f,-3.2f,3.3f,3.4f,-3.5f};
        float summa=0;
        int kolich=0;
        boolean btn=false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                btn = true;
            }

            if (numbers[i] > 0 && btn){
                summa = summa + numbers [i];
                kolich = kolich+ 1;
            }


        }

        System.out.println(summa/kolich);
    }
}
