class Solution {
    public boolean isAnagram(String s, String t) {
        char q [] = s.toCharArray();
        char e [] = t.toCharArray();
        Arrays.sort(q);
        Arrays.sort(e);
        String w = new String(q);
        String h = new String(e);
        return w.equals(h);
    }
}
