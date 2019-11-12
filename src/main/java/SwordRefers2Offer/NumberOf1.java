package SwordRefers2Offer;

public class NumberOf1 {
    public int NumberOf1(int n) {
        int res = 0;
        if (n == 0) return res;
        while (n != 0) {
            n &= n - 1;
            res++;
        }
        return res;
    }
}
