package ua.com.devEduction.If;

public class Operation {

    public int first(int a, int b) {
        if (a % 2 == 0) {
            return a * b;
        } else {
            return a + b;
        }
    }

    public int second(int x, int y) {

        if (x > 0) {
            if (y > 0) {
                return 1;
            }
            if (y < 0) {
                return 4;
            }
        } else if (x < 0) {
            if (y > 0) {
                return 2;
            }
            if (y < 0) {
                return 3;
            }
        }
        return 0;
    }

    public int third(int one, int two, int three) {

        int sum = 0;

        if (one > 0) {
            sum += one;
        }
        if (two > 0) {
            sum += two;
        }
        if (three > 0) {
            sum += three;
        }

        return sum;
    }

    public int fourth(int a, int b, int c) {
        return Math.max(a * b * c, a + b + c) + 3;
    }

    public String fifth(int rating) {
        if (rating >= 0 && rating < 20) {
            return "F";
        } else if (rating >= 20 && rating < 40) {
            return "E";
        } else if (rating >= 40 && rating < 60) {
            return "D";
        } else if (rating >= 60 && rating < 75) {
            return "C";
        } else if (rating >= 75 && rating < 90) {
            return "B";
        } else if (rating >= 90 && rating <= 100) {
            return "A";
        } else {
            return "";
        }
    }


}
