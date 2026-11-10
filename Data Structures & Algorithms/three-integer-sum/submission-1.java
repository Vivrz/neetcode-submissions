class Solution {
    public static void TwoSum(List<List<Integer>> result , int nums [] , int target , int i , int j){
        while(i < j){
            
        List<Integer> list = new ArrayList<>();
            if(nums[i]+nums[j] < target){
                i++;
            }
            else if(nums[i]+nums[j] > target){
                j--;
            }   
            else{
                while(i < j && nums[i] == nums[i+1]) i++;
                while(i < j && nums[j] == nums[j-1]) j--;

                list.add(-1*target);
                list.add(nums[i]);
                list.add(nums[j]);
                result.add(list);
                i++;
                j--;
            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
        // Here first of all sort the elements in the array : Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n =  nums.length;
        if(n < 3){
            return  result;
        }
        Arrays.sort(nums);
        for(int i =0;i < nums.length ;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -1 * nums[i];
           TwoSum( result , nums , target , i+1 , n-1);
        }
        return result;
    }
}
