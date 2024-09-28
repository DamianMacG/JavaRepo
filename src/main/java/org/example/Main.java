package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfPositives(new int[]{6, 4, -5, 12}));
        System.out.println(reverseString("Hello, World!"));
    }

    //Sum of positive numbers in an array
    public static int sumOfPositives(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Reverse a string
    public static String reverseString(String str) {
        StringBuilder str1 = new StringBuilder(str);
        return str1.reverse().toString();
    }

    // Number to a String
    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    // Remove first and last characters in a string
    public static String removeFirstAndLast(String str) {

        return str.substring(1, str.length() - 1);
    }

    // Sum of the squared values in an array
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += Math.pow(num, 2);
        }
        return sum;
    }

    // Repeat a string
    public static String repeatString(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    // Summation of all numbers from 0 to n
    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    // Is number a Palindrome
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        String str = Integer.toString(number);
        String revStr = "";

        for (int i = 0; i < str.length(); i++) {
            revStr = str.charAt(i) + revStr;

        }
        return str.equals(revStr);
    }

    // First and Last digit sum of a number
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        String str = Integer.toString(number);
        int firstDigit = str.charAt(0) - '0';
        int lastDigit = str.charAt(str.length() - 1) - '0';

        return firstDigit + lastDigit;
    }

    // Sum of even digits between 0 and number
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int newNum = 0;

        while (number > 0) {
            newNum = number % 10;
            if (newNum % 2 == 0) {
                sum += newNum;
            }
            number = number / 10;
        }
        return sum;
    }

    //Two numbers must have a shared digit & be less than 100 & greater than 9 to return true
    public static boolean hasSharedDigit(int x, int y) {
        int num = x % 10;
        int num2 = x / 10;
        int yNum = y % 10;
        int yNum2 = y / 10;

        if ((x >= 10 && x <= 99) && (y >= 10 && y <= 99) && (num == yNum || num == yNum2 || num2 == yNum || num2 == yNum2)) {
            return true;
        }
        ;
        return false;
    }

    //Three numbers - if any 2 match last digit and all nums are greater than 9 and less than 1001
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        }
        int lastX = x % 10;
        int lastY = y % 10;
        int lastZ = z % 10;

        return lastX == lastY || lastY == lastZ || lastZ == lastX;
    }

    // Prints all factors of a number
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }

    // Get the GCD - Greatest Common Denominator
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int max = Math.max(first, second);
        int min = Math.min(first, second);

        while (min > 0) {
            int x = min;
            min = max % min;
            max = x;
        }
        return max;
    }

    //
}