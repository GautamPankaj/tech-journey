class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i=0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'R')
                y++;
            else if(ch == 'L')
                y--;
            else if(ch == 'U')
                x++;
            else if(ch == 'D')
                x--;
            else
                return false;
        }
        if(x ==0 && y == 0){
            return true;
        }
        return false;
    }
}
