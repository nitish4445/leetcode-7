class Solution {
    public int mySqrt(int x) {
        int num = x/2;
        int ans = 0;
        int l = 1;
        
        if(x == 1)
            return x;
        
        while(l <= num)
        {
            int mid_val = (l + num) / 2;
            if((long) mid_val * mid_val <= x)
            {
                ans = mid_val;
                l = mid_val + 1;
            }
            else
            {
                num = mid_val - 1;
            }
        }
        return ans;
        
    }
}