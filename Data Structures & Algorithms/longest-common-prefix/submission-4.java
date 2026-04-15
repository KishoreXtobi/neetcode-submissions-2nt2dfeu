
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for (int i=0; i<strs[0].length(); i++){
            String z;
            String sub = strs[0].substring(0,i+1);
            for(int j=0; j<strs.length;j++){
                //System.out.println(sub);
                if (!(strs[j].startsWith(sub))){
                    //System.out.println("Entered");
                    z= sub.substring(0,i);
                    return z;
                }
            }
        }
        return strs[0];
    }
}