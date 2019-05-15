package Array;

import java.util.ArrayList;
import java.util.List;

public class No_118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> pre = result.get(i - 1);
            temp.add(1);
            for (int j = 1; j < pre.size(); j++) {
                temp.add(pre.get(j) + pre.get(j - 1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
