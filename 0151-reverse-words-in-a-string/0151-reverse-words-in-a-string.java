class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String res=" ";
        String r="";
        for(int i=arr.length-1;i>=0;i--)
		{
			res+=arr[i]+" ";
		}
        int a=res.length()-1;
        if(res.charAt(a)==' ')
        {
            r+=res.charAt(a);
        }
        res=res.trim().replaceAll("\\s+"," ");
        return res;
      
}
}