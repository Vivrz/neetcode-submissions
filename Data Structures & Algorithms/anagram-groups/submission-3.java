class Solution {
    public boolean CheckAangram( String a , String b ){
        if(a.length() != b.length()){
            return false;
        }
        int arr [] = new int[26];
        for(int i =0;i < a.length() ; i++){
            arr[a.charAt(i)-'a']++;
        }
        for(char chr : b.toCharArray()){
            if(arr[chr-'a'] >= 1){
                arr[chr-'a']--;
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        boolean visited [] = new boolean[strs.length];
        for(int i = 0;i < strs.length ; i++){
            if(visited[i]){
                continue;
            }
            List<String> l = new ArrayList<>();
            l.add(strs[i]);
            for(int j = i+1 ;j < strs.length ;j++){
                if(!visited[j] && CheckAangram(strs[i] , strs[j])){
                    l.add(strs[j]);
                    visited[j] = true;
                }
            }
            visited[i] = true;
            list.add(l);
        }
        return list;
    }
}
