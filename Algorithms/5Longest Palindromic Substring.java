package leetcode;


public class Solution {
    public String longestPalindrome(String s) {
    	String result = null;
    	int maxLength = 0;
    	if(s == null)
    		return "";
    	int i = 0;
    	while(i < s.length()){
    		// odd 
    		int oddLength = 1;
    		int left = i -1;
    		int right = i + 1;
    		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
    			left --;
    			right ++;
    			oddLength += 2;
    		}
    		if(oddLength >= maxLength){
    			maxLength = oddLength;
    			result = s.substring(i-maxLength/2, i+maxLength/2+1);
    		}
    		// even
    		left = i;
    		right = i+1;
    		int evenLength = 0;
    		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
    			left --;
    			right ++;
    			evenLength += 2;
    		}
    		if(evenLength >= maxLength){
    			maxLength = evenLength;
    			result = s.substring(i-maxLength/2+1, i+maxLength/2+1);
    		}
    		i++;
    	}
    	return result;
    }
    
    
    
    public static void main(String[] args) {
		String s = "eebabd";
		Solution solution = new Solution();
		
		System.out.println(solution.longestPalindrome(s));
	}
    
    
    
}
