package ua.com.devEduction.Function;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static javax.print.attribute.standard.MediaSizeName.B;
import static org.junit.jupiter.api.Assertions.*;

class OperationFunctionTest {

    private final OperationFunction operation = new OperationFunction();

    @Test
    public void testingDayWeek() {
        int day = 1;
         String word =  operation.dayWeek(day);
        assertEquals("Monday", word);
    }

        @Test
    public void calculateTheModuleTest() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;

        BigDecimal b1 = new BigDecimal(2);
            BigDecimal b2 = new BigDecimal(3);
            BigDecimal b3 = new BigDecimal(4);
            BigDecimal b4 = new BigDecimal(5);
        double module =  Math.sqrt(Math.pow( x2 - x1 ,2) + Math.pow((y2 - y1) ,2));
        assertEquals( operation.calculateModuleVector(b1, b2, b3, b4).doubleValue(), module);
        }

        @Test
    public void refactorNumberTest(){
        BigDecimal b1 = new BigDecimal("999000000000");
        assertEquals( operation.refactorNumber(b1),"999000000000");
        }

    @Test
    public void refactorString(){
        String number = "123";
        assertEquals(operation.refactorString(number), 123);
    }

}