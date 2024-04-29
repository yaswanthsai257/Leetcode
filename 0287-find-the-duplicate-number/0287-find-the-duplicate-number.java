import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int findDuplicate(int[] a) {
        LinkedHashMap<Integer, Integer> arr=new LinkedHashMap<>();
			for(int i=0;i<a.length;i++) {
				if(arr.containsKey(a[i])) {
					Integer val=arr.get(a[i]);
					arr.put(a[i], val+1);
				}else {
					arr.put(a[i], 1);
				}
			}
			
			for(Entry<Integer,Integer> e:arr.entrySet()) {
				if(e.getValue()>=2) {
					return e.getKey();
				}
			}
        return 0;
    }
}