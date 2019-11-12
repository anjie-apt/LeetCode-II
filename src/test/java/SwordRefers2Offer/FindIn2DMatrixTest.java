package SwordRefers2Offer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindIn2DMatrixTest {
    @Test
    public void find() throws Exception {
        int target = 7;
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(true, new FindIn2DMatrix().Find(target, arr));
    }

}