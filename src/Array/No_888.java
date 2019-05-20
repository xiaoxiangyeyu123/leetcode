package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 块糖的大小，B[j] 是鲍勃拥有的第 j 块糖的大小。
 * <p>
 * 因为他们是朋友，所以他们想交换一个糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）
 * <p>
 * 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。
 * <p>
 * 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 * 示例 1：
 * <p>
 * 输入：A = [1,1], B = [2,2]
 * 输出：[1,2]
 **/

public class No_888 {

    public static int[] fairCandySwap(int[] A, int[] B) {


        int alis = 0;
        int bob = 0;
        int delta = 0;
        Set bobMap = new HashSet();
        for (int a : A) {
            alis += a;
        }
        for (int b : B) {
            bob += b;
            bobMap.add(b);
        }
        delta = (bob - alis) / 2;
        for (int a : A) {
            if (bobMap.contains(a + delta)) {
                return new int[]{a, a + delta};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        fairCandySwap(new int[]{1, 1}, new int[]{2, 2});
    }
}
