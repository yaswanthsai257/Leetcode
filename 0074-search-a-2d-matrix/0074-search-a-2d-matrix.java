class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int e=(m*n)-1;
        while(s<=e){
            int mid=(s+e)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
}