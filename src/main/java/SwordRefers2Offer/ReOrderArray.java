package SwordRefers2Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public void reOrderArray(int[] array) {
        //第一种方法，空间换时间，用两个list分别存储奇数和偶数，再替换回原数组
        if (array.length == 0) return;
//        List<Integer> odd = new ArrayList<>();
//        List<Integer> even = new ArrayList<>();
//        for (int num : array) {
//            if ((num & 1) == 1) {
//                odd.add(num);
//            } else {
//                even.add(num);
//            }
//        }
//        int index = 0;
//        for (int num : odd) {
//            array[index] = num;
//            index++;
//        }
//        for (int num : even) {
//            array[index] = num;
//            index++;
//        }
        //TODO:冒泡排序实现
    }
}
