class Solution {
    public int maxArea(int[] heights) {
        int lptr=0, rptr = heights.length-1, max_area=0;
        while(lptr<=rptr){
            int height = Math.min(heights[lptr],heights[rptr]);
            int width = rptr - lptr;
            int area = height * width;
            max_area=Math.max(area,max_area);
            if(heights[lptr]<heights[rptr]){
                lptr++;
            }
            else{
                rptr--;
            }

        }
        return max_area;
    }
}