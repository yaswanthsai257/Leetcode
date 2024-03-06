class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length;
        int l=1;
        int r=1;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            l= l==0 ? 1:l;
            r= r==0 ? 1:r;
            
            l*=nums[i];
            r*=nums[n-i-1];
            
            ans=Math.max(ans,Math.max(l,r));
        }
        return ans;
        
        
    }
}