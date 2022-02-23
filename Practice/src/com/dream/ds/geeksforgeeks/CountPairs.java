    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        int count = 0;
        Iterator<Integer> head1Itr = head1.iterator();
        Iterator<Integer> head2Itr = head2.iterator();
        Set<Integer> set = new HashSet<Integer>();
        while(head1Itr.hasNext()){
            set.add(head1Itr.next());
        }
        while(head2Itr.hasNext()){
              if(!set.add(x - head2Itr.next()))
                    count++;
        }
        return count;
    }
