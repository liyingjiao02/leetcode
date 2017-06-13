
import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int maxLength = 0;
    	int i = 0, j = 0;
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for (i = 0; i < s.length(); ) {
    		if(!map.containsKey(s.charAt(i))){
    			map.put(s.charAt(i), i);
    			i++;	
    			maxLength = Math.max(maxLength, map.size());
    		}
    		else{
    			map.remove(s.charAt(j++));
    		}
		}
    	
    	
    	
    	return maxLength;
        
    }
    
    public static void main(String[] args) {
    	Solution solution = new Solution();
    	int a = solution.lengthOfLongestSubstring("pwwkew");
    	System.out.println(a);
    		
	}
}
