class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actual_sum=0;
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            actual_sum=actual_sum+i;
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        return actual_sum-sum;
    }
}