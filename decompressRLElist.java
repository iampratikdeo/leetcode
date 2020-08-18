class Solution {
    public int[] decompressRLElist(int[] nums) {
     
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i < nums.length; i = i + 2){
            int freq = nums[i - 1];
            while(freq > 0){
                list.add(nums[i]);
                freq--;
            }
        }
        
        int[] result = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++){
            result[j] = list.get(j);
    }
        
        
        return result;
     
        
    }
}
