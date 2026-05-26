class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0, b = 0, c = m;
        
        while (a < c && b < n) {
            if (nums1[a] <= nums2[b]) {
                a++;
            } else {
                for (int i = c; i > a; i--) {
                    nums1[i] = nums1[i-1];
                }
                nums1[a] = nums2[b];
                b++;
                c++;
                a++; 
            }
        }
        
        while (b < n) {
            nums1[a] = nums2[b];
            a++;
            b++;
        }
    }
}