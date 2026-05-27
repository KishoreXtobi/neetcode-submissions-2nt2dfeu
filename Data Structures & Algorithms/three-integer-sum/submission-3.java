class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) return res;
        
        int a = 0, b = 1, c = 2;
        while (a < nums.length - 2) {
            int sum = nums[a] + nums[b] + nums[c];
            if (sum == 0) {
                List<Integer> temp = new ArrayList<>(Arrays.asList(nums[a], nums[b], nums[c]));
                Collections.sort(temp);
                if (!res.contains(temp)) {
                    res.add(temp);
                }
            }
            
            c++;
            if (c == nums.length) {
                b++;
                if (b >= nums.length - 1) {
                    a++;
                    b = a + 1;
                }
                c = b + 1;
            }
            
            if (a >= nums.length - 2) {
                break;
            }
        }
        return res;
    }
}