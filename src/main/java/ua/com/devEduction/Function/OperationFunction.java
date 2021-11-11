package ua.com.devEduction.Function;

import java.math.BigDecimal;

public class OperationFunction {

    private static BigDecimal sqrt(BigDecimal value) {
        BigDecimal x = new BigDecimal(Math.sqrt(value.doubleValue()));
        return x.add(new BigDecimal(value.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));
    }

    public String dayWeek(int numberDay) {
        return switch (numberDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> " Error! Not correct number";
        };
    }

    public BigDecimal moduleVector(BigDecimal x1, BigDecimal y1, BigDecimal x2, BigDecimal y2) {

        BigDecimal coordinateX = x2.subtract(x1).multiply(x2.subtract(x1));
        BigDecimal coordinateY = y2.subtract(y1).multiply(y2.subtract(y1));
        BigDecimal module = sqrt(coordinateX.add(coordinateY));
        return module;
    }

    public String refactorNumber(BigDecimal value) {
        return value.toString();
    }

    public int refactorString(String number) {
        int refNumber;
        try {
            refNumber = Integer.parseInt(number.trim());

        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
            refNumber = -1;
        }
        return refNumber;
    }
}

