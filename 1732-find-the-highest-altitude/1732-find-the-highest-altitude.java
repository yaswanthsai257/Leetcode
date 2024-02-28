class Solution {
    public int largestAltitude(int[] a) {
        int n=a.length;
        int[] arr=new int[n+1];
		arr[0]=0;
		int j=0;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int res=arr[j]+a[i];
			arr[j+1]=res;
			j++;
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		if(max>0)
		{
			return max;
		}
		else
		{
			return 0;
		}
        
    }
}