package leetcode.algorithms;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
  
        int sum = 0;
        sum = l1.val + l2.val;
        ListNode result = new ListNode(sum%10);
        ListNode resTmep = result;
        int carry = sum/10;
        while(l1.next != null && l2.next != null){
        	l1 = l1.next;
        	l2 = l2.next;
        	sum = l1.val + l2.val + carry;
            ListNode temp = new ListNode(sum%10);
            resTmep.next = temp;
            resTmep = resTmep.next;
            carry = sum/10;
        }
        while(l1.next != null){
        	l1 = l1.next;
        	sum = l1.val + carry;
        	ListNode temp = new ListNode(sum%10);
        	resTmep.next = temp;
            resTmep = resTmep.next;
        	carry = sum/10;
        }
        while(l2.next != null){
        	l2 = l2.next;
        	sum = l2.val + carry;
        	ListNode temp = new ListNode(sum%10);
        	resTmep.next = temp;
            resTmep = resTmep.next;
        	carry = sum/10;
        }
        if(carry != 0){
        	ListNode temp = new ListNode(carry);
        	resTmep.next = temp;
            resTmep = resTmep.next;
        }
        
        return result;
    }
    public void display(ListNode l){
		while(l != null){
			System.out.print(l.val+" ");
			l = l.next;
		}
		System.out.println();
	}
    
    
    public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode ln2 = new ListNode(4);
		ListNode ln3 = new ListNode(3);
		ListNode l2 = new ListNode(5);
		ListNode ln5 = new ListNode(6);
		ListNode ln6 = new ListNode(4);
		l1.next = ln2;
		ln2.next = ln3;
		l2.next = ln5;
		ln5.next = ln6;
		Solution solution = new Solution();
		solution.display(l1);
		solution.display(l2);
		solution.display(solution.addTwoNumbers(l1, l2));
		
		ListNode m1 = new ListNode(5);
		ListNode m2 = new ListNode(5);
		solution.display(solution.addTwoNumbers(m1, m2));		
		
		
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
