class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n= nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(n==-1)
        {
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if( j!= (i+1) && nums[j] == nums[j-1])
                {
                    continue;
                }
                int k,l;
                k=j+1;
                l=n-1;
                while(k<l)
                {
                    if(k != j+1 && nums[k] == nums[k-1])
                    {
                        k++;
                        continue;
                    }
                    if(l != n-1 && nums[l]==nums[l+1])
                    {
                        l--;
                        continue;
                    }
                    int sum=nums[i];
                    sum+=nums[j]+nums[k]+nums[l];
                    if(sum==target)
                    {
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[k]);
                        quad.add(nums[l]);
                        res.add(quad);
                        k++;
                        l--;
                    }
                    else if(sum<target)
                    {
                        k++;
                    }
                    else {
                    l--;
                    }
                } 
            }
        }

        return res;
        
    }
}