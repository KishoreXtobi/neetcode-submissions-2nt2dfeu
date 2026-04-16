class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> list = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(list.containsKey(nums[i])){
                list.put(nums[i],list.get(nums[i])+1);
            }
            else{
                list.put(nums[i],1);
            }
        }
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(list.get(nums[i])>count){
                count = list.get(nums[i]);
                max=nums[i];
            }
        }
        return max;
        
    }
}