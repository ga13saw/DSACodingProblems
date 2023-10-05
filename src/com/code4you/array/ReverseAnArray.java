package com.code4you.array;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] numbers =
                {8,10,15,20};
                //{10,10,10};
                //{10,8,9,20,30,25};
                //{100};
        reverseAnArray(numbers);
        System.out.println("Revered array "+ Arrays.toString(numbers));

    }

    private static void reverseAnArray(int[] numbers) {
        int low=0,high=numbers.length-1;
        while(low < high){
            int temp = numbers[low];
            numbers[low] = numbers[high];
            numbers[high]= temp;
            low++;
            high--;
        }
    }
}
