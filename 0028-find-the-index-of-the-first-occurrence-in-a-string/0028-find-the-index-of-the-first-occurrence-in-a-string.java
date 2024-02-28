class Solution {
    public int strStr(String str, String str1) {
		for(int size=0;size<str.length();size++)
		{
			for(int i=size;i<str.length();i++)
			{
				String res="";
				for(int j=i;j<str.length();j++)
				{
					char ch=str.charAt(j);
					res+=ch;
					if(res.equals(str1))
					{
						return i;
					}
				}
				
			}
		}
		return -1;
    }
}