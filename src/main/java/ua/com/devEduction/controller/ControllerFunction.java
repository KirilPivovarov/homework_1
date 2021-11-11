package ua.com.devEduction.controller;

import ua.com.devEduction.Function.OperationFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_CEILING;

public class ControllerFunction {

    private static final Scanner scanner = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    OperationFunction operation = new OperationFunction();

    public void run() {
        System.out.println("""
                Find the name of day by its number - 1
                 find the distance between two coordinates -2
                refactor number - 3
                refactor string - 4""");
        try {
            System.out.print("Enter number exercise you want choose: ");
            String choose = reader.readLine();
            boolean startWhile = true;
            while (startWhile) {

                switch (choose) {
                    case "1" -> {
                        System.out.println("exc 1");
                        System.out.print("Enter your number day :");
                        int numberDay = scanner.nextInt();
                        System.out.println("Name this day " + operation.dayWeek(numberDay));
                        System.out.println("");
                    }
                    case "2" -> {
                        System.out.println(" Exc 2");
                        System.out.println("Enter yor coordinate : ");
                        System.out.print(" x1 = ");
                        BigDecimal x1 = scanner.nextBigDecimal();
                        System.out.print(" y1 = ");
                        BigDecimal y1 = scanner.nextBigDecimal();
                        System.out.print(" x2 = ");
                        BigDecimal x2 = scanner.nextBigDecimal();
                        System.out.print(" y2 = ");
                        BigDecimal y2 = scanner.nextBigDecimal();
                        System.out.println("Your distance: " + operation.moduleVector(x1, y1, x2, y2).setScale(3, ROUND_CEILING));
                        System.out.println("");
                    }
                    case "3" -> {
                        System.out.println("exc 3");
                        System.out.print("Enter your number:");
                        BigDecimal number = scanner.nextBigDecimal();
                        if (operation.refactorNumber(number).equals("-1")) {
                            System.out.println("Incorrect input");
                        } else {
                            System.out.println("Your string: " + operation.refactorNumber(number));
                        }
                        System.out.println("");
                    }
                    case "4" -> {
                        System.out.println("exc 4");
                        System.out.print("Enter your string: ");
                        String string = scanner.next();
                        if (operation.refactorString(string) == -1) {
                            System.out.println("Incorrect input");
                        } else {
                            System.out.println("Your number: " + operation.refactorString(string));
                        }
                        System.out.println("");
                    }
                    case "0" -> {
                        startWhile = false;
                        ;
                    }
                    default -> {
                        System.out.println("Incorrect input");
                    }
                }
                if (!choose.equals("0")) {
                    System.out.println("""
                            Find the name of day by its number - 1
                             find the distance between two coordinates -2
                            refactor number - 3
                            refactor string - 4""");
                    System.out.print("Your choose: ");
                    choose = reader.readLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Error!");
        }
    }
}
