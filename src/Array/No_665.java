package Array;

/**
 * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * <p>
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 **/

public class No_665 {

    public static boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        int count = 0;
        if (nums[0] > nums[1]) {
            count++;
            nums[0] = nums[1];
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }

            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        boolean b = checkPossibility(new int[]{2, 3, 3, 2, 4});
        System.out.println(b);
    }
}
