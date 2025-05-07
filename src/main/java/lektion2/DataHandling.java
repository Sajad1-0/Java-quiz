package lektion2;

public class DataHandling {
    // Upgift 3.1: Metod för att skriva ut Array (med Metod)
    public static void printArray(int[] array ) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    // Uppgift 3.2: Metod för att beräkna medelvärde av array (med metod)
    public static double calculateAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    // Uppgift 3.3: Metod för att söka efter Värde i Array (med metod)
    public static boolean searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
