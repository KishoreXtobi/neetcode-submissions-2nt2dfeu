class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> list = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String a = strs[i];
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (list.containsKey(key)) {
                list.get(key).add(a);
            }
            else {
                ArrayList<String> z = new ArrayList<>();
                z.add(a);             
                list.put(key, z);
            }
        }
        return new ArrayList<>(list.values());
        
    }
}