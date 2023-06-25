class Solution {
    public int findLHS(int[] nums) {
        
        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        int len=0;
        int i=0;
        int k=1;
        while(k<nums.length)
        {
               int diff = nums[k]-nums[i];

               if(diff==1)
               len = Math.max(len,k-i+1);

               if(diff<=1)
               k++;
               else
               i++;
        }
        
        return len;
    }
}