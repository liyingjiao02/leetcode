public class Solution {
      public String longestCommonPrefix(String[] strs) {
	 
		 if(strs.length == 0){
			 return "";
		 }
		 if(strs[0].length() == 0){
			 return "";
		 }
		 int i = 0;
		 while(true){
			 for(int j = 0; j < strs.length; j ++){
				
				 if(i == strs[j].length()){
					 return strs[j];
				 }
				 char temp1 = strs[0].charAt(i);
				 char temp2 = strs[j].charAt(i);
				 if(temp1 != temp2){
					 return strs[0].substring(0, i);
				 }
			 }
			 i ++;
		 }
	 }
    
    
}
