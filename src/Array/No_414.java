package Array;

/**
 * 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3, 2, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 第三大的数是 1.
 * 示例 2:
 * <p>
 * 输入: [1, 2]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * 示例 3:
 * <p>
 * 输入: [2, 2, 3, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 **/

public class No_414 {

    public static int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int flag = 0;
        boolean f = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MIN_VALUE && f) {
                flag++;
                f = false;
            }
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
                flag++;
            } else if (nums[i] > max2 && nums[i] < max1) {
                max3 = max2;
                max2 = nums[i];
                flag++;
            } else if (nums[i] > max3 && nums[i] < max2) {
                max3 = nums[i];
                flag++;
            }
        }
        return flag > 2 ? max3 : max1;
    }

    public static void main(String[] args) {
        int i = thirdMax(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1, 1});
        System.out.println(i);
    }
}
