
class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void solve(int[] nums, int target, int i,
                       List<Integer> list,
                       List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (i == nums.length || target < 0) {
            return;
        }

   
        list.add(nums[i]);
        solve(nums, target - nums[i], i, list, result);

        // Backtrack
        list.remove(list.size() - 1);

        // Skip the current element
        solve(nums, target, i + 1, list, result);
    }
}
