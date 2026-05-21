class Solution {

    public String encode(List<String> strs) {
        String S = "";
        for (String str:strs) {
            int length=str.length();
            S+=length+ "#"+str;
        }
        return S;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int length = 0;
            while (str.charAt(i) != '#') {
                length=(length*10)+(str.charAt(i)-'0');
                i++;
            }
            i++;
            result.add(str.substring(i, i + length));
            i+=length;
        }
        return result;
    }
}