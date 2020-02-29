package SwordRefers2Offer;

/**
 * 在一个长度为n的数组里所有的数字都在0~n-1范围内，数组中某些数字是重复的，但是不知道有几个数字重复了，也不知道每个数字重复了几次，请找出数组中任意一个重复的数字
 * 输入示例： [2, 3, 1, 0, 2, 5, 3]
 */
public class FindDuplicatesInArray {
    public boolean FindDuplicatesInArray(int[] array) {
        //判空
        if (array == null || array.length == 0) {
            return false;
        }
        int n = array.length;
        for (int i = 0; i < n; i++) {
            //当下标不等于对应位置的值时一直循环
            while (i != array[i]) {
                //如果
                if (array[i] == array[array[i]]) {
                    array[0] = array[i];
                    return true;
                }
                int temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        FindDuplicatesInArray findDuplicatesInArray = new FindDuplicatesInArray();
        boolean res = findDuplicatesInArray.FindDuplicatesInArray(array);
        System.out.println(res);
        System.out.println(array[0]);
    }
}
