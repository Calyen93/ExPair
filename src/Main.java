public class Main {
    public static void main(String[] args) {

        int[] arrayInt = {4, 9, 6, 7};
        double[] arrayDouble = {4.5, 3.6, 6.1, 10.4, 12.5};

        int maxInt = maxValue(arrayInt);
        double mediaDouble = mediaValue(arrayDouble);


        System.out.println("Il Valore massimo di interi è: " + maxInt);
        System.out.println("La media dei valori dell'array è: " + mediaDouble);
    }

    public static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }

    public static double mediaValue(double[] array) {
        double sum = 0;
        for (double k : array){
            sum += k;
        }
        return sum / array.length;
    }
}

