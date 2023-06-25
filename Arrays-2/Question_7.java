class Solution {
    public boolean isMonotonic(int[] nums) {
       int flag=1,flag1=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(!(nums[i]<=nums[i+1]))
            {
                flag=0;
                break;
            }
        }
        for(int i=0;i<nums.length-1;i++)
        {
           if(!(nums[i]>=nums[i+1]))
           {
               flag1=0;
               break;
           }
        }
        if(flag==0&&flag1==0)
        return false;
        return true;
        
    }
}