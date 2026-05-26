class Solution {
    public int removeDuplicates(int[] nums) {
        int temp = -1, k = 0;
        for ( int i : nums){
            if (temp != i){
                nums[k] = i;
                temp = i;
                k++;
            }
        }
        return k;
    }
}