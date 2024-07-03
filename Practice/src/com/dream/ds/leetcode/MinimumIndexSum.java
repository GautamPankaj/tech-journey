class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<Integer, ArrayList<String>> map = new TreeMap<>(); 
        for(int i=0; i < list1.length; i++){
           for(int j=0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    System.out.println("matched");
                    if(map.get(i+j) != null){
                        ArrayList<String> tempList = map.get(i+j);
                        tempList.add(list1[i]);
                        map.put(i+j, tempList);
                    }
                    else{
                        ArrayList<String> strList = new ArrayList<String>( 
            Arrays.asList(list1[i])); 
                        map.put(i+j, strList);
                    }
                }
            }
        }
        ArrayList<String> value = new ArrayList<String>();
        for (Map.Entry<Integer,ArrayList<String>> entry : map.entrySet())  {
            value =  entry.getValue(); 
            break;
        }
        return value.stream().toArray(String[]::new);
    } 
}
