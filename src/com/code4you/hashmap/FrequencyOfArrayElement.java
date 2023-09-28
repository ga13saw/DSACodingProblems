package com.code4you.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElement {

    public static void main(String[] args) {
        int[] numbers = {10,20,10,15,30,10,20};
        frequencyOfArrayElement(numbers);
    }

    //time complexity - O(n), space complexity - O(n)
    private static void frequencyOfArrayElement(int[] numbers) {
        Map<Integer,Integer> numberMap = new HashMap<>();
        for(int number : numbers){
            numberMap.put(number,numberMap.getOrDefault(number,0)+1);
        }
        System.out.println(numberMap);
    }
}
