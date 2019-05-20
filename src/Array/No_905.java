package Array;

/**
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * <p>
 * 你可以返回满足此条件的任何数组作为答案。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 **/

public class No_905 {

    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int temp = 0;
        while (left < right) {
            if ((A[left] % 2 != 0) && (A[right] % 2 == 0)) {
                temp = A[left];
                A[left] = A[right];
                A[right] = temp;
            }
            if (A[left] % 2 == 0) {
                left++;
            }
            if (A[right] % 2 != 0) {
                right--;
            }
        }
        return A;
    }
}
