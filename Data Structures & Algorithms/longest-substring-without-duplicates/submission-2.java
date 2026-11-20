class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int left = 0;
        for(int i = 0; i < s.length() ; i++){
            while(set.contains(s.charAt(i))){ 
                set.remove(s.charAt(left));  
                left++;
            }
            set.add(s.charAt(i));
            max_length = Math.max(max_length , i-left+1 ); 
        }
        return max_length == Integer.MIN_VALUE ? 0 : max_length;
    }
}
