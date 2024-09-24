class Solution {
    public String convertDateToBinary(String date) {
        String[] dateArray = date.split("-");
        StringBuilder binaryDate = new StringBuilder();
        for(int l =0; l < dateArray.length ; l++){
            if(binaryDate.length() > 0)  
                binaryDate.append("-");
            int[] binaryNum = new int[1000];
 
            // counter for binary array
            int i = 0;
            int n = Integer.parseInt(dateArray[l]);
            while (n > 0) 
            {
                // storing remainder in binary array
                binaryNum[i] = n % 2;
                n = n / 2;
                i++;
            }
 
            // printing binary array in reverse order
            StringBuilder tempDate = new StringBuilder();
            for (int j = i - 1; j >= 0; j--)
                tempDate.append(String.valueOf(binaryNum[j]));
            
            binaryDate.append(tempDate);
        }
        return binaryDate.toString();
            
    }
}
