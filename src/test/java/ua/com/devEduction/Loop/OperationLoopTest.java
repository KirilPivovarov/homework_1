package ua.com.devEduction.Loop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;
import ua.com.devEduction.Loops.OperationLoops;

public class OperationLoopTest {

    OperationLoops operationLoops = Mockito.spy(OperationLoops.class);

    static Arguments[] checkIfPrimeNumberTestArg(){
        return new Arguments[]{
                Arguments.arguments(7, true),
                Arguments.arguments(56,false),
                Arguments.arguments(4563, false)
        };
    }


    @Test
    public void sumingOddNumberInRangeTest() {
        int sum = 2450;
        int val = 49;
        Assertions.assertEquals(operationLoops.sumingOddNumberInRange(), "Answer: sum = " + sum + ", amount = " + val);
    }

    @ParameterizedTest
    @MethodSource("checkIfPrimeNumberTestArg")
    public void checkIfPrimeNumberTest(int number, boolean result) {
        Assertions.assertEquals(operationLoops.checkIfPrimeNumber(number), result);
    }

   @Test
    public void findTheRootOfANaturalNumberTest(){
        int number = 69;
        Assertions.assertEquals(operationLoops.findTheRootOfANaturalNumber(number), 8);
   }

   @Test
    public void findTheFactorialOfANumberTest() {
        int number = 6;
        Assertions.assertEquals(operationLoops.findTheFactorialOfANumber(6), 720);
   }

   @Test
    public void calculateTheSumOfTheDigitsOfANumberTest() {
        int number  = 4820482;
       Assertions.assertEquals(operationLoops.calculateTheSumOfTheDigitsOfANumber(number), 28);
   }

   @Test
    public void outputMirroredNumberTest() {
        int number = 4212;
        Assertions.assertEquals(operationLoops.outputMirroredNumber(number), 2124);
   }

}
