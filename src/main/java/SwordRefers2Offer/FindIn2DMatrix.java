package SwordRefers2Offer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindIn2DMatrix {
    /**
     * 思路：从二维数组的左上（或者右下）开始查找，如果当前值小于目标值，表示需要向下一行查找（行数+1）
     * 如果大于目标值，表示需要向左查找（列数减1）
     * 时间复杂度： O(N)
     * 空间复杂度： O(1)
     * @param target:待查找的目标值
     * @param array：输入二维数组
     * @return 是否包含该目标值
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
