package com.jzedy.lc006;

import org.junit.Test;

/**
 *
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R
 * E   O E   I I
 * E C   I H   N
 * T     S     G
 *
 * @author Jzedy
 * @time 19-3-28
 * @description
 */
public class Solution_006_zigzag {
    @Test
    public void test(){
        Solution_006_zigzag type = new Solution_006_zigzag();
        String result = type.convert("AB", 1);
        System.out.println(result);
    }

    /**
     * LEETCODEISHIRING LDREOEIIECIHNTSG
     *
     *  L           D           R
     *  E       O   E       I   I
     *  E   C       I   H       N
     *  T           S           G
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {

        if (s == null || s.trim().length() == 0 || numRows == 1){
            return s;
        }

        char[] chars = s.toCharArray();
        int [] ints = new int[s.length()];
        int i = 0;
        boolean flag = true;
        for (int j = 0; j < chars.length; j++) {
            if (flag) {
                ints[j] = i++;
            }else {
                ints[j] = i--;
            }
            if (i == numRows - 1) flag = false;
            if (i == 0) flag = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            for (int k = 0; k < ints.length; k++) {
                if (ints[k] == j) sb.append(chars[k]);
            }
        }

        return sb.toString();
    }
}
