package Array;

/**
 * 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
 * <p>
 * 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
 * <p>
 * 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
 * <p>
 * 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * nums =
 * [[1,2],
 * [3,4]]
 * r = 1, c = 4
 * 输出:
 * [[1,2,3,4]]
 * 解释:
 * 行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
 **/

public class No_566 {

    public static int[][] matrixReshape(int[][] nums, int r, int c) {

        if (nums.length * nums[0].length != r * c) {
            return nums;
        }

        int[][] ans = new int[r][c];
        int row = 0;
        int col = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                if (col >= c) {
                    row++;
                    col = 0;
                }
                ans[row][col] = nums[i][j];
                col++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
    }

}
