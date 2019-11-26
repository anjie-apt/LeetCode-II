package Stack;

import java.util.Stack;

/**
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        if (S.length() == 0 && T.length() == 0) {
            return true;
        }
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (!stack2.isEmpty()) stack2.pop();
            } else {
                stack2.push(T.charAt(i));
            }
        }
        if (stack1.size() != stack2.size()) return false;
        for (int i = 0; i < stack1.size(); i++) {
            if (stack1.get(i) != stack2.get(i)) {
                return false;
            }
        }
        return true;
    }
}
