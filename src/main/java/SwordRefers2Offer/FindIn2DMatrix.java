package SwordRefers2Offer;

public class FindIn2DMatrix {
    /**
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        if (array.length == 0) return false;
        int m = 0;
        int n = array[0].length - 1;
        while (m < array.length && n >= 0) {
            int num = array[m][n];
            if (num == target) return true;
            else if (num < target) {
                m++;
            } else {
                n--;
            }
        }
        return false;
    }
}
