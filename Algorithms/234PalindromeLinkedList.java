public class Solution {
	
	
	public boolean isPalindrome(ListNode head) {
		ListNode reverse  = head;
		ListNode current = head;
		ListNode tempHead = head;
		
		int count = 0;
		while(current != null){
			count ++;
			current = current.next;
		}
		
		if(head == null || head.next == null)
			return true;
		
		current = head;
		reverse = head;
		tempHead = current.next;
		reverse.next = null;
		current = tempHead;
		
		int i = 0; 
		while(i < (count-1)/2){
			tempHead = current.next;
			current.next = reverse;
			reverse = current;
			current = tempHead;
			i++;
		}
		
			
		
		if(count % 2 == 1)
			reverse = reverse.next;
		while(current != null && reverse != null){
		//	System.out.println("current.val::"+current.val);
			//System.out.println("reverse.val::"+reverse.val);
			if(current.val != reverse.val)
				return false;
			
			current = current.next;
			reverse = reverse.next;
		}
		return true;
        
    }    
    public static void main(String [] ags){
    	//1-->2-->3-->2-->1
    	ListNode ln1 = new ListNode(1);
    	ListNode ln2 = new ListNode(2);
    	ListNode ln3 = new ListNode(3);
    	ListNode ln4 = new ListNode(2);
    	ListNode ln5 = new ListNode(5);
    	ln1.next = ln2;
    	ln2.next = ln3;
    	ln3.next = ln4;
    	ln4.next = ln5;
    	
    	
    	
    	
    	ListNode ln6 = new ListNode(6);
    	
    	
    	Solution solution = new Solution();
    	boolean flag = solution.isPalindrome(ln1);
    	System.out.println("***************result*************");
    	System.out.println(flag);
    	
    }
    
}
