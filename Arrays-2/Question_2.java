class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int n=candyType.length;
        int ans=n/2;
        int ans1=1;
        for(int i=1;i<n;i++)
        {
            if(candyType[i]!=candyType[i-1])
            ans1=ans1+1;
        }
        if(ans1>n/2)
        return n/2;
        return ans1;
        
    }
}