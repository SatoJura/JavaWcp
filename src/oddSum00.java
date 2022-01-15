
public class oddSum00 {
	public static void main(String[] args) {
		// 奇数の合計①
		int oddSum1 = 0;
		for (int i = 1; i <= 10; i += 2) {
			oddSum1 += i;
		}
		System.out.println("奇数の合計は " + oddSum1);
		
		// 奇数の合計②
		int oddSum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println("奇数の合計は " + oddSum);
		
		// 奇数の合計③
		int oddSum2 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			oddSum2 += i;
		}
		System.out.println("奇数の合計は " + oddSum2);
	}
}
