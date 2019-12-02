package Stack;

import java.util.HashMap;
import java.util.Stack;


/**
 * 给定两个没有重复元素的数组nums1 和nums2，其中nums1是nums2的子集。找到nums1中每个元素在nums2中的下一个比其大的值。
 * nums1中数字x的下一个更大元素是指x在nums2中对应位置的右边的第一个比x大的元素。如果不存在，对应位置输出-1。
 */
public class  NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[nums1.length];
        //对nums2使用单调栈，从后向前遍历，当栈不为空且待入栈元素大于当前栈顶元素，将栈顶元素出栈
        // 根据栈是否为空来获取下一个更大的数，如果栈为空，表示没有比他更大的数；如果不为空，那么栈顶元素就是下一个比他大的元素
        //在入栈之前先使用一个HashMap来记录nums2中每个元素的下一个更大数，nums1中的数直接根据map的键获取即可
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            int nextGreaterNumber = stack.isEmpty() ? -1 : stack.peek();
            map.put(nums2[i], nextGreaterNumber);
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}
