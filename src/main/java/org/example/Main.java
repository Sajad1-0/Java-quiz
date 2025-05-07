package org.example;

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



    }
}