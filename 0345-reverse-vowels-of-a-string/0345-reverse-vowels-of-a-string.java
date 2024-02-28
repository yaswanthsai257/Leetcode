class Solution {
    public String reverseVowels(String a) {
       char[] ar=a.toCharArray();
		char[] res=new char[ar.length];
		int j=0;
		for(int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]=='a'||ar[i]=='e'||ar[i]=='i'||ar[i]=='o'||ar[i]=='u'||ar[i]=='A'||ar[i]=='E'||ar[i]=='I'||ar[i]=='O'||ar[i]=='U')
			{
				res[j]=ar[i];
				j++;
			}
		}
		int m=0;
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]=='a'||ar[i]=='e'||ar[i]=='i'||ar[i]=='o'||ar[i]=='u'||ar[i]=='A'||ar[i]=='E'||ar[i]=='I'||ar[i]=='O'||ar[i]=='U')
			{
			ar[i]=res[m];
				m++;
			}
		}
		String sb=String.valueOf(ar);
		return sb; 
    }
}