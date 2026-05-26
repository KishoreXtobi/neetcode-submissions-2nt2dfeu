class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        String s = "";
        int ptr1 = 0, ptr2=0;
        while(ptr1 < len1 && ptr2 < len2){
            s += word1.charAt(ptr1++);
            s += word2.charAt(ptr2++);
        }
        while(ptr1 < len1){
            s += word1.charAt(ptr1++);
        }
        while(ptr2 < len2){
            s += word2.charAt(ptr2++);
        }
        return s;
    }
}