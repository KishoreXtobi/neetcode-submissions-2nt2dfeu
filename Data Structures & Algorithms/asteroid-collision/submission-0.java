class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();

        for (int i : asteroids) {
            if (i > 0) {
                stk.push(i);
            } else {
                boolean alive = true;

                while (!stk.isEmpty() && stk.peek() > 0 && alive) {
                    int top = stk.peek();
                    int currentMagnitude = Math.abs(i);

                    if (top < currentMagnitude) {
                        stk.pop();
                    } else if (top == currentMagnitude) {
                        stk.pop();
                        alive = false; 
                    } else {
                        alive = false;
                    }
                }

                if (alive) {
                    stk.push(i);
                }
            }
        }

        int[] res = new int[stk.size()];
        for (int j = res.length - 1; j >= 0; j--) {
            res[j] = stk.pop();
        }

        return res;
    }
}