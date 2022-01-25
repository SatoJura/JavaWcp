
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
		
		// 正ピラミッド②
		for (int i=0; i<5; i++) {
			for (int j=0; j<5-(i+1); j++) {
				System.out.print(" ");
			}
			for (int a=0; a<(i+1)*2-1; a++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		// 逆ピラミッド4段にして、ひし形にする③
		for (int i=0; i<4; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print(" ");
			}
			for (int a=0; a<(4-i)*2-1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
