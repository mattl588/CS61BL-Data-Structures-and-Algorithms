public class IntList {
   public int first;
   public IntList rest;  //class object inside of the class. odd. 

   public IntList(int f, IntList r) { 
      first = f;
      rest = r;
   }

   public static void main(String[] args) { //this whole practice is really confusing. it it standard practice? 
      IntList L = new IntList(15, null); //making first 15. 
      L = new IntList(10, L); //making first 10, adding 15 to end. 
      L = new IntList(5, L); //making first 5, adding 10, and then adding 15. 
      L = new IntList(15, L);
      System.out.println(L.first + " " + L.rest.first + " " + L.rest.rest.first);  //outputting IntList values
      System.out.println(L.size());
      System.out.println(L.iterativeSize());
      System.out.println(L.get(2));
      System.out.println(L.iterativeGet(2));
   }
   public int size() { //recursive method 
	   if (rest == null) {
		   return 1;
	   }
	   return 1 + this.rest.size();
   }
   public int iterativeSize() { //non-recursive method. made it myself. 
	   IntList N = this;
	   int length = 1;
	   if (N.rest == null) {
		   return 1;
	   }
	   while (N.rest != null) {
		   length += 1; 
		   N = N.rest;
	   }
	   return length;
   }
   public int get(int i) { //recursive indexing. very clever. 
	   if (i == 0) {
		   return first;
	   }
	   return rest.get(i-1);
   }
   public int iterativeGet(int i) { //do yourself. 
	   if (i == 0) {
		   return first;
	   }
	   IntList L = this;
	   for(int j = 1; j <= i; j++) {
		   L = L.rest;
	   }
	   return L.first;
   }
}
