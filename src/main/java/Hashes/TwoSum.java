package Hashes;

import java.util.HashMap;

public class TwoSum {
    /**
     * @param nums:整数数组
     * @param target:目标和
     * @return :满足和为目标和的元素的下标
     * 思路：创建一个HashMap，Key：数组元素 Value：元素下标
     * 遍历数组，如果该元素与目标数与自身的差都在map.keyset中且对应下标不相等，返回下标
     * 复杂度分析：遍历数组和HashMap都是O(N)，创建了HashMap，空间复杂度O(N)
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            if (map.containsKey(complement) && map.get(complement) != j) {
                return new int[]{j, map.get(complement)};
            }
        }
        throw new IllegalArgumentException();
    }
}
