public class SLList_Modified<LochNess> { //generic types. 
	private StuffNode sentinel;
	private int size; 
	private class StuffNode {
		public LochNess item; //"LochNess" placeholder data type. 
		public StuffNode next;
		
		public StuffNode(LochNess i, StuffNode n) {
			item = i;
			next = n;
		}
	}
	public SLList_Modified(LochNess x) {
		sentinel = new StuffNode(null, null);
		sentinel.next = new StuffNode(x, null);
		size = 1;
		
	}
	public SLList_Modified() {
		sentinel = new StuffNode(null, null);
		size = 0;
	}
	public static void main(String[] args) {
		SLList_Modified<String> list = new SLList_Modified<>("hi!"); //instantiating string SLL
		System.out.println(list.sentinel.next.item); //works. 
	}
	public void addFirst(LochNess x) {
		sentinel.next = new StuffNode(x, sentinel.next);
		size++;
	}
	public LochNess getFirst() {
		return sentinel.next.item;
	}
	public void addLast(LochNess x) {
		size++;
		StuffNode p = sentinel;
		while (p.next != null) {
			p = p.next;
		}
		p.next = new StuffNode(x, null);
	}
}
