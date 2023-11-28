//making an ArrayList
public class AList<dataType> {
	private dataType[] items; //instantiating int array
	private int size; //instantiating int
	private int length;
	
	public AList() {
		int arr_length = 100;
		items = (dataType[]) new Object[arr_length]; //making "items" an array of 100 entries. 
		length = arr_length;
	}
	private void resize(int capacity) {
		dataType[] a = (dataType[]) new Object[capacity]; 
		System.arraycopy(items, 0, a, 0, size);
		items = a;
		length = capacity;
	}
	public void addLast(dataType x) {
		if (size < length) {
			items[size] = x; //assigning value 
			size++; //increasing "size" (where "size" is the num. of nonzero numbers in the array)
		}
		resize(size+1);
	}
	public static void main(String[] args) { //just for testing purposes. 
		long startTime = System.nanoTime(); //timing begin
		
		AList myList = new AList();
		int a = 0;
		while (a < 100000) {
			myList.addLast(a);
			a++;
		}
		long endTime = System.nanoTime(); //timing end
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		System.out.println(myList.items[99999]);
	}
	public dataType getLast() {
		return items[size-1];
	}
	public dataType get(int i) {
		return items[i]; //with first position being zero. 
	}
	public int size() {
		return size; 
	}
	public dataType removeLast() { //returns last element of array
		dataType data = items[size-1];
		items[size-1] = null;
		size--;
		return data;
	}
}
