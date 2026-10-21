class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int per=0;per<accounts.length;per++)
        {
            int rowsum=0;
            for(int acc=0; acc<accounts[per].length; acc++)
            {
                rowsum=rowsum+accounts[per][acc];
            }
            if(rowsum>max)
                max=rowsum;
        }
        return max;
    }
}