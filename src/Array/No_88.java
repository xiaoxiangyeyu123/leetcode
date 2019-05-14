package Array;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 **/

public class No_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[count] = nums1[i++];
            } else {
                result[count] = nums2[j++];
            }
            count++;
        }
        while (i < m) {
            result[count++] = nums1[i++];
        }
        while (j < n) {
            result[count++] = nums2[j++];
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k] = result[k];
        }
    }
}
