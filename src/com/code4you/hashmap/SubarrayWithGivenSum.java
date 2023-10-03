package com.code4you.hashmap;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        int sum =
                //22;
                //10;
                7;
        int[] numbers =
                //{5,8,6,13,3,-1};
                //{3,2,5,6};
                {3,5,4,10,2,-1};
        boolean subarrayExistWithGivenSum = isSubarrayExistWithGivenSum(numbers, sum);
        System.out.println("SubArray exist with given sum "+ sum+" -"+ subarrayExistWithGivenSum);
    }

    private static boolean isSubarrayExistWithGivenSum(int[] numbers, int sum) {
        int pre_sum = 0;
        Set<Integer> integerSet = new HashSet<>();

        for(int number : numbers){
            pre_sum+=number;
            if(integerSet.contains(pre_sum-sum) || pre_sum==sum){
                return true;
            }else {
                integerSet.add(pre_sum);
            }
        }
        return false;


    }
}
