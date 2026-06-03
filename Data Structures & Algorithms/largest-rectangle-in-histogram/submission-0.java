class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int max = heights[0];
        
        for (int i = 0; i < heights.length; i++) {
            if (stk.isEmpty()) {
                stk.push(i);
            }
            else if (heights[i] >= heights[stk.peek()]) {
                stk.push(i);
            }
            else {
                while (stk.size() > 0 && heights[stk.peek()] > heights[i]) {
                    int targetIndex = stk.pop();
                    int height = heights[targetIndex];
                    int width = stk.isEmpty() ? i : i - stk.peek() - 1;
                    
                    int temp = height * width;
                    if (temp > max) {
                        max = temp;
                    }
                }
                stk.push(i);
            }
        }
        
        if (!stk.isEmpty()) {
            while (stk.size() > 0) {
                int targetIndex = stk.pop();
                int height = heights[targetIndex];
                int width = stk.isEmpty() ? heights.length : heights.length - stk.peek() - 1;
                
                int temp = height * width;
                if (temp > max) {
                    max = temp;
                }
            }
        }

        return max;
    }
}