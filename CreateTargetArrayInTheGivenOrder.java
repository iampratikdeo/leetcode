class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        
     List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            result.add(index[i],nums[i]);    
     }
    for(int i = 0; i < result.size(); i++){
        target[i] = result.get(i);
    }
        return target;
    }
}
