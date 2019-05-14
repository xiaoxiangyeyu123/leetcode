package Array;


/**
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 你找到的子数组应是最短的，请输出它的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 说明 :
 * <p>
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 **/


public class No_581 {
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int beg = -1;
        int end = -2;
        int min = nums[n - 1];
        int max = nums[0];

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);

            if (nums[i] < max)
                end = i;
            if (nums[n - 1 - i] > min)
                beg = n - 1 - i;
        }

        return end - beg + 1;

    }

    public static void main(String[] args) {
        findUnsortedSubarray(new int[]{2, 1});
    }
}
