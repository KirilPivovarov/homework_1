package ua.com.devEduction.controller;

import ua.com.devEduction.Loops.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ControllerLoops {


    private static final Scanner scanner = new Scanner(System.in);
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private final OperationLoops operation = new OperationLoops();

    public void run() {

        System.out.println("Choose your task");
        System.out.println("""
                First - 1
                Second - 2
                Third - 3
                Fourth  - 4
                Fifth - 5
                Sixth - 6
                """);

        System.out.print("Your choose: ");

        try {
            String choose = reader.readLine();
            boolean startWhile = true;
            while (startWhile) {


                switch (choose) {
                    case "1" -> operation.sumingOddNumberInRange();
                    case "2" -> {
                        System.out.print("Enter your number : ");
                        int number = scanner.nextInt();
                        System.out.println("This number is prime? " + operation.checkIfPrimeNumber(number));
                    }
                    case "3" -> {
                        System.out.print("Enter your number : ");
                        int number3 = scanner.nextInt();
                        System.out.println("The root this number " + operation.findTheRootOfANaturalNumber(number3));
                    }
                    case "4" -> {
                        System.out.print("Enter your number : ");
                        int number4 = scanner.nextInt();
                        System.out.println("Factorial number " + operation.findTheFactorialOfANumber(number4));
                    }
                    case "5" -> {
                        System.out.print("Enter your number : ");
                        int number5 = scanner.nextInt();
                        System.out.println("the sum of the digits of this number " + operation.calculateTheSumOfTheDigitsOfANumber(number5));
                    }
                    case "6" -> {
                        System.out.print("Enter your number : ");
                        int number6 = scanner.nextInt();
                        System.out.println("Mirror number " + operation.outputMirroredNumber(number6));
                    }
                    case "0" -> {
                        startWhile = false;
                    }
                    default -> {
                        System.out.println("Incorrect input");
                    }
                }
                if (!choose.equals("0")) {
                    System.out.println("""
                            First - 1
                            Second - 2
                            Third - 3
                            Fourth  - 4
                            Fifth - 5
                            Sixth - 6
                            """);
                    System.out.print("Your choose: ");
                    choose = reader.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error!" + e.getMessage());
        }
    }
}
