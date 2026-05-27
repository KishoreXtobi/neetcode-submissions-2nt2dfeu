class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int lptr = j+1, rptr = nums.length-1;
                while(lptr < rptr){
                    long sum = (long)nums[i]+nums[j]+nums[lptr]+nums[rptr];
                    if(sum == target){
                        List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[lptr], nums[rptr]));
                        Collections.sort(temp);
                        if (!res.contains(temp)) {
                            res.add(temp);
                        }
                        lptr++;
                        rptr--;
                    }
                    else if(sum < target){
                        lptr++;
                    }
                    else{
                        rptr--;
                    }
                }
            }
        }
        return res;
    }
}