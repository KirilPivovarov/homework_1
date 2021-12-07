package ua.com.devEduction.SimpleArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import ua.com.devEduction.SimpleArrays.OperationArrays;

public class OperationSimpleArrayTest {

    OperationArrays operationArrays = Mockito.spy(OperationArrays.class);
    private final int[] array = new int[]{3, 667, 34, 7, 75, 26, 78,1 ,887,48, 32,75 ,8, 999, 31};
    private final int[] sortedArray = new int[]{1, 3, 7, 8 , 26, 31,32 ,34, 48, 75, 75, 78, 667, 887, 999};

        @Test
    public void findTheMinimumElementOfAnArrayTest() {
            Assertions.assertEquals(operationArrays.findTheMinimumElementOfAnArray(array), 1);
        }

        @Test
    public void findTheMaxElementOfAnArrayTest(){
            Assertions.assertEquals(operationArrays.findTheMaxElementOfAnArray(array), 999);
        }

        @Test
        public void findIndexForMinimumElementTest() {
            Assertions.assertEquals(operationArrays.findIndexForMinimumElement(array), 7);
        }

            @Test
            public void findIndexForMaximumElementTest() {
            Assertions.assertEquals(operationArrays.findIndexForMaximumElement(array), 13);
            }

        @Test
        public void calculateTheSumOfTheElementsOfAnArrayWithOddIndicesTest() {
            Assertions.assertEquals(operationArrays.calculateTheSumOfTheElementsOfAnArrayWithOddIndices(array), 1823);
        }

        @Test
    public void reverseAnArrayTest() {
            int[] resultArray = new int[]{31, 999,8, 75, 32, 48, 887, 1, 78, 26, 75, 7, 34, 667,3};

            Assertions.assertArrayEquals(operationArrays.reverseAnArray(array), resultArray);
        }

        @Test
    public void countTheNumberOfOddElementsOfTheArrayTest() {
            Assertions.assertEquals(operationArrays.countTheNumberOfOddElementsOfTheArray(array), 9);
        }

        @Test
    public void swapTheFirstAndSecondHalfOfTheArrayTest() {
            int[] resultArray = new int[]{1, 887,48, 32,75 ,8, 999, 31, 3, 667, 34, 7, 75, 26, 78 };
            Assertions.assertArrayEquals(operationArrays.swapTheFirstAndSecondHalfOfTheArray(array), resultArray);
        }

        @Test
    public void sortHeapTest() {
            Assertions.assertArrayEquals(operationArrays.sortHeap(array), sortedArray);
        }

    @Test
    public void sortShellTest() {
        Assertions.assertArrayEquals(operationArrays.ShellSort(array), sortedArray);
    }

    @Test
    public void sortQiuckTest() {
        Assertions.assertArrayEquals(operationArrays.quickSort(array, 0, array.length - 1), sortedArray);
    }

    @Test
    public void sortMergeTest() {
        Assertions.assertArrayEquals(operationArrays.mergeSort(array, array.length), sortedArray);
    }

    @Test
    public void sortBubleTest() {
        Assertions.assertArrayEquals(operationArrays.BubbleSort(array), sortedArray);
    }

    @Test
    public void sortSelectTest() {
        Assertions.assertArrayEquals(operationArrays.selectionSort(array), sortedArray);
    }

    @Test
    public void sortInsertTest() {
        Assertions.assertArrayEquals(operationArrays.insertionSort(array), sortedArray);
    }



}
