public class LargerDemo {
   public static int larger(int x, int y) { //function in a class is called a method. 
      if (x > y) {
         return x;
      }
      return y; //else can be omitted. 
   }

   public static void main(String[] args) {
      System.out.println(larger(-5, 10)); //prints larger of the two integers. 
   }
}
