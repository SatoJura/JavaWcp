
public class FizzBuzz0 {
	public static void main (String[] args) {
		String Fizz = "Fizz";
		String Buzz = "Buzz";
		
		for (int i=1; i<=100; i++) {
			if (i % (3*5) == 0) {
				System.out.println(Fizz + Buzz);
			} else if (i % 3 == 0) {
				System.out.println(Fizz);
			} else if (i % 5 == 0) {
				System.out.println(Buzz);
			}  else {
				System.out.println(i);
			}
		}
	}

}
