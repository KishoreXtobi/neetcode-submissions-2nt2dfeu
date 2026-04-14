class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<(nums.length);i++){
            int needed = target - nums[i];
            if(!(list.containsKey(needed))){
                list.put(nums[i],i);   
            }
            else{
                if(list.get(needed)>i){
                    num[0]=i;
                    num[1]=list.get(needed);
                }
                else{
                    num[1]=i;
                    num[0]=list.get(needed);
                }
                break;
            }
            
            System.out.println(list);
        }
        return num;
    }
}