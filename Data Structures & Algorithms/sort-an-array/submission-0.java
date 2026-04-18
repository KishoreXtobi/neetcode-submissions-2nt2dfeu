class Solution {
    public int[] sortArray(int[] nums) {
        int numslength = nums.length;
        if(numslength<2)
            return nums;
        int midlength = numslength/2;
        int[] left = new int[midlength];
        int[] right = new int[numslength - midlength];
        for(int i=0;i<midlength;i++){
            left[i]=nums[i];
        }
        for(int i=midlength;i<(numslength);i++){
            right[i - midlength]=nums[i];
        }
        sortArray(left);
        sortArray(right);
        int i=0, j=0, k=0;
        int leftval = left.length;
        int rightval = right.length;
        while(i<leftval && j<rightval){
            if(left[i]<=right[j]){
                nums[k]=left[i];
                i++;
            }
            else{
                nums[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<leftval){
            nums[k]=left[i];
            i++;
            k++;
        }
        while(j<rightval){
            nums[k]=right[j];
            j++;
            k++;
        }
        return nums;

    }
}