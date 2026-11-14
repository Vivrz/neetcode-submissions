class Solution {
    // Lets write the function here : for finding the target element which is passed as an argument here : so basically first of all we will sort the array here and then apply the binary search here : 
    public void Check_target(List<List<Integer>> result , int arr [] , int i , int j , int target ){
        while(i < j){
        List<Integer> list = new ArrayList<>();
            int sum = arr[i]+arr[j];
            if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
            else{
                while(i < j && arr[i] == arr[i+1]) i++;
                while(i < j && arr[j] == arr[j-1]) j--;

                list.add(-1*target);
                list.add(arr[i]);
                list.add(arr[j]);
                result.add(list);
                i++;
                j--;
            }
        }
    }
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ;i < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int target = -1*nums[i];
            Check_target(result , nums , i+1 , nums.length-1 , target);
        }
        return result;
    }
}
