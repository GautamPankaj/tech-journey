class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> entrySet = new HashSet();
        HashSet<String> exitSet = new HashSet();
        for (List<String> cities : paths) { 
            entrySet.add(cities.get(0));
            exitSet.add(cities.get(1));
        }
        String output = "";
        for (String exitCity : exitSet) {
           if(!entrySet.contains(exitCity)){
                output = exitCity;
           }
        }
        return output;
    }
}
