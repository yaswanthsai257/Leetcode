class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int size = 0; size < nums.length; size++) {
            int mult = 1; // Reset the multiplication variable for each subarray
            for (int i = size; i < nums.length; i++) {
                // Update the product as we iterate through the subarray
                mult *= nums[i];
                // Check if the product is less than k
                if (mult < k) {
                    // If so, increment the count
                    count++;
                } else {
                    // If the product exceeds k, break out of the loop
                    break;
                }
            }
        }
        return count;
    }
}
