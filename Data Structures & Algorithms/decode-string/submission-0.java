class Solution {
    public String decodeString(String s) {
        Stack<Character> stk = new Stack<>();
        char[] k = s.toCharArray();
        
        for(char i : k){
            if(i != ']'){
                stk.push(i);
            }
            else{
                String sub = "";
                while(!stk.isEmpty() && stk.peek() != '[') {
                    sub = stk.pop() + sub;
                }
                
                if (!stk.isEmpty()) {
                    stk.pop();
                }
                
                String numStr = "";
                while(!stk.isEmpty() && Character.isDigit(stk.peek())) {
                    numStr = stk.pop() + numStr;
                }
                int temp = numStr.isEmpty() ? 1 : Integer.parseInt(numStr);
                
                String repeated = sub.repeat(temp);
                for(char ch : repeated.toCharArray()) {
                    stk.push(ch);
                }
            }
        }
        
        StringBuilder finalRes = new StringBuilder();
        for (char ch : stk) {
            finalRes.append(ch);
        }
        return finalRes.toString();
    }
}