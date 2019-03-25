package com.cn.jzedy;

import org.junit.Test;

/**
 *
 * shit....  int  long  超出计算范围时候报错。。。。。。
 *
 * @author Jzedy
 * @time 2019/3/23 17:39
 * @description
 */
public class Solution_002_AddTwoNumbers {
    @Test
    public  void main() {
        ListNode l1 = arrayToNode(new int[]{5});
        ListNode l2 = arrayToNode(new int[]{5});
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println();
    }




    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int flag = 0;
        ListNode result = null;
        while (l1 != null || l2 != null || flag == 1){
            int l1v  =0;
            int l2v  =0;
            if (l1 != null) {
                l1v = l1.val;
            }
            if (l2 != null){
                l2v = l2.val;
            }

            int su = l1v + l2v + flag;

            flag = su / 10;


            if (result == null){
                result = new ListNode(su % 10);
            }else {
                ListNode t = result;
                while (t.next != null){
                    t = t.next;
                }
                t.next = new ListNode(su % 10);
            }

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }



        }

        return result;
    }


    private ListNode arrayToNode(int[] ints){
        if (ints.length == 0){
           return new ListNode(0);
        }
        ListNode result = null;
        for (int i = 0; i < ints.length; i++) {
            if (i == 0){
                result = new ListNode(ints[i]);
            }else {
                ListNode tmp = new ListNode(ints[i]);
                tmp.next = result;
                result = tmp;
            }
        }
        return result;
    }
    

     class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
