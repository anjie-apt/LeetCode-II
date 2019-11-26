package Stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 */
public class NextGreaterNumberII {
    public int[] nextGreaterElements(int[] nums) {
        //实现循环数组的暴力方法：
        // (1)把数组复制成原来的两倍
        int[] newNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length * 2; i++) {
            newNums[i] = nums[i % nums.length];
        }
        //(2)取模
        int[] res = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        //单调栈保存下一个更大值，注意边界条件 i >= 0，
        for (int i = newNums.length - 1; i >= 0; i--) {
            //出栈条件是数组元素大于等于当前栈顶元素
            while (!stack.isEmpty() && newNums[i] >= stack.peek()) {
                stack.pop();
            }
            int nextGreaterNum = stack.isEmpty() ? -1 : stack.peek();
            //HashMap保存下标作为键值，防止产生键冲突，值被覆盖
            map.put(i, nextGreaterNum);
            stack.push(newNums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            res[i] = map.get(i);
        }
        return res;
    }
}
