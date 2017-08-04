public class Solution {
    public String reverseVowels(String s) {
    	if(s.isEmpty()){
    		return s;
    	}
    	char [] array = s.toCharArray();
    	int i = 0;
    	int j = s.length()-1;
    	while (i < j){
    		while(!(array[i]=='A'||array[i]=='a' ||
    				array[i]=='E'||array[i]=='e' ||
    				array[i]=='I'||array[i]=='i' ||
    				array[i]=='O'||array[i]=='o' ||
    				array[i]=='U'||array[i]=='u') && i < j){
    			i ++;
    		}
    		while(!(array[j]=='A'||array[j]=='a' ||
    				array[j]=='E'||array[j]=='e' ||
    				array[j]=='I'||array[j]=='i' ||
    				array[j]=='O'||array[j]=='o' ||
    				array[j]=='U'||array[j]=='u') && i < j){
    			j --;
    		}
    	//	System.out.println("i--"+array[i]);
    		//System.out.println("j--"+array[j]);
    		char temp = array[i];
    		array[i] = array[j];
    		array[j] = temp;
    		i ++;
    		j --;
    	}
    //	System.out.println("---------");
    
    	// String res = array.toString();
    	// System.out.println(res);
    	return new String (array);
    }
    public static void main (String [] args){
    	String s = "leetcode";
    
    	Solution solution = new Solution();
    	System.out.println(solution.reverseVowels(s));
    	
    	
    }
}
