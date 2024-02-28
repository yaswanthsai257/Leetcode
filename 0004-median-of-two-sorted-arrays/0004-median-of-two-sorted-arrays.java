class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
         int[] res = new int[n + m];
        int k = 0;
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                k++;
                i++;
            } else {
                res[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < n) {
            res[k] = a[i];
            k++;
            i++;
        }
        while (j < m) {
            res[k] = b[j];
            k++;
            j++;
        }
       if((m+n)%2!=0){
    return res[(m+n)/2];
       }
       else{
         int x=(m+n)/2;
         double p=res[x];
         double q=res[x-1];
         return (p+q)/2;
       }

        
    }
}