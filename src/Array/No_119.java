package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 **/


public class No_119 {

    public static List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i - 1; j >= 1; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;

    }

    public static void main(String[] args) {
        getRow(3);
    }
}
