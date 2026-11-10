class Solution {
    public String minWindow(String s, String t) {
        Map<Character , Integer> map = new HashMap<>();
        for(char chr : t.toCharArray()){
            map.put(chr , map.getOrDefault(chr , 0) + 1);
        }

        int i =0,j=0;
        int minimum_window = Integer.MAX_VALUE;
        int sz = t.length();
        int count_required = t.length();
        int startIndex =0;
        while(j < s.length()){
            if(map.getOrDefault(s.charAt(j) , 0) > 0){
                count_required--;
            }

            map.put(s.charAt(j) , map.getOrDefault(s.charAt(j) , 0)-1);

            while(count_required == 0){
                char current = s.charAt(i);
                map.put(current , map.getOrDefault(current ,0)+1);
                if(map.getOrDefault(current , 0) > 0){
                    count_required++;
                }

                if(j-i+1 < minimum_window){
                    minimum_window = j-i+1;
                    startIndex = i;
                }
                i++;
            }
            j++;
        }
        return minimum_window == Integer.MAX_VALUE ? "" : s.substring(startIndex , startIndex + minimum_window);
    } 
}
