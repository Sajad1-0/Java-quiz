package org.example;

import static lektion2.Array.*;
import static lektion2.DataHandling.printArray;
import static lektion2.DataHandling.calculateAverage;
import static lektion2.DataHandling.searchArray;
import static lektion2.MathUtils.add;
import static lektion2.GreetingUsers.printGreeting;
import static lektion2.MathUtils.isEven;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Uppgift 1: addition
           int sum = add(2, 6);
           System.out.println(sum);


        //Uppgift 2: Meddelande
        printGreeting("Sajjad");

        // Uppgift 3: Jämna tal
        int num1 = 6;
        int num2 = 9;

        System.out.println("Är " + num1 + " jämnt? " + isEven(num1));
        System.out.println("Är " + num2 + " jämnt? " + isEven(num2));

        // Uppgift 2.1: Integer array
        handleIntegerArray();

        // Uppgift 2.2: Summan av en array
        calculateSum();

        // Uppgift 2.3: Max värdet i en array
        findMaxValue();

        // Uppgift 2.4: Visar vartannat element i arrayen
        printEveryOtherFruit();

        // Uppgift 3.1: Skapa en integer-array med valfria värden
        int[] myArray = {10,30,32,20,11};

        System.out.println("Utskrift av array: ");
        printArray(myArray);

        // Upgift 3.2: Anropa calculateAverage
        double average = calculateAverage(myArray);
        System.out.println("Medelvärdet: " + average);

        // Uppgift 3.3: Anropa searchArray-metoden
        int searchValue= 23;
        boolean foundValue = searchArray(myArray, searchValue);

        System.out.println("Finns " + searchValue + " i arrayen?");
        if (foundValue) {
            System.out.println("Ja, Värdet finns i arrayen. ");
        } else {
            System.out.println("Nej, Värdet finns inte i arrayen");
        }

    }
}