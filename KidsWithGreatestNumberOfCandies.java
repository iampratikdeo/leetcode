class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        
        int bigNumber = candies[0];
        
        for(int i =0; i < candies.length; i++){
            
            if(candies[i] > bigNumber){
                bigNumber = candies[i];
            }
        }
        
        for(int i =0; i< candies.length; i++){
            if((candies[i] + extraCandies) >= bigNumber){
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
