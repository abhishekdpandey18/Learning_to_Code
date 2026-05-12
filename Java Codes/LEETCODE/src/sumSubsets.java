import java.util.*;

public class sumSubsets{

    public static List<List<Integer>> solve(int i, int[] nums, List<Integer> temp, List<List<Integer>> ans){
        if (i == nums.length) {
            ans.add(new ArrayList<>(temp));
            return ans;
        }
        temp.add(nums[i]);
        solve(i + 1, nums, temp, ans);

        temp.remove(temp.size() - 1);
        solve(i + 1, nums, temp, ans);
        return ans;
    }
    public static int subsetSum(List<Integer> list) {
        int sum=0;
        for(int x: list){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), ans);
        for(List<Integer> subset : ans){
            System.out.println(subset+" -> Sum = " + subsetSum(subset));
        }
    }
}