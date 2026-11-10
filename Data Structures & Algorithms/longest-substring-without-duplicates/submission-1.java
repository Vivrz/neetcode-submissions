class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int max_length = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        for(int right = 0;right < n ; right++ ){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right)); 
            max_length = Math.max(max_length , right-left+1 );
        }
        return max_length == Integer.MIN_VALUE ? 0 : max_length;
    }
}
