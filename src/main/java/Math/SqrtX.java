package Math;


/**
 * 实现int sqrt(int x)函数。
 * 计算并返回x的平方根，其中x是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class SqrtX {
    public int mySqrt(int x) {
        //1.二分法
        if (x <= 0) return 0;
        long left = 1;
        long right = x / 2;

        while (left < right) {
            long mid = (left + right + 1) >>> 1;
            if (x > mid * mid) {
                right = mid - 1;
            } else left = mid;
        }
        return (int) left;

        /**
         * 2.拟牛顿法
         * 初始值设为输入的x,推导得到迭代公式 x0 = (x0 + x/x0) / 2
         */
//        double x0 = x;
//        while (x < x0 * x0){
//            x0 = (x0 + x / x0) / 2;
//        }
//        return (int) x0;
    }
}
