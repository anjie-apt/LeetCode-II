package Stack;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NextGreaterElementTest {
    @Test
    public void nextGreaterElement() throws Exception {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 2, 3, 4};
        assertEquals("[-1, 2, 3]", Arrays.toString(new NextGreaterElement().nextGreaterElement(nums1, nums2)));
    }

}