class Solution:
    def buildArray(self, target: List[int], n: int) -> List[str]:
        res = []
        s = set(target)
        print(s)
        print(target[-1])
        for i in range(1, target[-1] + 1):
            res.append("Push")
            if i not in s:
                res.append("Pop")
        return res
