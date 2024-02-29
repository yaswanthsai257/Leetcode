class Solution {
    public int[] twoSum(int[] a, int m) {
		  int start= 0;
	        int end = a.length - 1;

	        while (start < end) {
	            int sum = a[start] + a[end];

	            if (sum == m){
	                return new int[]{start + 1, end + 1};
	            } else if (sum < m) {
	                start++;
	            } else {
	                end--;
	            }
	        }
	        return new int[]{0, 0};
		  
    }
}