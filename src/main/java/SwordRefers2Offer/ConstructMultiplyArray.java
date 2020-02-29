package SwordRefers2Offer;

/**
 * 给定一个数组A[0,1,...,n-1],
 * 请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class ConstructMultiplyArray {
    public int[] multiply(int[] A) {
        /**
         * 1.获取输入数组长度，创建等长的返回数组
         * 2.从左向右累乘
         * 3.从右向左累乘
         */
        int n = A.length;
        int[] B = new int[n];
        for (int i = 0, product = 1; i < n; product *= A[i], i++) {
            B[i] = product;
        }
        for (int i = n-1, product = 1; i >= 0; product *= A[i], i--) {
            B[i] *= product;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 4, 5};
        int[] res = new ConstructMultiplyArray().multiply(A);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
