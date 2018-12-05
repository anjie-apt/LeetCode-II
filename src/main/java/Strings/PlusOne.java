package Strings;

public class PlusOne {
    /**
     * @param digits:整数数组
     * @return:加1后的整数数组 思路:从数组末位开始加1，分为两种情况：最后一位小于9，直接加1，返回digits；最后一位等于9，加1进位，继续重复判断是否小于9
     * 直到遇到一位小于9返回已有数组
     * 最极端情况循环结束，最后返回的时候新建一个数组，最高位为1，JAVA中新建一个整数数组时默认元素都为0，将最高位置1即可
     * 复杂度分析：最坏情况下遍历整个数组，时间复杂度为O(N)，空间复杂度为O(N)
     */
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
