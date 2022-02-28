class LinkedList
{
Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     Node prev = null;
     Node head = null;
     while(head1 != null &&  head2 != null){
         if(head1.data > head2.data){
             if(head == null){
                head = head2;
             }else{
                prev.next = head2;
             }
             prev = head2;
             head2 = head2.next;
         }else{
             if(head == null){
                head = head1;
             }else{
                prev.next = head1;
             }
             prev = head1;
             head1 = head1.next;
         }
    }
    while(head1 != null ){
            if(head == null){
                head = head1;
            }else{
                prev.next = head1;
            }
            prev = head1;
            head1 = head1.next;
    }
    while(head2 != null ){
            if(head == null){
                head = head2;
            }else{
                prev.next = head2;
            }
            prev = head2;
            head2 = head2.next;
    }
    return head;
   } 
}
