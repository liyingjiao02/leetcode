
public class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        if(length == 0)
        	return true;
        int i = 0; 
        int j = length - 1;
        
//        while(i <= j){
//        	char c1 = s.charAt(i);
//        	char c2 = s.charAt(j);
//        	if(c1 <= 'z' && c1 >= 'a' && c1 <= '9' && c1 >= '0' && c1 <= 'Z' && c1 >= 'A'){
//        		i ++;
//        		continue;
//        	}
//        	
//        }
        
       loop: while(i <= j){
        	char c1 = s.charAt(i);
        	char c2 = s.charAt(j);
        	if(!(('a' <= c1 && c1 <= 'z') || ('A' <= c1 && c1 <= 'Z') || ('0' <= c1 && c1 <= '9'))){
        		i ++;
        		continue loop;
        	}
        	if(!(('a' <= c2 && c2 <= 'z') || ('A' <= c2 && c2 <= 'Z') || ('0' <= c2 && c2 <= '9'))){
        		j --;
        		continue loop;
        	}
        	
        	if('A' <= c1 && c1 <= 'Z'){
        		c1 += 32;
        	}
        	if('A' <= c2 && c2 <= 'Z'){
        		c2 += 32;
        	}
        	int res = (int)(c1 -c2);
        	if(res != 0)
        		return false;	
        
        	i ++;
        	j --;
        }
    	return true;        
    }
    public static void main(String[] args) {
		String s = "abcba";
		Solution solution  = new Solution ();
		boolean flag = solution.isPalindrome(s);
		System.out.println("flag:"+flag);
    
    }
    
}
