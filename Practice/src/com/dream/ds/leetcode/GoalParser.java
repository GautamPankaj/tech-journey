class Solution {
    public String interpret(String command) {
        String[] goal = new String[] {"G", "()", "(al)"};
        StringBuilder sb = new StringBuilder();
        while(command.length() > 0){
            if(command.startsWith(goal[0])){
                sb.append("G");
                command = command.substring(1);
            }
            if(command.startsWith(goal[1])){
                sb.append("o");
                command = command.substring(2);
            }
            if(command.startsWith(goal[2])){
                sb.append("al");
                command = command.substring(4);
            }
        }
        return sb.toString();
    }
}
