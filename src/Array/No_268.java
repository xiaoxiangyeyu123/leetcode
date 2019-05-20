package Array;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 **/


public class No_268 {

    public static int missingNumber(int[] nums) {
        int ret = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ret += (i - nums[i]);
        }
        return ret;
    }

    public static int missingNumber1(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {
        missingNumber1(new int[]{3, 0, 1});
    }
}
