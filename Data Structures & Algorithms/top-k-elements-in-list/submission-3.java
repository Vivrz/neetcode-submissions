class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> v = new HashMap<>();
        for(int h : nums){
            v.put(h , v.getOrDefault(h , 0 ) +1);
        }
        int i = 0;
        Set<Integer> s = new HashSet<>();
        while(i < k){
            int max = Integer.MIN_VALUE;
            int c = 0;
            for(int u : v.keySet()){
                if((max < v.get(u)) && !s.contains(u)){
                    max = v.get(u);
                    c = u;
                }
                
            }
            s.add(c);
            i++;
        }
        i = 0;
        int a [] = new int[s.size()];
        for(int e : s){
            a[i++] = e;
        }
        return a;
    }
}
