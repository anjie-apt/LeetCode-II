package Hashes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        assertEquals("[0, 1]", Arrays.toString(new TwoSum().twoSum(nums, target)));
    }

}