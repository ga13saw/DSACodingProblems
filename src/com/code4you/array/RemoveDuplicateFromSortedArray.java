package com.code4you.array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] numbers =
                {10,20,30,30,30,30};
                //{10,20,20,20,30,40};
                //{10,10,10};
                //{10,20,20,20,30,40,40};
                //{10,20,20,30,40,40};
                //{12,15,18,22,28};
        //removeDuplicateFromArray(numbers);
        //System.out.println("Array post deletion of duplicate element "+ Arrays.toString(numbers));

        removeDuplicateFromArray2(numbers);
        System.out.println("Array post deletion of duplicate element "+ Arrays.toString(numbers));

//        int[] result = removeDuplicateElementUsingExtraArray(numbers);
//        System.out.println("Array post deletion of duplicate element2 "+ Arrays.toString(result));
//        removeDuplicateElementFromArrayEfficientWay(numbers);
//        System.out.println("Array post removing duplicate element "+ Arrays.toString(numbers));
    }
    /*
    {10,20,20,20,30,40,40};
    {10,20,0,0,30,40,40} s=1, f=4
    {10,20,30,0,0,40,40} s=3, f=5
     {10,20,30,40,0,0,40} s=3, f=6
     {10,20,30,40,0,0,40} s=4, f=6
     {10,20,30,40,0,0,0} s=4, f=7

     */
    private static void removeDuplicateFromArray(int[] numbers) {
        int slowIndex = 0, fastIndex=1;
        while(fastIndex<numbers.length){
            if(numbers[slowIndex]==0){
                numbers[slowIndex]=numbers[fastIndex];
                numbers[fastIndex++]=0;
            }
            else if(numbers[slowIndex]!=numbers[fastIndex]){
                slowIndex++;
                fastIndex++;
            }else {
                while (fastIndex<numbers.length && numbers[slowIndex]==numbers[fastIndex]){
                    numbers[fastIndex++]=0;
                }
                if(fastIndex<numbers.length){
                    numbers[slowIndex+1] = numbers[fastIndex];
                    numbers[fastIndex++]=0;
                    slowIndex+=2;
                }

            }
        }
    }
    private static void removeDuplicateFromArray2(int[] numbers) {
        int slowIndex = 0, fastIndex=0;
        while(fastIndex<numbers.length){
            if(numbers[slowIndex]!=numbers[fastIndex]){
                numbers[++slowIndex]=numbers[fastIndex];
            }
            fastIndex++;
        }
        while (++slowIndex<numbers.length){
            numbers[slowIndex]=0;
        }
    }
    //{10,20,20,20,30,40,40};
    private static int[] removeDuplicateElementUsingExtraArray(int[] numbers){
        int[] result = new int[numbers.length];
        result[0]=numbers[0];
        int slowIndex = 0, fastIndex=1,resultIndex=0;
        while(fastIndex<numbers.length){
            if(numbers[slowIndex]!=numbers[fastIndex]){
                result[resultIndex++]=numbers[slowIndex];
                slowIndex=fastIndex;
                fastIndex++;
            }else{
                fastIndex++;
            }
        }
        return result;
    }

    //{10,20,30,20,30,40,40};
    private static void removeDuplicateElementFromArrayEfficientWay(int[] numbers){
        int resultIndex = 1;
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]!=numbers[resultIndex-1]){
                numbers[resultIndex]=numbers[i];
                resultIndex++;
            }
        }
        while (resultIndex<numbers.length){
            numbers[resultIndex++]=0;
        }
    }


}
