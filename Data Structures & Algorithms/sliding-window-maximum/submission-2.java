class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //  So First of all we are going to process the first k elements in the array :
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i =0;i < k ;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.add(i);
        }
        int n = nums.length;
        int windows = n-k+1;
        int result [] = new int[windows];
        int idx =0;
        for(int i = k ; i < n ; i++){
            result[idx++] = nums[dq.peekFirst()]; 
            // Remove the elements which are out of the current window : using i-k
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.add(i);
        }
        result[idx] = nums[dq.peekFirst()];
        return result;
    }
}
