class Solution {
    public int pivotInteger(int n) {
        
        int total=(n*(n+1))/2;
        int curr=0;
        for(int i=n;i>=0;i--){
            curr+=i;
            if(curr==total){
                return i;
            }
            total-=i;
        }
        return -1;
    }
}