import java.util.Map.Entry;
class Solution {
    public int singleNumber(int[] a) {
         LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
		  for(int i=0;i<a.length;i++) {
			  if(map.containsKey(a[i])) {
				  Integer value=map.get(a[i]);
				  map.put(a[i], value+1);
			  }
			  else {
				  map.put(a[i], 1);
			  }
		  }
		 
		  for(Entry<Integer, Integer> i:map.entrySet()) {
			  if(i.getValue()==1) {
				 return i.getKey();
			  }
		  }
        return 0;
        
    }
}