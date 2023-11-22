package com.practise;

import java.util.Arrays;

public class MissingNumberFinder {

    public static int findMissingNumber(int[] arr) {
        Arrays.sort(arr); //We sort the array first in case it's unsorted
        int minimumValue = arr[0] - 1 ; // The minimum value should be the previous element from the given arrays first element
        int maximumValue = arr[arr.length-1]; // Last element of the given array
        int expectedSum = 0;
        if (minimumValue > 0 ){
            expectedSum = maximumValue * (maximumValue + 1)/2 - minimumValue * (minimumValue + 1)/2 ;
        } else {
            expectedSum = (arr.length * (arr.length +1)) / 2  ; // in case it starts from 0 then it is some of n natural numbers
        }
        int actualSum = 0;
        for (int j : arr) {
            actualSum += j;
        }
        return expectedSum-actualSum;
    }

}


