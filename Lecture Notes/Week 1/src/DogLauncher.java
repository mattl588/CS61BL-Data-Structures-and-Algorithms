public class DogLauncher {
  public static void main(String[] args) {
	  //Dog d = new Dog(51); //no need to import other file if in same package (default package here)
	  Dog[] dogs = new Dog[2];   //object array of size 3 (0,1,2)
	  dogs[0] = new Dog(2);
	  dogs[1] = new Dog(20);
	  dogs[0].makeNoise(); //indexed Dog object invoking makeNoise method
	  Dog bigger = Dog.maxDog(dogs[0], dogs[1]);
	  bigger.makeNoise();
			  
  }
}
