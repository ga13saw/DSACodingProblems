package com.code4you.array;

public class LargetElement {
    public static void main(String[] args) {
        int[] numbers =
                //{10,2,8,1,20,17,5};
                //{30,9,100,20,45,90,105};
                {10,10,10};
        int largestElementIndex = getLargestElementIndex(numbers);
        System.out.println("Largest element index "+ largestElementIndex);

        int SecondLargestElementIndex = getSecondLargestElementIndex(numbers);
        System.out.println("2nd Largest element index "+ SecondLargestElementIndex);
    }

    //time complexity: O(n), space complexity - O(1)
    private static int getLargestElementIndex(int[] numbers) {
        int largestElementIndex = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>numbers[largestElementIndex]){
                largestElementIndex=i;
            }
        }
        return largestElementIndex;
    }

    //{10,2,8,1,20,17,5}
    private static int getSecondLargestElementIndex(int[] numbers) {
        int resultIndex = -1, largestEleIndex = 0;

        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>numbers[largestEleIndex] ){
                resultIndex=largestEleIndex;
                largestEleIndex=i;

            }else if(resultIndex >-1 && numbers[i]>numbers[resultIndex]){ //it will give 2nd largest
                resultIndex=i;
            }
        }
        return resultIndex;
    }
}
