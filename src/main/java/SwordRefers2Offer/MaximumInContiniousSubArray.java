package SwordRefers2Offer;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class MaximumInContiniousSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        /**
         * 1.判空和边界条件
         * 2.新建dp数组，赋初值
         * 3.循环根据递推公式记录最大子数组和
         * 递推公式：如果前一个位置上的连续和大于0，则继续累加当前位置的数组元素
         * 否则当前位置的连续子数组和等于数组当前元素；
         * 4.返回dp的最大值
         */
        if (array.length == 0) return 0;
        if (array.length == 1) return array[0];
        int[] dp = new int[array.length];
        dp[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (dp[i-1] > 0) {
                dp[i] = Math.max(dp[i-1]+array[i], dp[i]);
            } else {
                dp[i] = array[i];
            }
        }
        int res = dp[0];
        for (int i : dp) {
            res = Math.max(res, i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = new int[]{6, -3, -2, 7, -15, 1, 2, 2};
        int res = new MaximumInContiniousSubArray().FindGreatestSumOfSubArray(array);
        System.out.println(res);
    }
}
