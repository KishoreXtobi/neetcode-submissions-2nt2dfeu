class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lptr = 0;
        int rptr = numbers.length - 1;
        
        while (lptr < rptr) {
            int sum = numbers[lptr] + numbers[rptr];
            
            if (sum == target) {
                return new int[] {lptr + 1, rptr + 1};
            } else if (sum < target) {
                lptr++;
            } else {
                rptr--;
            }
        }
        
        return new int[] {-1, -1};
    }
}