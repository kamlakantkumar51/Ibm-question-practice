import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            int currentSpan = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            ans.add(currentSpan);

            stack.push(i);
        }

        return ans;
    }
}
