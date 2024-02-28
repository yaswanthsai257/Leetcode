class Solution {
    public int[] intersection(int[] ar1, int[] ar2) {
        
         List<Integer> set=new ArrayList<>();
	       if(ar1.length>ar2.length) {
	    	  
	    	   for(int i=0;i<ar2.length;i++) {
	    		for(int j=0;j<ar1.length;j++) {
	    			if(ar1[j]==ar2[i]) {
	    				if(!set.contains(ar2[i])) {
	    					set.add(ar2[i]);
	    				}
	    			}
	    		}
	    	   }
	    	   
	       }else {
	    	   for(int i=0;i<ar1.length;i++) {
		    		for(int j=0;j<ar2.length;j++) {
		    			if(ar1[i]==ar2[j]) {
		    				if(!set.contains(ar1[i])) {
		    					set.add(ar1[i]);
		    				}
		    			}
		    		}
		    	   }
	       }
             int[] res=new int[set.size()];
	       for(int i=0;i<res.length;i++) {
	    	   res[i]=set.get(i);
	       }
           return res;
    }
}