//my own implementation of a DLList. 

public class DLList_my_implementation {
	private int size = 0;
	private static class IntNode { /*nested class. If nested class doesn't use methods or variables of outer
									class, declare it static. Only nested static classes can have constructors */
									
		public int item;
		public IntNode next;
		public IntNode prev;
		
		public IntNode(int i, IntNode n, IntNode p) {
			item = i;
			next = n;
			prev = p;
		}
	}
	private IntNode head; //access control to keep IntNode from being modified elsewhere. 
	private IntNode tail;
	private IntNode tempNode; 
	
	public DLList_my_implementation(int x) { //correct constructor. 
		tempNode = new IntNode(x, null, null);
		head = tempNode;
		tail = tempNode; 
		size++;
	}
	public DLList_my_implementation() { //constructor for empty SLList. 
		tempNode = null;
		head = tempNode;
		tail = tempNode; 
	}
	public static void main(String[] args) { 
		DLList_my_implementation L = new DLList_my_implementation(3);
		L.addLast(4);  //works. 
		L.addLast(5);  //works.
		L.addFirst(2); //works.
		L.addFirst(1); //works. 
		//System.out.println(L.size());
		//System.out.println(L.getFirst());
		//System.out.println(L.getLast());
		System.out.println(L.head.item);
		System.out.println(L.head.next.item);
		System.out.println(L.head.next.next.item);
		System.out.println(L.head.next.next.next.item); //bug fixed. 
		System.out.println(L.head.next.next.next.next.item);
		
	}
	public void addFirst(int x) { //adding to left side. 
		tempNode = new IntNode(x, null, head);
		head.prev = tempNode; 
		tempNode.next = head; 
		head = tempNode; 
		size++;
	}
	public void addLast(int x) {  //my own implementation of adding to the right side. WORKS.
		tempNode = new IntNode(x, tail, null);
		tail.next = tempNode;
		tempNode.prev = tail;
		tail = tempNode;
		size++;
	}

	public int size() { //my implementation of a size() method. WORKS. 
		return size;
	}
	public int getLast() { //WORKS. 
		return tail.item; 
	}
	public int getFirst() {
		return head.item;
	}
}