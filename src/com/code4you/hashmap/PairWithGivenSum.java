package com.code4you.hashmap;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] numbers = {2,4,3,7,5,1};
        int sum = 6;

        System.out.println(isPairExist(numbers, sum));
    }

    private static boolean isPairExist(int[] numbers, int sum) {
        Set<Integer> numberSet = new HashSet<>();

        for (int number : numbers){
            if(numberSet.contains(sum-number))
                return true;
            else
                numberSet.add(number);
        }
        return false;
    }
}
