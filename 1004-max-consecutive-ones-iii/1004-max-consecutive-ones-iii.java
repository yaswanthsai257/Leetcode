class Solution {
    public int longestOnes(int[] a, int k) {
         int res=0;
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
             res=Math.max(res,j-i+1);
         }
         return res;
    }
}