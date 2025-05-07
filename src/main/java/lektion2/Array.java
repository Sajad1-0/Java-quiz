package lektion2;

public class Array {
    // uppgift 2-1: Skapa och initiera en Integer-Array
    public static void handleIntegerArray() {
        int[] numbers = new int[7];

        // Tilldelning av värden
         numbers[0] = 3;
         numbers[1] = 5;
         numbers[2] = 7;
         numbers[3] = 9;
         numbers[4] = 11;
         numbers[5] = 14;
         numbers[6] = 18;

         System.out.println("Alla element i Arrayen: ");
         for (int i = 0; i < numbers.length; i++) {
             System.out.println("Index " + i + ": " + numbers[i]);
         }
    }

    // Uppgift 2.2: Beräkna Summan av en Array-Element:
    public static void calculateSum() {
        int[] values = {5,10,15,20,25};
        int sum = 0;

        for(int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("Summan av elementen är: " + sum);
    }

    // Uppgift 2.3: Hitta Max-värdet i en Array
    public static void findMaxValue() {
        int[] randomValues = {2,45,89,192,1,11};
        int maxValue = randomValues[0];

        for (int i = 0; i < randomValues.length; i++) {
            if (randomValues[i] > maxValue) {
                maxValue = randomValues[i];
            }
            System.out.println("\nMax värdet är:" + maxValue);
        }
    }

    //Upgift 2.4: Skapa en String-Array och Skriv ut Vartannat Element
    public static void printEveryOtherFruit() {
        String[] fruits = {"Apple", "Banana", "Orange", "Pear", "Watermelon"};

        System.out.println("Vartannat element i fruit-arrayen: ");
        for (int i = 0; i < fruits.length; i += 2) {
            System.out.println(fruits[i]);
        }
    }
}
