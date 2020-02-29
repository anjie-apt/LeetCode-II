package SwordRefers2Offer;

public class CutRope {
    public int cutRope(int target) {
        /**
         *1.边界条件：小于2，等于2，等于3
         *2.初始化dp数组
         *3.从i=4开始，j从1到i/2(因为先后顺序不影响结果)
         * 按照递推公式：dp[i] = max(dp[i-j]*dp[j], 0)
         */
        if (target < 2) return 0;
        if (target == 2) return 1;
        if (target == 3) return 2;

        int[] dp = new int[target+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= target; i++) {
            for (int j = 1; j <= i / 2; j++) {
                dp[i] = Math.max(dp[i-j]*dp[j], 0);
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int length = 9;
        int res = new CutRope().cutRope(length);
        System.out.println(res);
    }
}
