
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Float> map = new HashMap<>();
        for(int i =0 ; i<position.length;i++){
            float time = (float)(target - position[i]) / speed[i];
            map.put(position[i],time);
        }
        Arrays.sort(position);
        Stack <Float> stack = new Stack<>();
        for (int i = position.length - 1; i >= 0; i--) {
            float time = map.get(position[i]);
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }
        return stack.size();
    }
}