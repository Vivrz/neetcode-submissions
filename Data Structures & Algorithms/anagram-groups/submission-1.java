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
        List<List<String>> a = new ArrayList<>();
        for(String e : v.keySet()){
            a.add(v.get(e));
        }
        return a;
    }
}
