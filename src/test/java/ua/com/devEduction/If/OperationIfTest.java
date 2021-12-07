package ua.com.devEduction.If;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;


public class OperationIfTest {

    Operation operation = Mockito.spy(Operation.class);

    static Arguments[] returnMultNumberIfEvenTestArg(){
        return new Arguments[]{
                Arguments.arguments(26,45),
                Arguments.arguments(24,57),
                Arguments.arguments(0, 25)
        };
    }

    @ParameterizedTest
    @MethodSource("returnMultNumberIfEvenTestArg")
    public void returnMultNumberIfEvenTest(int numberOne,int numberTwo){
        Assertions.assertEquals(operation.returnMultNumberIfEvenElseSum(numberOne,numberTwo), numberOne * numberTwo );
    }

    static Arguments[] returnSumNumberIfOddETestArg(){
        return new Arguments[]{
                Arguments.arguments(21,45),
                Arguments.arguments(23,57),
                Arguments.arguments(-1, 25)
        };
    }

    @ParameterizedTest
    @MethodSource("returnSumNumberIfOddETestArg")
    public void returnSumNumberIfOddTest(int numberOne,int numberTwo){
        Assertions.assertEquals(operation.returnMultNumberIfEvenElseSum(numberOne,numberTwo), numberOne + numberTwo );
    }

  @Test
    public void returnFirstQuart(){
        int x = 2;
        int y = 5;
        Assertions.assertEquals(operation.determineInWhichQuarterPoint(x,y), 1);
  }

    @Test
    public void returnSecondQuart(){
        int x = -2;
        int y = 5;
        Assertions.assertEquals(operation.determineInWhichQuarterPoint(x,y), 2);
    }
    @Test
    public void returnThirdQuart(){
        int x = -2;
        int y = -5;
        Assertions.assertEquals(operation.determineInWhichQuarterPoint(x,y), 3);
    }
    @Test
    public void returnFourthQuart(){
        int x = 2;
        int y = -5;
        Assertions.assertEquals(operation.determineInWhichQuarterPoint(x,y), 4);
    }

        @Test
    public void findTheSumOfOnlyPositiveNumbersTest() {
        int number = 325;
        int negativeNumber= -32;
        int val = 0;
        Assertions.assertEquals(operation.findTheSumOfOnlyPositiveNumbers(number, negativeNumber, val), 325);
        }

        @Test
        public void calculateExpressionTest() {
        int a = 9;
        int b = 4;
        int c = 6;
        Assertions.assertEquals(operation.calculateExpression(a,b,c),  219);
    }

    @Test
    public void distributionRatingFTest() {
        int rating = 12;
        Assertions.assertEquals(operation.distributionRating(rating), "F");
    }

    @Test
    public void distributionRatingETest() {
        int rating = 22;
        Assertions.assertEquals(operation.distributionRating(rating), "E");
    }

    @Test
    public void distributionRatingDTest() {
        int rating = 42;
        Assertions.assertEquals(operation.distributionRating(rating), "D");
    }

    @Test
    public void distributionRatingCTest() {
        int rating = 62;
        Assertions.assertEquals(operation.distributionRating(rating), "C");
    }

    @Test
    public void distributionRatingBTest() {
        int rating = 82;
        Assertions.assertEquals(operation.distributionRating(rating), "B");
    }

    @Test
    public void distributionRatingATest() {
        int rating = 92;
        Assertions.assertEquals(operation.distributionRating(rating), "A");
    }
}
