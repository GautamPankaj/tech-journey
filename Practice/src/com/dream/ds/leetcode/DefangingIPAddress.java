class Solution {
    public String defangIPaddr(String address) {
        String[] ipDigits = address.split("\\.");
        String defangIPaddr = "";
        for(int i = 0; i < ipDigits.length; i++){
            if(i == 0)
                defangIPaddr = ipDigits[i];
            else
                defangIPaddr = defangIPaddr + "[.]" + ipDigits[i];
        }
        return defangIPaddr;
    }
}
