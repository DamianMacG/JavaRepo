package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

    // Perfect number - positive integer which equals the sum of its divisors
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (sum == number);
    }

    // Numbers to words reversed
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        Map<Integer, String> numberWordsMap = new HashMap<>();

        numberWordsMap.put(0, "Zero");
        numberWordsMap.put(1, "One");
        numberWordsMap.put(2, "Two");
        numberWordsMap.put(3, "Three");
        numberWordsMap.put(4, "Four");
        numberWordsMap.put(5, "Five");
        numberWordsMap.put(6, "Six");
        numberWordsMap.put(7, "Seven");
        numberWordsMap.put(8, "Eight");
        numberWordsMap.put(9, "Nine");
        numberWordsMap.put(10, "Ten");

        int reversedNumber = reverse(number);
        int digitCountOriginal = getDigitCount(number);
        int digitCountReversed = getDigitCount(reversedNumber);

        // Loop through the reversed number and print corresponding words
        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            System.out.println(numberWordsMap.get(lastDigit));
            reversedNumber /= 10;
        }

        // If original number had leading zeros, print "Zero" for those
        for (int i = 0; i < (digitCountOriginal - digitCountReversed); i++) {
            System.out.println(numberWordsMap.get(0)); // Print "Zero" for each missing leading zero
        }
    }

    public static int reverse(int number) {
        int rev = 0;
        int rem = 0;

        while (number > 0 || number < 0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number = number / 10;
        }
        return rev;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Goal amount from two inout values where value has a set weight and must be exact to return true
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int big = bigCount * 5;

        if (big > goal) {
            big = goal - (goal % 5);
        }
        int remainder = goal - big;

        return remainder <= smallCount;
    }

    // Largest Prime Number of a given value
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int prime = -1;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                boolean isPrime = true;

                // check if i is divisible further
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) { // if i is divisible, then not a prime
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    prime = i;
                }
            }
        }
        return prime;
    }

    // Print Average and Sum for Scanner inputs
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            String num = scanner.nextLine();
            try {
                int newNum = Integer.parseInt(num);
                sum += newNum;
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (count > 0) {
            int avg = Math.round((float) sum / count);  // Calculate average as a double
            System.out.println("SUM = " + sum + " AVG = " + avg);
        } else {
            System.out.println("SUM = 0 AVG = 0");
        }
    }

    // Get area needed to paint with multiple parameters
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (extraBuckets < 0 || width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = (width * height);
        double bucketsNeededToBuy = area - (extraBuckets * areaPerBucket);

        return (int) Math.ceil(bucketsNeededToBuy / areaPerBucket);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        return (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);

    }

    //
}