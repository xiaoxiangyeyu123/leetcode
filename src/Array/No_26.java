package Array;

public class No_26 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return 1;
        }
        int count = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[count]) {
                count++;
                nums[count] = nums[j];
            }
        }
        return count + 1;

    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3};
        removeDuplicates(nums);
    }
}
