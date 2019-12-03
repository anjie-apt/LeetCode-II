package Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest
{
    @Test
    public void findMedianSortedArrays() throws Exception {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        // 浮点数类型判断相等时需要加一个参数delta，当返回值和预期值的差的绝对值小于delta判断为相等
        assertEquals(2.0, new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2), 0.0000001);
    }

}