package Stack;

import java.util.Stack;

/**
 * 你现在是棒球比赛记录员。
 * 给定一个字符串列表，每个字符串可以是以下四种类型之一：
 * 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
 * 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效回合得分的总和。
 * 3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效回合得分的两倍。
 * 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效回合的分数是无效的，应该被移除。
 * <p>
 * 每一轮的操作都是永久性的，可能会对前一轮和后一轮产生影响。
 * 你需要返回你在所有回合中得分的总和。
 */
public class BaseballGame {
    public int calPoints(String[] ops) {
        if (ops.length == 0) return 0;
        int res = 0;
        Stack<Integer> val = new Stack<Integer>();
        for (String str : ops) {
            if (str.equals("+")) {
                int oldPeek = val.pop();
                int newPeek = val.peek();
                val.push(oldPeek);
                val.push(oldPeek + newPeek);
            } else if (str.equals("D")) {
                val.push(val.peek() * 2);
            } else if (str.equals("C")) {
                val.pop();
            } else {
                val.push(Integer.parseInt(str));
            }
        }
        while (!val.isEmpty()) {
            res += val.pop();
        }
        return res;
    }
}
