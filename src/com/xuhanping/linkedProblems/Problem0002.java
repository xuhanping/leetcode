package com.xuhanping.linkedProblems;

/**
 * @author xuhanping
 * @date 2020/10/24 3:53 下午
 */
public class Problem0002 {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode result = new ListNode(-1);
         ListNode node = result;
         int x = 0;
         while (l1 != null || l2 != null){
             int num = 0;
             if (l1 != null && l2 != null){
                 num = l1.val + l2.val + x;
                 l1 = l1.next;
                 l2 = l2.next;
             }else if (l1 == null){
                 num = l2.val + x;
                 l2 = l2.next;
             }else {
                 num = l1.val + x;
                 l1 = l1.next;
             }
             x = num / 10;
             num %= 10;
             node.next = new ListNode(num);
             node = node.next;
         }
         if (x != 0){
             node.next = new ListNode(x);
         }
         return result.next;
    }
}
