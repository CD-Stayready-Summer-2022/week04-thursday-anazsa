package com.codedifferently.problem02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String howManyLettersDoYouSee(String input) {

        int[] count = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            count[ch] +=1;
        }
        int maxcount = -1 ;
        char longest = 0 ;
        for( char ch : input.toCharArray()) {
            if(count[ch] > maxcount) {
                maxcount = count[ch];
                longest = ch ;
            }

        }
        return String.valueOf(longest)+ ":"+ String.valueOf(maxcount);




    }//main
}
