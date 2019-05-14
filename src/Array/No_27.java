package Array;

public class No_27 {

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i] ;
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        removeElement(new int[]{2, 2, 3, 5,}, 2);
    }


}
