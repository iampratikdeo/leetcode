class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] result = new int[nums.length];
        
        for(int i = 0;  i < nums.length; i++){
            count = 0;
            for(int j = 0; j < nums.length; j++){
                
                if(nums[i] > nums[j]){
                    count = count + 1;
                }
                
                result[i] = count; 
            }

        }
        return result;
    }
}
