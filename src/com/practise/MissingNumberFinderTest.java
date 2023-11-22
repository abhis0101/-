package com.practise;

import org.junit.Test;
import static org.junit.Assert.*;

public class MissingNumberFinderTest {

    // All test case are below including few edge cases 
    @Test
    public void testFindMissingNumber() {
        // Test case 1: Input {5, 0, 1, 3, 2}, output should be 4
        int[] input1 = {5, 0, 1, 3, 2};
        int expectedOutput1 = 4;
        assertEquals(expectedOutput1, MissingNumberFinder.findMissingNumber(input1));

        // Test case 2: Input {7, 9, 10, 11, 12}, output should be 8
        int[] input2 = {7, 9, 10, 11, 12};
        int expectedOutput2 = 8;
        assertEquals(expectedOutput2, MissingNumberFinder.findMissingNumber(input2));

        // Test case 3: Input {1, 2, 3, 4}, output should be 0 (missing number is at the beginning)
        int[] input3 = {1, 2, 3, 4};
        int expectedOutput3 = 0;
        assertEquals(expectedOutput3, MissingNumberFinder.findMissingNumber(input3));

        // Test case 4: Input {0, 1, 2, 3, 4}, output should be 5 (missing number is at the end)
        int[] input4 = {0, 1, 2, 3, 4};
        int expectedOutput4 = 5;
        assertEquals(expectedOutput4, MissingNumberFinder.findMissingNumber(input4));

    }
}

