package Array;

/**
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 * <p>
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 * <p>
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false。
 **/

public class No_896 {

    public boolean isMonotonic(int[] A) {

        if (A.length <= 1) {
            return true;
        }
        int first = A[0];
        short flag = 0;

        for (int i = 1; i < A.length; i++) {

            if (A[i] > first) {
                if (flag < 0) {
                    return false;
                }
                flag++;
            } else if (A[i] < first) {
                if (flag > 0) {
                    return false;
                }
                flag--;
            }
            first = A[i];
        }
        return true;
    }

}
