public class Solution {
    public int reverse(int x) {
       long result = 0;
     	int y = 0;
 		while(x != 0){
 			y = x % 10;
 			x = x / 10;
     		result = result * 10 + y;
     		
     	}
 		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
 			result = 0;
 		}
     	return (int)result;
    }
}
