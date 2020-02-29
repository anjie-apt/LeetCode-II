package SwordRefers2Offer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class SumOfTwoNumberEqualsS {
    public ArrayList<Integer> get(int[] array, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) return res;
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int curSum = array[start] + array[end];
            if (curSum == target) {
                res.add(array[start]);
                res.add(array[end]);
                break;
            } else if (curSum > target) {
                end--;
            } else {
                start++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6, 7, 9};
        int target = 8;
        ArrayList<Integer> res = new SumOfTwoNumberEqualsS().get(array, target);
        System.out.println(res);
    }
}
