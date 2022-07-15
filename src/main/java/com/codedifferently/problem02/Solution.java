package com.codedifferently.problem02;

import java.util.*;


//turn string to char array
//count how many times the char appears
//increment count for each letter
// ush some time of map
public class Solution {
    public String howManyLettersDoYouSee(String input) {
        int count =1;
        LinkedHashMap<Character,Integer> hashy = new LinkedHashMap<>();
        char[] newChar = input.toCharArray();
        for (int i = 0; i < newChar.length; i++){
            hashy.put(newChar[i],count);
            if(hashy.containsKey(newChar[i])){
                count++;
            }
        }
        return null;
    }
}
