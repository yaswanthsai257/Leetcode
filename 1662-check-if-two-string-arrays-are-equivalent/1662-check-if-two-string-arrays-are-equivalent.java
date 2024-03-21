class Solution {
    public boolean arrayStringsAreEqual(String[] str1, String[] str2) {
        StringBuilder res=new StringBuilder();
	     StringBuilder res1=new StringBuilder();
	     
	     for(int i=0;i<str1.length;i++) {
	    	 res.append(str1[i]);
	    	 
	     }
	     for(int i=0;i<str2.length;i++) {
	    	 res1.append(str2[i].toString());
	    	 
	     }
	     if(res.toString().equals(res1.toString())) {
	    	return true;
	    	 
	     }
	    return false;
    }
}