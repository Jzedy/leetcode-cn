package com.cn.jzedy;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * shit....  int  long  超出计算范围时候报错。。。。。。
 *
 * @author Jzedy
 * @time 2019/3/23 17:39
 * @description
 */
public class Solution_002_AddTwoNumbers_old {
    @Test
    public  void main() {
        ListNode l1 = getListNode(11111111111L);
//        ListNode l1 = getListNode(1111111111);
        ListNode l2 = getListNode(11111111111L);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println();
    }

    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long a1,a2;long sum;double tmp=0d;
        a1 = a2 = 0;
        do {
            a1 = (long) ((Math.pow(10,tmp++)*l1.val)+a1);
            l1 = l1.next;
        }while (l1 != null);
        tmp = 0;
        do {
            a2 = (long) (Math.pow(10,tmp++)*l2.val)+a2;
            l2 = l2.next;
        }while (l2 != null);
        sum = a1 + a2;
        ListNode tNode = getListNode(sum);
        return tNode;
    }

    private  ListNode getListNode(long sum) {
        List<Integer> list = intToArray(sum);
//        ListNode result =null;
        ListNode tNode = null;
        for (int i = list.size()-1; i >= 0; i--) {
            ListNode t = new ListNode(list.get(i));
            if (i ==  list.size()-1){
                tNode = new ListNode(list.get(i));
            }else {
                t.next = tNode;
                tNode = t;
//                result = t;
            }

        }
        return tNode;
    }

      List<Integer> intToArray(long x){
        List<Integer> result = new LinkedList<>();
        if (0 <=x && x <10){
            result.add((int) x);
            return result;
        }
        long tmp = 1,t;
        while ((t = (long) (x/Math.pow(10,tmp))) != 0){
            if (tmp == 1){
                result.add((int) (x%10));
                result.add((int) (t%10));
            }else {
                result.add((int) (t%10));
            }
            tmp ++;
        }
        return result;
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
