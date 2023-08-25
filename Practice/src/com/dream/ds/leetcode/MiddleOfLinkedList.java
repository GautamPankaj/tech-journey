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
    public ListNode middleNode(ListNode head) {
        ListNode fastTemp = head;
        ListNode slowTemp = head;
        while(fastTemp.next != null){
            if(fastTemp.next.next != null){
                fastTemp = fastTemp.next.next;
                slowTemp = slowTemp.next;
            }else{
                slowTemp = slowTemp.next;
                return slowTemp;
            }
        }
        return slowTemp;
    }
}
