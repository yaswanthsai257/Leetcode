class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int x=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==x)
            {
                count++;
            }
            else{
                count--;
            }
            if(count==0)
        {
            x=nums[i];
            count++;
        }
        }
        return x;
        
    }
}