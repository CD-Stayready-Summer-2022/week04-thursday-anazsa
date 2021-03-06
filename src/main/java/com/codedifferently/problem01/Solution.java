package com.codedifferently.problem01;

import javax.swing.*;
import java.util.*;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     *
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers) {
        Arrays.sort(allNumbers);
        HashMap<Integer, Integer> newHash = new HashMap<>();

        for (int i=0; i<allNumbers.length-1; i++) {
            if (allNumbers[i+1]==allNumbers[i]+1)
                return String.valueOf(allNumbers[i+1]);
        }

        return null;
    }

}

