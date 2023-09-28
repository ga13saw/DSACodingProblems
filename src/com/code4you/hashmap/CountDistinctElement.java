package com.code4you.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountDistinctElement {

    public static void main(String[] args) {
        int[] numbers = {10,20,10,15,30,10};
    print(getDistinctElementCountByNaiveApproach(numbers));
    print(getDistinceElementCountByOptimizedApproach(numbers));


    }

    // time complexity - O(n2)  space complexity - O(1)
    private static int getDistinctElementCountByNaiveApproach(int[] numbers) {
        int distinctNumberCount=0;
        for (int i=0;i < numbers.length;i++){
            boolean isDuplicate = false;
            for (int j=0;j<i;j++){
                if(numbers[i]==numbers[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                distinctNumberCount++;
            }
        }
        return distinctNumberCount;
    }

    //time complexity - O(n) space complexity - O(n)
    private static int getDistinceElementCountByOptimizedApproach(int[] numbers){
        Set<Integer> numberSet = new HashSet<>();
        for(int number : numbers){
            numberSet.add(number);
        }
        return numberSet.size();
    }

    private static void print(int distinctElementCount){
        System.out.println("No of distinct element is "+ distinctElementCount);
    }
}
