package Nr46;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunlongxu on 12/22/15.
 */
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
    public static ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        permuteHelper(nums, result, new ArrayList<Integer>());
        return result;
    }
    public static void permuteHelper(int[] nums, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            permuteHelper(nums, result, list);
            list.remove(list.size() - 1);
        }
    }
}
