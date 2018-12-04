package Strings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PlusOneTest {
    @Test
    public void plusOne() throws Exception {
        int[] input = new int[]{1, 2, 9};
        assertEquals("[1, 3, 0]", Arrays.toString(new PlusOne().plusOne(input)));
    }

}