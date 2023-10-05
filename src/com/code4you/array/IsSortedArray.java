package com.code4you.array;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] numbers =
                //{8,10,15,20};
                //{10,10,10};
                //{10,8,9,20,30,25};
                {100};
        boolean sortedArray = isSortedArray(numbers);
        System.out.println("Is array sorted "+ sortedArray);

    }

    private static boolean isSortedArray(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numbers[i-1]){
                return false;
            }
        }

        return true;
    }

}
