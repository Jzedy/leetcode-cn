package com.cn.jzedy;

import org.junit.Test;

/**
 * @author Jzedy
 * @time 19-3-29
 * @description
 */
public class Solution_007_ReverseInteger {

    @Test
    public void test(){
        System.out.println(reverse(Integer.MAX_VALUE));
    }

    public int reverse(int x) {
        String str;
        StringBuilder s = new StringBuilder();
        s.append(x);
        try {
            if (x < 0){
                StringBuilder builder = s.delete(0, 1);
                str = builder.reverse().toString();
                return 0-Integer.valueOf(str);
            }else{
                str = s.reverse().toString();
                return Integer.valueOf(str);
            }
        }catch (Exception e){
            return 0;
        }

    }
}
