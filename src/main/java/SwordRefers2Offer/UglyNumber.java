package SwordRefers2Offer;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数
 */
public class UglyNumber {
    public int getUglyNumber(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;
        int[] ugly = new int[n];
        ugly[0] = 0;
        ugly[1] = 1;
        ugly[2] = 2;
        ugly[3] = 3;
        return 0;
    }
}
