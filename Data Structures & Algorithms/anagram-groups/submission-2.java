class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> v = new HashMap<>();
        for(String str : strs){
            char c [] = str.toCharArray();
            Arrays.sort(c);
            String g = new String(c);
            v.putIfAbsent(g , new ArrayList<String>());
            v.get(g).add(str);
        }
        return new ArrayList<>(v.values());
    }
}
