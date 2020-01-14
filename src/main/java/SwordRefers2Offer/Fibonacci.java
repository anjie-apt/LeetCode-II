package SwordRefers2Offer;


/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）.n<=39
 */
public class Fibonacci {
    public int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        int num1 = 1;
        int num2 = 1;
        int res = 0;
        for (int i=3; i<=n; i++){
            res = num1 + num2;
            num1 = num2;
            num2 = res;
        }
        return res;
    }
}
