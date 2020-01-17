package SwordRefers2Offer;

import java.util.Arrays;

public class IsContinuous {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length == 0) return false;
        //先把数组排序
        Arrays.sort(numbers);
        int zeroCount = 0;
        int internal = 0;
        //统计大小王的个数
        for (int number : numbers) {
            if (number == 0) zeroCount++;
        }

        for (int i = zeroCount; i < numbers.length - 1; i++) {
            //如果前后两个数字相等则不可能为顺子，直接返回false
            if (numbers[i + 1] == numbers[i]) return false;
            //计算中间的空格数=前后数字差 - 1
            if (numbers[i + 1] - numbers[i] > 1) {
                internal += numbers[i + 1] - numbers[i] - 1;
            }
        }
        return zeroCount >= internal;
    }
}
