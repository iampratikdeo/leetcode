  public int maxSubArray(int[] nums) {
       int res=Integer.MIN_VALUE,last=0;
        for(int i=0;i<nums.length;i++){
            int now = Math.max(0,last)+nums[i];
            res = Math.max(res,now);
            last=now;
        }
        return res;
    }
