class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(0,target,nums, result, new ArrayList<>());
        return result;
    }

    private void solve(int i,int target,int[] nums, List<List<Integer>> result, List<Integer> list){
  
            if(target == 0){
                result.add(new ArrayList<>(list));
                return;
            }

        if(i== nums.length){
            
            return;
            }

        solve(i+1, target,nums,result,list);
        if(target >= nums[i]){
            list.add(nums[i]);
            solve(i,target-nums[i],nums,result,list);
            list.remove(list.size()-1);
        }
       


    }
}
