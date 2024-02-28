class Solution {
    public long largestPerimeter(int[] a) {
           Arrays.sort(a);
        long[] prefix=new long[a.length];
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        long result=Integer.MIN_VALUE;
        for(int i=2;i<a.length;i++){
            if(a[i]<prefix[i-1]){
                result=prefix[i];
            }

        }
        return (result==Integer.MIN_VALUE)? -1:result; 
    }
}