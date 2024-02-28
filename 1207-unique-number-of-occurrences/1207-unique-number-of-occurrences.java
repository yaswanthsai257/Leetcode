import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
class Solution {
    public boolean uniqueOccurrences(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : a) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrenceSet = new HashSet<>();
        for (int count : map.values()) {
            if (!occurrenceSet.add(count)) {
                return false;
            }
        }

        return true; 
}
}