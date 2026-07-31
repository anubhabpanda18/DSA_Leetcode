class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                count0+=1;
            }
            else if(nums[i]==1)
            {
                count1+=1;
            }
            else
            {
                count2+=1;
            }
        }
        int i=0;
        while(count0!=0)
        {
            nums[i]=0;
            count0-=1;
            i++;
        }
        while(count1!=0)
        {
            nums[i]=1;
            count1-=1;
            i++;
        }
        while(count2!=0)
        {
            nums[i]=2;
            count2-=1;
            i++;
        }

    }
}