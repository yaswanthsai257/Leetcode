class Solution {
    public String truncateSentence(String s, int k) {
       String[] arr=s.split(" ");
			String res="";
			for(int i=0;i<k;i++) {
				if(i==k-1) {
					res+=arr[i];
				}else {
					res+=arr[i]+" ";
				}
			}
        return res;
    }
}