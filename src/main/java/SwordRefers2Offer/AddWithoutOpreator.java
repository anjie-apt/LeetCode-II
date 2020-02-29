package SwordRefers2Offer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class AddWithoutOpreator {
    public int add(int num1, int num2) {
        /**
         * 1.不考虑进位对每一位进行相加（等价于异或运算）
         * 2.考虑第二步进位，只有1+1时会向前产生进位，等价于两个数先进行位与运算，然后再向左移动一位
         * 3.第三步把前两步的结果相加，相加的过程也还是重复前两步，直到不产生进位为止
         */
        int sum = 0;
        int carry = 0;
        while (num2 != 0) {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;

    }
}
