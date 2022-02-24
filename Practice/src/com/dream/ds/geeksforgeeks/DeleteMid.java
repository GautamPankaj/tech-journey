class Solution {
    Node deleteMid(Node head) {
        if(head == null)
            return null;
        if(head.next == null)
            return null;
        int lengthOfList = 0;
        Node temp = head;
        while(temp != null){
            lengthOfList++;
            temp = temp.next;
        }
        int middleNo = lengthOfList/2+1;
        temp = head;
        Node prev = null;
        while(true){
            if(middleNo == 1){
               prev.next = temp.next;
               break;
            }
            middleNo--;
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
