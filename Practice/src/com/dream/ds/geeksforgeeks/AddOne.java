class Solution
{
    public static Node addOne(Node head) 
    { 
        Node curr = head;
        Node prev = null;
        Node temp = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        int carryOver = 1;
        head = prev;
        while(head != null){
           if(head.data == 9 && carryOver == 1){
                head.data = 0;
                carryOver = 1;
           }else{
               head.data = head.data + carryOver;
               carryOver = 0;
           }
           if(carryOver == 1 && head.next == null){
               head.next = new Node(1);
               break;
           }
           head = head.next;
        }
        
        curr = prev;
        prev = null;
        temp = null;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
