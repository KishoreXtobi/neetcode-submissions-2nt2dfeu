class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int lptr = 0; lptr < nums.length; lptr++) {
            int sum = 0;
            for (int rptr = lptr; rptr < nums.length; rptr++) {
                sum += nums[rptr];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}