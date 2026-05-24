class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        int n = nums.length;
        int threshold = n / 3;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > threshold) {
                    result.add(nums[i - 1]);
                }
                count = 1; 
            }
        }
        if (count > threshold) {
            result.add(nums[n - 1]);
        }
        
        return result;
    }
}