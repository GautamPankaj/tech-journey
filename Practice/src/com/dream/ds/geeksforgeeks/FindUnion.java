class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    Set<Integer> set = new TreeSet<Integer>();
	    Node temp1 = head1;
	    while(temp1 != null){
	        set.add(temp1.data);
	        temp1 = temp1.next;
	    }
	    temp1 = head2;
	    while(temp1 != null){
	        set.add(temp1.data);
	        temp1 = temp1.next;
	    }
       
        Node prev = null;
        Node head = null;
        Node temp = null;
        for(int i:set){
            if(prev == null){
                head = new Node(i);
                prev = head;
            }else{
                temp = new Node(i);
                prev.next = temp;
                prev = temp;
            }
        }
        return head;
	}
}
