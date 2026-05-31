class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int result = 0;
        for(String i : tokens){
            if(i.equals("+")){
                int temp=(stk.pop()+stk.pop());
                result+=temp;
                stk.push(temp);
            }
            else if(i.equals("-")){
                int temp=(-1*stk.pop() + stk.pop());
                result+=temp;
                stk.push(temp);
            }
            else if(i.equals("*")){
                int temp=(stk.pop()*stk.pop());
                result+= temp;
                stk.push(temp);
            }
            else if (i.equals("/")){
                int x = stk.pop();
                int y = stk.pop();
                int temp=(y/x);
                result+=temp;
                stk.push(temp);
            }
            else{
                stk.push(Integer.parseInt(i));
            }
        }
      
        return stk.pop();
    }
}