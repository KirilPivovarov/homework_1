package ua.com.devEduction.controller;

import ua.com.devEduction.If.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ControllerIf {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final Scanner scanner = new Scanner(System.in);
    Operation operation = new Operation();

    public void run() {
        System.out.println("Choose your task");
        System.out.println("""
                First - 1
                Second - 2
                Third - 3
                Fourth  - 4
                Fifth - 5
                """);
            try {
                System.out.print("Your choose: ");
                String choose = reader.readLine();
                boolean startWhile = true;
                while (startWhile) {

                    switch (choose) {
                        case "1":
                            System.out.println("enter your a and b");
                            System.out.print("a: ");
                            int a = scanner.nextInt();
                            System.out.print("b: ");
                            int b = scanner.nextInt();
                            System.out.println("Your answer : " + operation.first(a, b));
                            break;

                        case "2":
                            System.out.println(" enter your coordinates");
                            System.out.print("x: ");
                            int x = scanner.nextInt();
                            System.out.print("y: ");
                            int y = scanner.nextInt();
                            System.out.println("Your quarter : " + operation.second(x, y));
                            break;

                        case "3":
                            System.out.println("Enter your number: ");
                            System.out.print("one : ");
                            int one = scanner.nextInt();
                            System.out.print("two : ");
                            int two = scanner.nextInt();
                            System.out.print("three : ");
                            int three = scanner.nextInt();
                            System.out.println("Your answer: " + operation.third(one, two, three));
                            break;

                        case "4":
                            System.out.println("Enter your number: ");
                            System.out.print("a : ");
                            int a1 = scanner.nextInt();
                            System.out.print("b : ");
                            int b1 = scanner.nextInt();
                            System.out.print("c : ");
                            int c1 = scanner.nextInt();
                            System.out.println("Your answer: " + operation.fourth(a1, b1, c1));
                            break;

                        case "5":
                            System.out.print(" Enter your rating: ");
                            int rating = scanner.nextInt();
                            System.out.println("Your grade: " + operation.fifth(rating));
                            break;
                        case "0":
                            startWhile = false;
                            break;
                        default:
                            System.out.println("Incorrect input");
                    }
                    if(choose.equals("0")){
                        break;
                    }else {
                        System.out.println("""
                                First - 1
                                Second - 2
                                Third - 3
                                Fourth  - 4
                                Fifth - 5
                                Exit - 0
                                """);
                        System.out.print("Your choose: ");
                        choose = reader.readLine();
                    }
                }
            }catch (IOException e){
                System.out.println("Error!");
            }
    }
}


