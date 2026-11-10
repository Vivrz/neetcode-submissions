class Solution {
    public String minWindow(String s, String t) {
        // Here we just have to make sure that when the count required is zero then at that time we need to check and find the minimum window until the count required becomes greater than zero and atlast return the value of the minimum window length
        Map<Character , Integer> map = new HashMap<>();
        for(char chr : t.toCharArray()){
            map.put(chr , map.getOrDefault(chr , 0)+1);
        }
        int mininum_Window = Integer.MAX_VALUE;
        int i =0;
        int j =0;
        int count_req = t.length();
        int startIndex = 0;
        while(j < s.length()){
            if(map.getOrDefault(s.charAt(j) , 0) > 0){
                count_req--;
            }
            map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0)-1);
            while(count_req == 0){
                char current = s.charAt(i);
                map.put(current , map.getOrDefault(current ,0)+1);
                if(map.getOrDefault(current ,0) > 0){
                    count_req++;
                }
                if(j-i+1 < mininum_Window){
                    startIndex = i;
                    mininum_Window = j-i+1;
                }
                i++;
            }
            j++;
        }
        return mininum_Window == Integer.MAX_VALUE ? "" : s.substring(startIndex , startIndex + mininum_Window);
    }
}
