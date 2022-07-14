package com.codedifferently.problem03;
import java.util.*;
public class Solution {

// if string we are currently looking at , is in key
    //return value

    public Integer[] stringToNumbers(String[] input) {
        Arrays.sort(input);
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);
        numbers.put("twenty", 20);

        HashMap<String, Integer> hashy = new HashMap<>();
        // split the String by a comma
        // iterate the parts and add them to a HashMap
        for (String part : input) {
            // split the  data by colon to get
            String numData[] = part.split(",");
            String nums = numData[0].trim();
            // Add to map
            hashy.put(nums, numbers.get(nums));

        }
        return hashy.values().toArray(new Integer[0]);

    }
}