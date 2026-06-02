
class Solution {
    public String simplifyPath(String path) {
        String[] components = path.split("/+");
        Stack <String> link = new Stack<>();
        for(String i : components){
            if(i.equals("..")){
                if(link.isEmpty()){
                    continue;
                }
                else{
                    link.pop();
                }
            }
            else if(i.equals(".") || i.equals("")){
                continue;
            }
            else{
                link.push(i);
            }
        }
        String[] result = new String[link.size()];
        int count=0;
        while(link.size()>0){
            result[count]=link.pop();
            count++;
        }
        String res = ""; 
        for(int i = result.length-1;i>=0;i--){
            res += "/" + result[i];
        }       
        return res.equals("")? "/" : res;
    }
}