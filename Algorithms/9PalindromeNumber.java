public class Solution {
   public boolean isPalindrome(int x) {
        //   123454321
        if(x < 0 || (x != 0 && x % 10 == 0))
        	return false;
        int temp = 0;
        while(x > temp){
        	int a = x % 10;
        	x = x /10;
        	temp = temp * 10 + a;
        }
        return (x == temp || x == temp / 10);
    }
}
