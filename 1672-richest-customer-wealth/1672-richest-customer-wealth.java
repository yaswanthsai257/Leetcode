class Solution {
    public int maximumWealth(int[][] ar) {
        int m=ar.length;
     
          int max=0;
	     for(int i=0;i<m;i++) {
	    	 int temp=0;
               int n=ar[i].length;
	    	 for(int j=0;j<n;j++) {
	    		 temp+=ar[i][j];
	    		 if(temp>max) {
	    			 max=temp;
	    		 }
	    		 
	    	 }
	     }
	  return max;  
        
    }
}