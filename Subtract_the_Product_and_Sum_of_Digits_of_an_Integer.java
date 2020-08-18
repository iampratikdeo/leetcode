class Solution {
    public int subtractProductAndSum(int n) {
       int sum=0;
        int product=1; 
   List<Integer> digits = new ArrayList<Integer>();
        
    for(int i = 0; n > 0 ; i++){
        
        digits.add(n % 10) ;
        n = n / 10; 
        
    }
        for (int i = 0;  i < digits.size(); i++){
            sum = sum + digits.get(i);
            product = product * digits.get(i);
        }
   
        return (product - sum );
    }
}
