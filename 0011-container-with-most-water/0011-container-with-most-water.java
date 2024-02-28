class Solution {
    public int maxArea(int[] a) {
        int res=0;
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int min=Math.min(a[i],a[j]);
			int width=j-i;
			res=Math.max(res,min*width);
			
			if(a[i]<a[j])
			{
				i++;
			}
			else
			{
				j--;
			}
			
		}
		return res;
        
    }
}