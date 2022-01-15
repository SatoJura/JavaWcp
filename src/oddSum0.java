
public class oddSum0 {
	public static void main (String[] args) {
		// 奇数を出力①
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		
		// 奇数を出力②
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		// 奇数を出力③
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
