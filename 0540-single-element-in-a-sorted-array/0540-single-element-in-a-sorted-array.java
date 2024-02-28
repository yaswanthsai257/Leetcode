class Solution {
    public int singleNonDuplicate(int[] a) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                Integer value = map.get(a[i]);
                map.put(a[i], value + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> c = map.entrySet();
        for (Map.Entry<Integer, Integer> m : c) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        // Add a return statement if needed
        return -1; // or any default value
    }
}
