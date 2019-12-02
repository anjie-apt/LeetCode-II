package Stack;

import java.util.Stack;

/**
 * 根据逆波兰表示法，求表达式的值。
 有效的运算符包括+,-,*,/。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 说明：整数除法只保留整数部分。
 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况
 */
public class EvaluateReversePolishNotation {
    /***
     *
     * @param tokens：
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
