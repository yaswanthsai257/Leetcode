class Solution {
    public int longestSubarray(int[] a) { 
        int res=0;
        int k=1;
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]==0){
                k--;
            }
            while(k<0){
                if(a[i]==0){
                    k++;
                }
                i++;
            }
            res=Math.max(res,j-i);
        }  
        return res;     
    }
}