package com.code4you.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDistinctElementInEveryWindow {
    public static void main(String[] args) {
        int[] number =
                //{10,20,20,10,30,40,10};
                //{10,10,10,10};
                {10,20,30,40};
        int k=
                //4;
                //3;
                3;
        List<Integer> result = getDistinctCountElementInEveryWindow(number,k);
        System.out.println(result);
    }

    private static List<Integer> getDistinctCountElementInEveryWindow(int[] number,int k) {
        Set<Integer> numSet = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        int n = number.length - k + 1;  //n- number of iteration in array
        for(int i=0;i<n;i++){
            for(int j=i;j<i+k;j++){
                numSet.add(number[j]);
            }
            result.add(numSet.size());
            numSet.clear();
        }
        return result;
    }
}
