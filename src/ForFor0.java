
public class ForFor0 {
	public static void main(String[] args) {
		// for構文の中にfor構文
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= 1; j--) {
				if (i != j) {
					System.out.println("i = " + i + ", j = " + j);
				}
			}
		}
	}
}
