class Solution {
    public int findNumbers(int[] ar) {
          int count=0;
	    for(int i=0;i<ar.length;i++) {
	    	String num=String.valueOf(ar[i]);
	    	if(num.length()%2==0) {
	    		count++;
	    	}
	    }
	   return count;
    }
}