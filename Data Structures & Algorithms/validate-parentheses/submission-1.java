
class Solution {
    public boolean isValid(String s) {
        Character[] stack = new Character[s.length()];
        int len = s.length()-1;
        int te;
        if(s.charAt(len) == ']' || s.charAt(len) =='}' || s.charAt(len) ==')'){
            te = 0;
        }
        else{
            return false;
        }
        for (char i : s.toCharArray()){
            if(i == ']'){
                if(te == 0){
                    return false;
                }
                else if (stack[te-1]=='['){
                    te--;
                }
                else{
                    return false;
                }
            }
            else if(i == '}'){
                if(te == 0){
                    return false;
                }
                else if (stack[te-1]=='{'){
                    te--;
                }
                else{
                    return false;
                }
            }
            else if (i == ')'){
                if(te == 0){
                    return false;
                }
                else if (stack[te-1]=='('){
                    te--;
                }
                else{
                    return false;
                }
            }
            else if (i == '[' || i=='{' || i=='('){
                stack[te]=i;
                te++;
            }
            else{
                return false;
            }
        }
        if(te!=0){
            return false;
        }
        
        return true;
    }
}