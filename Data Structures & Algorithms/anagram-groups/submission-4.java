// map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

class Solution {
    public String Convert_Array(String str){
        int arr [] = new int[26];
        for(int i =0;i < str.length() ; i++){
            arr[str.charAt(i)-'a']++;
        }
        return Arrays.toString(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String , ArrayList<String>>map = new HashMap<>(); 
        for(int i =0;i < strs.length ;i++){ 
            String key  = Convert_Array(strs[i]); 
            map.computeIfAbsent(key , k -> new ArrayList<>()).add(strs[i]); 
        }
        for(String st : map.keySet()){
            result.add(map.get(st));
        }
        return result;
    }
}
 