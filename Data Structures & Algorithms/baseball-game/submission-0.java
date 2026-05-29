class Solution {
    public int calPoints(String[] operations) {
        // Implement logic here using an appropriate linear data structure (like a Stack)
        int[] stack = new int[operations.length];
        int te = 0;
        for (String i : operations){
            if(i.equals("+")){
                int temp = stack[te-1];
                temp+=stack[te-2];
                stack[te]=temp;
                te++;
            }
            else if(i.equals("C")){
                te--;
            }
            else if (i.equals("D")){
                stack[te]=2*stack[te-1];
                te++;
            }
            else{
                stack[te]=Integer.parseInt(i);
                te++;
            }
        }
        int sum = 0;
        for(int i=0; i<te;i++){
            sum+=stack[i];
        }
        
        return sum;
    }
}