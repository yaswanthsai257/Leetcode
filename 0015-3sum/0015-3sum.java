import java.util.Set;
class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        Arrays.sort(a);
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<a.length-2;i++){
            int left=i+1;
            int right=a.length-1;
            while(left<right){
                int sum=a[i]+a[left]+a[right];
                if(sum==0){
                    res.add(Arrays.asList(a[i],a[left],a[right]));
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }        
        return new ArrayList<>(res);
    }
}