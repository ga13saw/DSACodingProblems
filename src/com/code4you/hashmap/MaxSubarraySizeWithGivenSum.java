package com.code4you.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaxSubarraySizeWithGivenSum {

    public static void main(String[] args) {
        int[] numbers =
                //{7,3,5,8,2,4,5,3,4};
                //{3,1,0,1,8,2,3,6};
                //{8,3,7};
                {5,8,-4,-4,9,-2,2};
        int sum =
                //16;
                //5;
                //15;
                0;
        int maxSubarraySize = getMaxSubarraySize(numbers, sum);
        System.out.println("Max subarray size "+ maxSubarraySize);
    }

    private static int getMaxSubarraySize(int[] numbers, int sum) {
        Map<Integer,Integer> numToIndexMap = new HashMap<>();
        int preSum = 0;
        int maxSize = 0;
        for(int i=0; i<numbers.length;i++){
            preSum+=numbers[i];
            boolean contains = numToIndexMap.containsKey(preSum - sum);
            if(contains){
                maxSize = Math.max(maxSize,i-(numToIndexMap.get(preSum-sum)));
            }else if(preSum==sum){
                maxSize = i+1;  //considering only positive numbers present in array
            }
            else if(!contains) {
                numToIndexMap.put(preSum,i);
            }
        }
        return maxSize;
    }

}
