class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	int noOfNodes = 0;
    	Node temp = head;
    	while(temp != null){
    	    noOfNodes++;
    	    temp = temp.next;
    	}
    	if(noOfNodes < n)
    	    return -1;
    	int count=0;
    	temp = head;
    	while(count <= noOfNodes-n-1){
    	    count++;
    	    temp = temp.next;
    	}
    	return temp.data;
    	
    	
    }
}
