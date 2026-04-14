class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> S=new HashMap<>();
        HashMap<Character,Integer> T = new HashMap<>();
        boolean isanagram=false;
        if(s.length()!=t.length()){
                return false;
        }
        for (int i=0; i<s.length();i++){
            char ch =s.charAt(i);
            char sh = t.charAt(i);
            if (S.containsKey(ch)){
                S.put(ch,S.get(ch)+1);
            }
            else{
                S.put(ch,1);
            }
            if (T.containsKey(sh)){
                T.put(sh,T.get(sh)+1);
            }
            else{
                T.put(sh,1);
            }
            
        }
        if (S.equals(T)){
            isanagram=true;
        }
        return isanagram;
    }
}