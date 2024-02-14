/*Scrivi un programma Java che contenga due metodi: uno per trovare il valore massimo in un array
di interi e un altro per trovare la media dei valori in un array di double. Il programma deve creare
due array, uno di interi e uno di double, e utilizzare i due metodi per trovare il valore massimo e la
media dei valori in ciascun array.*/

public class Main {
    public static void main(String[] args) {

        double[] arrayInt = {4, 9, 6, 7};
        double[] arrayDouble = {4.5, 3.6, 6.1, 10.4, 12.5};

        double maxInt = maxValue(arrayInt);
        double mediaDouble = mediaValue(arrayDouble);


        System.out.println("Il Valore massimo di interi di arrayInt è: " + maxInt);
        System.out.println("La media dei valori di arrayInt è: " + mediaDouble);
        System.out.println ("Il Valore massimo di interi di arrayDouble è " + maxValue(arrayDouble));
        System.out.println("La media dei valori di arrayDouble è: " + mediaValue(arrayInt));
    }

    public static double maxValue(double[] array) {
        double max = array[0];
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

