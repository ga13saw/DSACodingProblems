package com.code4you.hashmap;

import java.util.Arrays;

public class LinerProbing {
    public static void main(String[] args) {
        int[] arr = {4,14,24,44,4};
        long start = System.currentTimeMillis();
        int[] rs = linearProbing(10,arr,4);
        System.out.println("time taken "+ (System.currentTimeMillis() - start));
        System.out.println(Arrays.toString(rs));
    }
    static int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        int[] result = new int[hash_size];
        Arrays.fill(result, -1);
        for(int i=0;i<sizeOfArray;i++){
            int index = arr[i]%hash_size;

            if(isFilled(result,index) && arr[i]!=result[index]){
                int newIndex = getNewIndex(arr,i,hash_size,result);
                result[newIndex] = arr[i];
                continue;
            }
            result[index]=arr[i];
        }
        return result;
    }
    private static boolean isFilled(int[] arr, int index){
        return arr[index]!=-1;
    }
    private static int getNewIndex(int[] arr, int i, int hash_size, int[] result){
        int newIndex = (arr[i]+1)%hash_size;
        while(isFilled(result,newIndex)){
            newIndex = (newIndex+1)%10;
        }

        return newIndex;
    }

}
