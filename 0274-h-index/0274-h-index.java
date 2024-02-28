class Solution {
    public int hIndex(int[] c) {
       int l=0;
       int h=c.length;
       while(l<h)
       {
           int m=(h+l+1)/2;
           int count=0;
           for(int i=0;i<c.length;i++) if(c[i]>=m) count++;
               if(count>=m) l=m;
               else h=m-1;
       }
           return l;
     
    }
}