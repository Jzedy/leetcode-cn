package com.jzedy.lc005;

import org.junit.Test;

/**
 * @author Jzedy
 * @time 2019/3/27 21:16
 * @description
 */
public class Solution_005_LongestPalindromicSubstring {

    @Test
    public void test(){
        char [] chars = {'a','b','a'};
        System.out.println(longestPalindrome("abdcac"));
    }

    public String longestPalindrome(String s) {
        if (s == null || s.trim().length() == 0) return s;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (check(chars,j,chars.length-1+j-i)){
                    return String.valueOf(chars).substring(j,chars.length+j-i);
                }
            }

        }
        return String.valueOf(chars[0]);
    }

    private boolean check(char[] chars,int start,int end){
        for (;start <= end;start++,end--){
            if (chars[start] != chars[end]){
                return false;
            }
        }
        return true;
    }
}
