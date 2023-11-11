public class Dog {
   int weightInPounds;

   public Dog(int w) { //constructor method has same name as class 
      weightInPounds = w; //Python: this is this.weightInPounds. 
   }

   public void makeNoise() { //INSTANCE method, as opposed to a static method. 
      if (weightInPounds < 10) {
         System.out.println("yip!");
      } else if (weightInPounds < 30) {
         System.out.println("bark.");
      } else {
         System.out.println("woooooof!");
      }
   }
   public static Dog maxDog(Dog d1, Dog d2) { //method accepts class objects as arguments. 
	  if (d1.weightInPounds > d2.weightInPounds) {
		   return d1;
	  }
	  return d2; //omitted else 
   }
}


