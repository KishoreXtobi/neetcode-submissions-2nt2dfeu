class Solution {
    public boolean validPalindrome(String s) {
        char[] letters = s.toCharArray();
        int lptr = 0, rptr = letters.length - 1, count = 0;
        
        int savedL = -1, savedR = -1;
        
        while (lptr < rptr) {
            if (letters[lptr] != letters[rptr]) {
                count++;
                if (count > 2) {
                    return false;
                }
                
                if (count == 1) {
                    savedL = lptr;
                    savedR = rptr;
                    lptr++; 
                } else if (count == 2) {
                    lptr = savedL;
                    rptr = savedR - 1; 
                }
            } else {
                lptr++;
                rptr--;
            }
        }
        return true;
    }
}