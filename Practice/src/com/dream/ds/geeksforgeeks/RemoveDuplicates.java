    public Node removeDuplicates(Node head) 
    {
         Set<Integer> set = new HashSet<Integer>();
         Node temp  = head;
         Node prev = null;
         while(temp != null){
             if(!set.isEmpty() && set.contains(temp.data)){
                 prev.next = temp.next;
             }else{
                set.add(temp.data);
                prev = temp;
             }
             temp = temp.next;
         }
         return head;
    }
