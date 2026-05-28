class Solution {
    public int trap(int[] height) {
        int rmax = 0;
        
        int lptr = 0, rptr = lptr + 1, block = 0;
        while (rptr < height.length) {
            if (height[lptr] == 0) {
                lptr++;
                rptr++;
                continue;
            }
            if (height[rptr] >= height[lptr]) {
                rmax += Math.min(height[lptr], height[rptr]) * (rptr - 1 - lptr) - block;
                block = 0;
                lptr = rptr;
                rptr = lptr + 1;
            } else {
                block += height[rptr];
                rptr++;
            }
        }

        lptr = height.length - 1; 
        rptr = lptr - 1; 
        block = 0;
        while (rptr >= 0) {
            if (height[lptr] == 0) {
                lptr--;
                rptr--;
                continue;
            }
            if (height[rptr] > height[lptr]) { 
                rmax += Math.min(height[lptr], height[rptr]) * (lptr - 1 - rptr) - block;
                block = 0;
                lptr = rptr;
                rptr = lptr - 1;
            } else {
                block += height[rptr];
                rptr--;
            }
        }

        return rmax;
    }
}