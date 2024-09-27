package org.example;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfPositives(new int[]{6, 4, -5, 12}));
    }

    //Sum of positive numbers in an array
    public static int sumOfPositives(int[] arr){
        int sum = 0;
        for(int num : arr) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }



}