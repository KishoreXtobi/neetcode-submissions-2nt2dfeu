class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=0,min=0,seq=0;
        HashSet<Integer> count = new HashSet<>();
        for(int i : nums){
            set.add(i);
            if(i>max) max=i;
            if(i<min) min=i;
        }
        int i=min;
        while(i <= max){
            if(set.contains(i)){
                seq++;
                i++;
            }

            else{
                count.add(seq);
                seq=0;
                i++;
                continue;
            }
        }
        count.add(seq);
        int result=0;
        for(int j : count){
            if(j>result) result=j;
        }
        return result;
    }
}