#Approach: 
Sliding Window

1. Check edge case if t.length>s.length, then return empty string.
2. Store each character of t into a Map<Character,Integer> to store count of each character.
3. Take two pointers i=0, j=0.
4. Take minWindowSize=Integer.MAX_VALUE, requiredCount=t.length(), i_start=0
5. Iterate j from 0 to s.length() & if character at s.charAt(j) exists in the map & its value>0, then simply decrement requiredCount & also it's value from the map.
6. While the requiredCount becomes 0, check the currentWindowSize with j-i+1. If currentWindowSize>minWindowSize, update minWindowSize & i_start.
7. Start shrinking the window by incrementing i & increment the value of s.charAt(i) in the map. If the value of s.charAt(i)>0, increment requiredCount.
8. Finally, check if minWindowSize remained Integer.MAX_VALUE, then return empty string else return substring s.substring(i_start, i_start+minWindowSize).

#Time Complexity: 
- T.C: 
O(m+n) where m = length of s and n = length of t
- S.C: 
O(n)