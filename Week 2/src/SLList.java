public class SLList {
	private static class IntNode { /*nested class. If nested class doesn't use methods or variables of outer
									class, declare it static. Only nested static classes can have constructors */
									
		public int item;
		public IntNode next;
		
		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}
	private IntNode first; //access control to keep IntNode from being modified elsewhere. 
	
	public SLList(int x) { //constructor 
		first = new IntNode(x, null);
	}
	public SLList() { //constructor for empty SLList. 
		first = null;
	}
	public static void main(String[] args) { //this is weird. why not just use inheritance? 
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		L.addLast(100);
		System.out.println(L.getFirst()); //L.first is of type IntNode. L.first.item is of type int. 
		System.out.println(L.size());
		SLList M = new SLList(); //using null type constructor. 
		M.addLast(5);
		System.out.println(M.first.item);
		System.out.println(M.size());
	}
	public void addFirst(int x) {
		first = new IntNode(x, first); //adding new value onto IntNode object. 
	}
	public void addLast(int x) {  //this is really confusing.
		IntNode a = first;      //establishing LOCAL VARIABLE a. Modifying this DOES NOT modify "first" directly. 
		if (first == null) {     //working directly with class object "first". 
			first = new IntNode(x, null);
			return;
		}
		else {
			while(a.next != null) { //moving down object first. 
				a = a.next;  
			}
			a.next = new IntNode(x, null); //a is not a primitive data type. it inherently points to the first data type. 
		} //this works because we're not modifying a. We're modifying a.next, which "first" also points to.  
	}
	public int size() { //my implementation of a size() method. Work done is dependent on SLList size.
		int listSize = 1;
		SLList a = this;
		if (a.first.next == null) {
			return 1;
		}
		while (a.first.next != null) { 
			a.first.next = a.first.next.next;
			listSize ++;
		}
		return listSize;
	}
	public int getFirst() {
		IntNode a = first; //also works. 
		return a.item; //first is SSList.first. This returns the first (most recently added) value. 
	}
}
/* CHATGPT HELP BELOW:
 * In the if statement, when you check if (a == null), you are checking if the local variable a is null. However, this does not change the state of the outer class's first field. It only checks if the local variable a (which initially holds the same reference as first) is null.

If you were to write if (first == null) instead, you are checking the state of the first field of the outer class. If first is null, it means the list is empty, and you need to initialize it with a new IntNode. If you use if (a == null), it checks the local variable a and does not affect the first field.

So, to properly handle the case where the list is initially empty, you need to check the first field of the outer class, not the local variable a.
*/
