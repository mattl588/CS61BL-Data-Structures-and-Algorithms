
public class HelloNumbers {
	public static void main(String[] args) {
		int x = 0; //must instantiate in statically typed language. Statically typed = more verbose but type errors rarer
		while(x < 10) {
			System.out.println(x);			
			x = x + 1;
		}
	}
}
