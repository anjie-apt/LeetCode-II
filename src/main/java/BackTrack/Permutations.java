package BackTrack;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums.length == 0) return res;
        int[] visited = new int[nums.length];
        backtrack(0, new ArrayList<Integer>(), visited, nums, res);
        return res;
    }

    private void backtrack(int index, List<Integer> temp, int[] visited, int[] nums, List<List<Integer>> res) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            temp.add(nums[i]);
            backtrack(i + 1, temp, visited, nums, res);
            temp.remove(temp.size() - 1);
            visited[i] = 0;
        }
    }
}
