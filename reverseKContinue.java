public class reverseKContinue {

	static ListNode testNode;

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode reverseKGroup(ListNode node, int k) {
		ListNode current = node;
		int count = 0;
		while (current != null && count != k) {
			current = current.next;
			count++;
		}
		if (count == k) {
			current = reverseKGroup(current, k);
			while (count-- > 0) {
				ListNode tmp = node.next;
				node.next = current;
				current = node;
				node = tmp;
			}
			node = current;
		}
		return node;

	}

	void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

	void push(int newdata) {
		ListNode mynode = new ListNode(newdata);
		mynode.next = testNode;
		testNode = mynode;
	}

	public static void main(String[] args) {
		reverseKContinue list = new reverseKContinue();

		// Creating the a linked list
		for (int i = 20; i > 0; i--) {
			list.push(i);
		}
		System.out.println("Given Linked List :");
		list.printList(testNode);
		testNode = list.reverseKGroup(testNode, 3);// such as K = 3, just for example
		System.out.println("");
		System.out.println("Modified Linked List :");
		list.printList(testNode);
	}
}
