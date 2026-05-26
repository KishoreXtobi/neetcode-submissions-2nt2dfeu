class Solution {
    
    public boolean isPalindrome(String s) {
        int lptr = 0;
        int rptr = s.length() - 1;
        for(char i : s.toCharArray()) {
            if(Character.isLetterOrDigit(i)) {
                while(!Character.isLetterOrDigit(s.charAt(lptr))) lptr++;
                while(!Character.isLetterOrDigit(s.charAt(rptr))) rptr--;
                if(Character.toLowerCase(s.charAt(lptr)) != Character.toLowerCase(s.charAt(rptr))) return false;
                lptr++;
                rptr--;
            }

        }
        return true;
    }
}