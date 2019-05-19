package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No_39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        find(result, new ArrayList<>(), candidates, target, 0);


        return result;

    }

    public void find(List<List<Integer>> res, List<Integer> tmp, int[] candidates, int target, int start) {
        if (target == 0) {
            res.add(new ArrayList<>(tmp));
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            tmp.add(candidates[i]);
            find(res, tmp, candidates, target - candidates[i], i);
            tmp.remove(tmp.size() - 1);
        }
    }

    public static void main(String[] args) {
        No_39 demo = new No_39();
        demo.combinationSum(new int[]{2, 3, 6, 7}, 7);
    }

}
