class Solution:
    def maximum69Number (self, num: int) -> int:
        string = str(num)
        return int(string.replace('6','9',1))
        
# you can reduce it more by doing 
class Solution:
    def maximum69Number (self, num: int) -> int:
        return int(str(string).replace('6','9',1))
