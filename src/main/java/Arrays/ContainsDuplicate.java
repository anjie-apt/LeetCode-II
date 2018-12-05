package Arrays;

import java.util.HashMap;


public class ContainsDuplicate {
    /**
     * @param nums:整数数组
     * @return:是否包含重复元素 思路：使用HashMap进行存储，Key：数组元素 Value：出现次数，存在重复键值，则返回TRUE
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
