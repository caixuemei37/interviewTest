# interviewTest
/*
Write a program to reverse every k nodes of a linked list.
If the list size is not a multiple of k, then leave the remainder nodes as is.
 
Example:
Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3
Output:  3->2->1->6->5->4->7->8->NULL
*/
/*
@author: Cai Xuemei
*/
public class Solution {
	
	static ListNode node;
	
	class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
   }

public ListNode reverseKGroup(ListNode head, int k) {
	    ListNode current = head;
	    int count = 0;
      
	    while (current != null && count != k) { // find the k+1 node
	        current = current.next;
	        count++;
	    }
      
	    if (count == k) { // if k+1 node is found
	        current = reverseKGroup(current, k); // reverse list with k+1 node as head
	        // head - head-pointer to direct part, 
	        // current - head-pointer to reversed part;
	        while (count-- > 0) { // reverse current k-group: 
	            ListNode tmp = head.next; // tmp - next head in direct part
	            head.next = current; // appending "direct" head to the reversed list 
	            current = head; // move head of reversed part to a new node
	            head = tmp; // move "direct" head to the next node in direct part
	        }
	        head = current;
	    }
	    return head;
    }
	
	void printList(ListNode head) {
	        while (head != null) {
	            System.out.print(head.val + " ");
	            head = head.next;
	        }
	  }
	
	void push(int newdata) {
        ListNode mynode = new ListNode(newdata);
        mynode.next = node;
        node = mynode;
    }
	
   public static void main(String[] args) {
    	 Solution list = new Solution();
    	 
         // Creating the a linked list
         for (int i = 20; i > 0; i--) {
             list.push(i);
         }
         System.out.println("Given Linked List :");
         list.printList(node);
         node = list.reverseKGroup(node, 3);
         System.out.println("");
         System.out.println("Modified Linked List :");
         list.printList(node);
    }
}
