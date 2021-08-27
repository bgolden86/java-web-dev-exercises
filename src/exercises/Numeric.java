package exercises;

import java.util.Scanner;

public class Numeric {
    public static void main(String[] args){
        double miles;
        double gallons;
        double total;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use: ");
        gallons = input.nextDouble();
        input.close();

        total = miles / gallons;
        System.out.println("Your miles per gallon is: " + total + " gallons");
    }
}
