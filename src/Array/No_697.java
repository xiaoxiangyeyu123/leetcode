package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 * <p>
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1, 2, 2, 3, 1]
 * 输出: 2
 * 解释:
 * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * 示例 2:
 * <p>
 * 输入: [1,2,2,3,1,4,2]
 * 输出: 6
 **/

public class No_697 {

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> maxSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int maxDegree = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if(value == maxDegree){
                maxSet.add(entry.getKey());
            } else if (value > maxDegree) {
                maxDegree = value;
                maxSet.clear();
                maxSet.add(entry.getKey());
            }
        }

        int minLength = 0;
        for(int num : maxSet){
            int left = 0;
            int right = nums.length - 1;
            for(; left < right; left++){
                if(nums[left] == num){
                    break;
                }
            }

            for(; right > left; right--){
                if(nums[right] == num){
                    break;
                }
            }

            if (minLength == 0) {
                minLength = right - left + 1;
            } else {
                minLength = Math.min(right - left + 1, minLength);
            }

        }

        return minLength;
    }

    public static void main(String[] args) {
        findShortestSubArray(new int[]{2, 1, 1, 2, 1, 3, 3, 3, 1, 3, 1, 3, 2});
    }

}
