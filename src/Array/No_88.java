package Array;

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
