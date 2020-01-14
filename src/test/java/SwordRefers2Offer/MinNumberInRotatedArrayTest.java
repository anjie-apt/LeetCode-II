package SwordRefers2Offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinNumberInRotatedArrayTest
{
    @Test
    public void minNumberInRotateArray() throws Exception
    {
        int[] arr = new int[]{3, 4, 5, 1, 2};
        assertEquals(1, new MinNumberInRotatedArray().minNumberInRotateArray(arr));
    }

}