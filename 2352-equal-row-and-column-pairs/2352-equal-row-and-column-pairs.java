class Solution {
    public int equalPairs(int[][] a) {
        LinkedHashMap<Integer, ArrayList<Integer>> row=new LinkedHashMap<>();
		LinkedHashMap<Integer, ArrayList<Integer>> column=new LinkedHashMap<>();
		
		int m=a.length;
		for(int i=0;i<m;i++)
		{
			row.put(i,new ArrayList<>());
		}
		for(int i=0;i<m;i++)
		{
			column.put(i,new ArrayList<>());
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				row.get(i).add(a[i][j]);
				column.get(j).add(a[i][j]);
			}
		}
		int count=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(row.get(i).equals(column.get(j)))
				{
					count++;
				}
			}
		}
		return count;
        
    }
}