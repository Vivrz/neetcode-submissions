class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0 ) + 1);
        }
        PriorityQueue<Integer> P = new PriorityQueue<>((a , b)->{
            return map.get(b)-map.get(a);
        });
        P.addAll(map.keySet());
        int ar [] = new int[k];
        for(int i = 0 ;i < k ;i++){
            ar[i] = P.poll();
        }
        return ar;
    }
}
