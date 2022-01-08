class Solution {
    public String addStrings(String num1, String num2) {
        int sum = 0;
        int carryOver=0;
        int remainder=0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 && j >= 0){

            sum = Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(j))) + carryOver;
            if(sum > 9){
                carryOver = 1;
                remainder = sum % 10;
            }else{
                carryOver = 0;
                remainder = sum;
            }
            sb.append(String.valueOf(remainder));
            i--;
            j--;
        }
        while(i >= 0){
            sum = Integer.parseInt(String.valueOf(num1.charAt(i))) + carryOver;
            if(sum > 9){
                carryOver = 1;
                remainder = sum % 10;
            }else{
                carryOver = 0;
                remainder = sum;
            }
            sb.append(String.valueOf(remainder));
            i--;
        }
        while(j >= 0){
            sum = Integer.parseInt(String.valueOf(num2.charAt(j))) + carryOver;
            if(sum > 9){
                carryOver = 1;
                remainder = sum % 10;
            }else{
                carryOver = 0;
                remainder = sum;
            }
            sb.append(String.valueOf(remainder));
            j--;
        }
        if(carryOver == 1)
             sb.append(String.valueOf(carryOver));
        return sb.reverse().toString();
    }
}
