class MyHashMap {
    int[] map;
    boolean[] val;
    public MyHashMap() {
        map = new int[10000001];
        val = new boolean[10000001];
    }
    
    public void put(int key, int value) {
        map[key]=value;
        val[key]=true;
        
    }
    
    public int get(int key) {
        if(val[key]==true){
            return map[key];
        }
        else{
            return -1;
        }
    }
    
    public void remove(int key) {
        val[key]=false;
    }
}
/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */