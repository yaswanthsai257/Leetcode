class Solution {
    public int pivotIndex(int[] a) {
        int total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i];
        }
        int left=0;
        for(int i=0;i<a.length;i++){
            if(i!=0){
                left+=a[i-1];
            }
            if(total-left-a[i]==left){
                return i;
            }
        }
        return -1;
    }
}