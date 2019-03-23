package com.cn.jzedy;

import java.util.Arrays;

/**
 * @author Jzedy
 * @time 2019/3/23 17:39
 * @description
 */
public class Solution_001_TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Arrays.stream(twoSum(nums,target)).forEach(e-> System.out.println(e));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length -1; j > i ; j--) {
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
