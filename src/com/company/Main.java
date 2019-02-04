// Assignment
// Write a program that has a variable named temperature and assign a value of between 92.0 and 104.0 to it.
//Get the temperature from the user.
//
//Using an else structure, determine if the temperature is low (below 97.5),
// normal (between 97.5 and 99.5) or high (over 99.5).
// Display to the screen text that indicates what the temperature is, and if it is high, low, or normal.
// Make sure to test the program with each of the three possible value ranges to make sure that it works.
//
// Program pseudo code
//  create the variable temperature
// create a loop to do the following
// create an object of type Scanner to facilitate user input
// query the user to input the temperature
// compare the temperature entered to 97.5
// if the temperature is less than 97.5 inform the user temperature is low
// otherwise compare the temperature to 99.5
// if the temperature is greater than 99.5 inform the user temperature is high
// if neither of the above conditions are met inform the user the temperature is normal
// exit condition is if the user enters 0

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // variable to hold the temperature assigned a default value of 98.4
        double temperature = 98.4;


        while (temperature != 0) {
            // create a scanner object
            Scanner scanner = new Scanner(System.in);

            // display a query to the user to enter a temperature between 92.0 and 104.0
            System.out.println("Enter a temperature between 92.0 and 104.0 or 0 to exit");
            // get the input from the user
            temperature = scanner.nextDouble();

            // compare the temperature to 97.5
            if (temperature < 97.5) {   // if it is less then inform user temperature is low
                System.out.println("Temperature you entered is low");
            }
            // compare the temperature to 99.5
            else if (temperature > 99.5) {   // if it is greater than 99.5 inform the user temperature is high
                System.out.println("Temperature you entered is high");
            } else
                // if the temperature is neither high nor low it must be normal
                System.out.println("The temperature you entered is normal");
        }
    }
}
