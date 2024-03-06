import java.util.Map.Entry;
class Solution {
    public int singleNumber(int[] nums) {
        LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				Integer value=map.get(nums[i]);
				map.put(nums[i],value+1);
				
				}
			else{
				map.put(nums[i], 1);
			}
			
		}
        int ans=0;
		for(Entry<Integer, Integer> i:map.entrySet()) {
			if(i.getValue()==1) {
				ans=i.getKey();
			}
          
    }
          return ans;
}
}