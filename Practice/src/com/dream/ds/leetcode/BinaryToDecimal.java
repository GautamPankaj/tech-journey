/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int elementInList = 0;
        ListNode temp = head;
        while(temp != null){
            elementInList++;
            temp = temp.next;
        }
        int decimalValue = 0;
        while(head != null){
            decimalValue = decimalValue + (int) (Math.pow(2,--elementInList)) * head.val;
            head = head.next;
        }
        return decimalValue;
    }
}
