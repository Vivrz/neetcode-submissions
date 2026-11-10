class Solution {
    public int longestConsecutive(int[] nums) {
        // The whole approach is that we need to check if the number exist in the set or not , first we add all the elements in the set and then check whether the num-1 exits if not exist then we start the while loop until current + 1 exits in the set 
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        int max_length = Integer.MIN_VALUE;
        for(int num : s){
            if(!s.contains(num-1)){
                int current = num;
                int length = 1;
                while(s.contains(current + 1)){
                    current += 1;
                    length++;
                }
                max_length = Math.max(max_length , length );
            }
        }
        return max_length == Integer.MIN_VALUE ? 0 : max_length;
    }
}
