class Solution {
    public int[] shuffle(int[] nums, int n) {
    
    int[] result = new int[nums.length];
    int even = 0, odd = n ;
   
        for(int i = 0; i < nums.length; i++){
            if( i % 2 == 0){
                result[i] = nums[even];
                even++;
            } else {
                result[i] = nums[odd];
                odd = odd + 1;
            }
        }
        return result;
    }
}
