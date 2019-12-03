package Arrays;

import java.util.HashMap;


/**
 *给定一个整数数组，判断是否存在重复元素。
 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */
public class ContainsDuplicate {
    /**
     * @param nums:整数数组
     * @return :是否包含重复元素
     * 思路：使用HashMap进行存储，Key：数组元素 Value：出现次数，存在重复键值，则返回TRUE
     * 复杂度分析：最坏情况下遍历整个数组，时间复杂度为O(N)，创建了一个hashmap，空间复杂度为O(N)
     */
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(i, 1);
            }
        }
        return false;
    }
}
