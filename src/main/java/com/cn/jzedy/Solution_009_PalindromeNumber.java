package com.cn.jzedy;

import org.junit.Test;

/**
 * @author Jzedy
 * @time 19-3-31
 * @description
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 */
public class Solution_009_PalindromeNumber {

    @Test
    public void test(){
        System.out.println(isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        boolean result = true;
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length -i -1]){
                result = false;
                break;
            }
        }
        return result;
    }
}
