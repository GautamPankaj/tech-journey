class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex < 0)
            return list;
        list.add(1);
        if(rowIndex == 0)
            return list;
        list.add(1);
        if(rowIndex == 1)
            return list;
        List<Integer> outputList = new ArrayList<Integer>();
        for(int i = 2; i <= rowIndex; i++){
            outputList = new ArrayList<Integer>();
            for(int j=0; j <= i; j++){
                if(j==0 || j == i)
                    outputList.add(1);
                else
                    outputList.add(list.get(j-1) + list.get(j));
            }
            list = outputList;
        }     
        return list;
    }
}
