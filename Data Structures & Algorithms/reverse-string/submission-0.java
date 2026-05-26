class Solution {
    public void reverseString(char[] s) {
        int lptr = 0, rptr = s.length - 1;
        while(lptr<rptr){
            char temp = s[lptr];
            s[lptr] = s[rptr];
            s[rptr]=temp;
            lptr++;
            rptr--;
        }
    }
}