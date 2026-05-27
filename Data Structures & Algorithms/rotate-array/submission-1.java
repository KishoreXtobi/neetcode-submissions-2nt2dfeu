class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        int lptr = 0, rptr = nums.length-1;
        while(lptr<=rptr){
            int temp=nums[lptr];
            nums[lptr]=nums[rptr];
            nums[rptr]=temp;
            lptr++;
            rptr--;
        }
        lptr = 0;
        rptr = k-1;
        while(lptr<=rptr){
            int temp=nums[lptr];
            nums[lptr]=nums[rptr];
            nums[rptr]=temp;
            lptr++;
            rptr--;
        }
        lptr = k;
        rptr = nums.length-1;
        while(lptr<=rptr){
            int temp=nums[lptr];
            nums[lptr]=nums[rptr];
            nums[rptr]=temp;
            lptr++;
            rptr--;
        }

    }
}