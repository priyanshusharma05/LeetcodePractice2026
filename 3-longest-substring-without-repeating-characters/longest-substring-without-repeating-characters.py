class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left=0
        ri=0
        maxlen=0
        st=set()
        while ri<len(s):
            c=s[ri]
            while c in st:
                st.remove(s[left])
                left+=1
            st.add(c)
            maxlen=max(maxlen,ri-left+1)
            ri+=1
        return maxlen