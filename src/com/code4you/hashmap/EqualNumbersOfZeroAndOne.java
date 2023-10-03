package com.code4you.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EqualNumbersOfZeroAndOne {
    public static void main(String[] args) {
     int[] numbers =
             {1,0,1,1,1,0,0};
            //{0,0,1,1,1,1,1};
     //int maxSubarraySize = getEqualNumbersOfZeroAndOneByNaiveSolution(numbers);
        int maxSubarraySize = getEqualNumbersOfZeroAndOneByEfficientSolution(numbers);
        System.out.println("Max subarray size: "+ maxSubarraySize);
    }

    private static int getEqualNumbersOfZeroAndOneByEfficientSolution(int[] numbers) {
        for(int i=0; i<numbers.length;i++)
            if(numbers[i]==0)
                numbers[i] = -1;
        return getLongestSubarrayCountWithSumZero(numbers);
    }

    private static int getLongestSubarrayCountWithSumZero(int[] numbers) {
        Map<Integer,Integer> sumToIndexMap = new HashMap<>();
        int maxCount=0;
        int preSum = 0;
        for(int i=0;i<numbers.length;i++){
            preSum+=numbers[i];
            boolean contains = sumToIndexMap.containsKey(preSum);
            if(contains){
                maxCount = Math.max(maxCount, i-sumToIndexMap.get(preSum));
            }
            if(preSum==0)
                maxCount =i+1;
            if(!contains)
                sumToIndexMap.put(preSum,i);

        }
        return maxCount;
    }

    //Time complexity - O(n) and Space complexity - O(1)
    private static int getEqualNumbersOfZeroAndOneByNaiveSolution(int[] numbers) {
        int res = 0;

        for(int i=0;i<numbers.length;i++){
            int count0 = 0;
            int count1 = 0;
            for (int j=i;j<numbers.length;j++){
                if(numbers[j]==1)
                    count1++;
                else
                    count0++;
                if(count0==count1)
                    res = Math.max(res,count0+count1);
            }
        }
        return res;
    }
}
