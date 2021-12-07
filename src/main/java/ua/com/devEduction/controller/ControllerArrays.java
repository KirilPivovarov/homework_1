package ua.com.devEduction.controller;

import ua.com.devEduction.SimpleArrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ControllerArrays {

    private static final Scanner scanner = new Scanner(System.in);
    private final OperationArrays operation = new OperationArrays();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void run() {

        System.out.println("""
                First exm - 1
                Second exm - 2
                Third exm - 3
                Fourth exm  - 4
                Fifth exm - 5
                Sixth exm - 6
                Seventh exm -7
                Eighth exm - 8
                Sort - 9""");

        System.out.println("Choose your task ");
        try {
            boolean startWhile = true;
            String choose = reader.readLine();
            while (startWhile) {
                switch (choose) {
                    case "1":
                        int[] arr1 = enterArrays();
                        System.out.println("Your min number: " + operation.findTheMinimumElementOfAnArray(arr1));
                        break;
                    case "2":
                        int[] arr2 = enterArrays();
                        System.out.println("Your max number: " + operation.findTheMaxElementOfAnArray(arr2));
                        break;
                    case "3":
                        int[] arr3 = enterArrays();
                        System.out.println("Error!");
                        System.out.println("Your min index " + operation.findIndexForMinimumElement(arr3));
                        break;
                    case "4":
                        try {
                            int[] arr4 = enterArrays();
                            System.out.println("Your max index " + operation.findIndexForMaximumElement(arr4));
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("Error!");
                        }
                        break;
                    case "5":
                        int[] arr5 = enterArrays();
                        System.out.println(" Your sum " + operation.calculateTheSumOfTheElementsOfAnArrayWithOddIndices(arr5));
                        break;
                    case "6":
                        int[] arr6 = enterArrays();
                        System.out.println("Your revers array: " + Arrays.toString(operation.reverseAnArray(arr6)));
                        break;
                    case "7":
                        int[] arr7 = enterArrays();
                        System.out.println("number of odd elements " + operation.countTheNumberOfOddElementsOfTheArray(arr7));
                        break;
                    case "8":
                        int[] arr8 = enterArrays();
                        System.out.println("Your new array: " + Arrays.toString(operation.swapTheFirstAndSecondHalfOfTheArray(arr8)));
                        break;
                    case "9":
                        int[] arr9 = enterArrays();

                        System.out.println("""
                                Method sorted:
                                1 - Bubble,
                                2 - Select,
                                3 - Insert,
                                4 - Quick,
                                5 - Merge,
                                6 - Shell,
                                7 - Heap.
                                """);

                        System.out.println("Choose method sort: ");
                        String chooseSort = reader.readLine();

                        switch (chooseSort) {

                            case "1":
                                System.out.println("Bubble: Your sorted array - " + Arrays.toString(operation.BubbleSort(arr9)));
                                break;
                            case "2":
                                System.out.println("Select: Your sorted array - " + Arrays.toString(operation.selectionSort(arr9)));
                                break;
                            case "3":
                                System.out.println("Insert: Your sorted array - " + Arrays.toString(operation.insertionSort(arr9)));
                                break;
                            case "4":
                                System.out.println("Quick: Your sorted array - " + Arrays.toString(operation.quickSort(arr9, 0, arr9.length - 1)));
                                break;
                            case "5":
                                System.out.println("Merge: Your sorted array - " + Arrays.toString(operation.sortMerge(arr9, arr9.length)));
                                break;
                            case "6":
                                System.out.println("Shell: Your sorted array - " + Arrays.toString(operation.ShellSort(arr9)));
                                break;
                            case "7":
                                System.out.println("Heap: Your sorted array - " + Arrays.toString(operation.sortHeap(arr9)));
                                break;
                        }
                    case "0":
                        startWhile = false;
                        break;
                    default:
                        System.out.println("Incorrect input");
                }
                if (!choose.equals("0")) {
                    System.out.println("""
                            First exm - 1
                            Second exm - 2
                            Third exm - 3
                            Fourth exm  - 4
                            Fifth exm - 5
                            Sixth exm - 6
                            Seventh exm -7
                            Eighth exm - 8
                            Sort - 9""");

                    System.out.print("Your choose: ");
                    choose = reader.readLine();
                }
            }
        } catch (InputMismatchException | IOException e) {
            System.out.println("Error! Your array or choose incorrectly");
        }

    }


    private int[] enterArrays() {
        System.out.print("Enter length array: ");
        int length = scanner.nextInt();
        System.out.println("Enter your array: ");
        int[] yourArray = new int[length];
        for (int i = 0; i < yourArray.length; i++) {
            yourArray[i] = scanner.nextInt();
        }
        return yourArray;
    }

}
