package com.jzedy.lc004;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Jzedy
 * @time 2019/3/27 19:06
 * @description
 */
public class Solution_004Median {

    @Test
    public void test(){
        int [] n1 = {1,2};
        int [] n2 = {3,4};
        System.out.println(findMedianSortedArrays(n1,n2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> sums = new ArrayList<>();
        for (int i : nums1) {
            sums.add(i);
        }
        for (int i : nums2) {
            sums.add(i);
        }

        Collections.sort(sums);

        int size = sums.size();
        if (size % 2 != 0){
            return sums.get(size/2);
        }else {
            return (sums.get(size/2)+sums.get(size/2 -1))/2.0;
        }


    }
}
