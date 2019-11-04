package Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    /***
     *
     * @param tokens£º
     * @return
     */
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }

        Stack<Integer> stack = new Stack<Integer>();
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                stack.push(-stack.pop() + stack.pop());
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                int num = stack.pop();
                stack.push(stack.pop() / num);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
