public class Solution {

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        // write your code here
        List<String> ans = new ArrayList<>();
        if(nums.length==0)
        {
            if(lower==0&&upper==0)
            return ans;
            else if(lower==upper)
            {
                String str = ""+upper;
                ans.add(str);
                return ans;
            }
            else
            {
                String str =""+lower+"->"+upper;
                ans.add(str);
                return ans;
            }
        }
        if(nums[0]==lower);
        else
        {
            if(lower==nums[0]-1)
            {
                String str = "";
                int temp = lower;
                str = str + temp;
                ans.add(str);
            }
            else
            {
                 String str = "";
                int temp = lower;
                int temp1 = nums[0]-1;
                str = str + temp + "->" + temp1;
                ans.add(str);
            }
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]);
           else if(nums[i]==nums[i-1]+1)
            {

            }
            else if(nums[i]==nums[i-1]+2)
            {
                String str = "";
                int temp = nums[i]-1;
                str = str + temp;
                ans.add(str);
            }
            else
            {
                String str = "";
                int temp = nums[i-1]+1;
                int temp1 = nums[i]-1;
                str = str + temp + "->" + temp1;
                ans.add(str);

            }
        }
        int n=nums.length-1;
        if(nums[n]==upper)
        {

        }
        else
        {
            if(nums[nums.length-1]==upper-1)
            {
                String str = "";
                int temp = upper;
                str = str + temp;
                ans.add(str);
            }
            else
            {
                 String str = "";
                int temp = nums[n]+1;
                int temp1 = upper;
                str = str + temp + "->" + temp1;
                ans.add(str);
            }
        }
        return ans;
    }
}