package com.code4you.array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] number =
                {10,0,0,20,30,0,40};
                //{0,0,0,10,0,0,0,0};
                //{10,3,5,2,98};

        //moveZerosToEnd(number);
        //moveZerosToEndApproach2(number);
        moveZerosToEndApproach3(number);
        System.out.println("Moved 0s to end "+ Arrays.toString(number));
    }

    /*
    {10,0,0,20,30,0,40}
    {10,20,0,0,30,0,40}
    {10,20,30,40,0,0,0}
     */

    private static void moveZerosToEnd(int[] number) {

        int zeroIndex=0,nonZeroIndex=0;
        while(nonZeroIndex < number.length){
            while (zeroIndex < number.length && number[zeroIndex]!=0){
                zeroIndex++;
            }
            nonZeroIndex=zeroIndex+1;

            while (nonZeroIndex < number.length && number[nonZeroIndex]==0){
                nonZeroIndex++;
            }
            if(nonZeroIndex < number.length){
                swap(number,zeroIndex,nonZeroIndex);
            }
        }
    }

    /*
    10,20,30,40
     */
    private static void moveZerosToEndApproach2(int[] number) {
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]!=0){
                if(index==i)
                    index++;
                else
                    swap2(number,index++,i);
            }
        }

    }
    private static void moveZerosToEndApproach3(int[] number) {
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i]!=0){
                swap(number,index++,i);
            }
        }

    }
    private static void swap(int[] number, int zeroIndex, int nonZeroIndex){
        int temp = number[zeroIndex];
        number[zeroIndex]=number[nonZeroIndex];
        number[nonZeroIndex]=temp;
    }
    private static void swap2(int[] number, int zeroIndex, int nonZeroIndex){
       number[zeroIndex]=number[nonZeroIndex];
       number[nonZeroIndex]=0;
    }
}
