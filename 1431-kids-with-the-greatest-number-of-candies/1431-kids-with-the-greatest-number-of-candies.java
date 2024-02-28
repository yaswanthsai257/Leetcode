class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> map=new ArrayList<Boolean>(candies.length);
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            candies[i]=candies[i]+extraCandies;
            if(candies[i]>=max)
            {
                map.add(true);
            }
            else
            {
                map.add(false);
            }
        }
        return map;
        
    }
}