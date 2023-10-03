package com.code4you.hashmap;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] numbers =
                {2,5,3,4,4,8,9};
                //{2,7,4,6,5,12,15,13,11,14};
        //int longestConsecutiveSequence = getLongestConsecutiveSequence(numbers);
        int longestConsecutiveSequence = getLongestConsecutiveSequenceUsingSet(numbers);
        System.out.println("Longest consecutive sequence length: "+longestConsecutiveSequence);



    }

    private static int getLongestConsecutiveSequenceUsingSet(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        int res=1;
        for(int number: numbers)
            numberSet.add(number);
        for(int n: numbers){
            if(!numberSet.contains(n-1)){
                int cur =1;
                while (numberSet.contains(n+cur))
                    cur++;
                res = Math.max(res,cur);
            }
        }

        return res;
    }

    private static int getLongestConsecutiveSequence(int[] numbers) {
        int res=1,cur=1;
        Arrays.sort(numbers); //nlog(n)

        for(int i=1;i<numbers.length;i++){
            if(numbers[i] == numbers[i-1]+1){
                cur++;
            }else{
                res=Math.max(res,cur);
                cur=1;
            }
        }
        return Math.max(res,cur);
    }
}
