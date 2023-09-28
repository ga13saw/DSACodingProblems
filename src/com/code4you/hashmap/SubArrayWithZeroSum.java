package com.code4you.hashmap;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    public static void main(String[] args) {
        int[] numbers =
                //{1,4,13,-3,-10,5};
                {3,1,-2,5,6};
        System.out.println(isSubArrayExistWithZeroSum(numbers));
    }
    private static boolean isSubArrayExistWithZeroSum(int[] numbers){
        int pre_sum = 0;
        Set<Integer> integerSet = new HashSet<>();

        for(int number : numbers){
            pre_sum+=number;
            if(integerSet.contains(pre_sum) || pre_sum==0){
                return true;
            }else{
                integerSet.add(pre_sum);
            }
        }
        return false;
    }

}
