public class Solution {
    public String reverseString(String s) {
    	if(s == null || s.length() == 0)
    		return s;
        char [] array = new char[s.length()];
        int j = 0;
        for(int i = s.length()-1; i >= 0; i --){
            array[j++] = s.charAt(i); 
        }
        return new String (array);
    }
    public static void main(String[] args) {
		String s = "hello";
		Solution solution = new Solution();
		String a = solution.reverseString(s);
		System.out.println(a);
	}
}
