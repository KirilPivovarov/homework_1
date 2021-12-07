package ua.com.devEduction.Loops;

public class OperationLoops {

    public String sumingOddNumberInRange() {
        int sum = 0;
        int val = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                val += 1;
            }
        }
        return "Answer: sum = " + sum + ", amount = " + val;
        //System.out.println("Answer: sum = " + sum + ", amount = " + val);
    }
    public boolean checkIfPrimeNumber(int number) {
        boolean answer = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public int findTheRootOfANaturalNumber(int a) {
        int i = 1;
        while (i * i <= a) {
            i++;
        }
        return i - 1;
    }

    public long findTheFactorialOfANumber(int number) {
        long mult = 1;
        for (int i = 1; i <= number; i++) {
            mult *= i;
        }
        return mult;
    }

    public int calculateTheSumOfTheDigitsOfANumber(int number) {
        int val = 1;
        int sum = 0;
        while ((number / (Math.pow(10, val))) > 0) {
            sum += (number % (Math.pow(10, val))) / Math.pow(10, val - 1);
            val++;
        }

        return sum;
    }

    public int outputMirroredNumber(int number) {
        int mirrorNumber = 0;
        double val = 1;
        int firstNumber = 0;
        while (number / Math.pow(10, val) > 0) {
            int pow = (int) Math.pow(10, val);
            int powTwo = (int) Math.pow(10, val - 1);
            if (pow > number) {
                firstNumber = number / powTwo;
                break;
            }
            mirrorNumber = ((number % pow) / powTwo) + mirrorNumber * 10;
            val++;
        }

        return mirrorNumber * 10 + firstNumber;
    }
}
