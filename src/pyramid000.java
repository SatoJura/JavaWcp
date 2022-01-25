
public class pyramid000 {
	public static void main(String[] args) {
		// 逆ピラミッド①
		for (int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int a=0; a<(5-i)*2-1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
