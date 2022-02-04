
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
		
		// 奇数の合計④
		int oddSum3 = 0;
		for (int i=1; i<100; i+=2) {
			oddSum3+=i;
		}
		System.out.println("④奇数の合計は " + oddSum3);
		
		// 奇数の合計⑤
		int oddSum4 = 0;
		for (int i=1; i<100; i++) {
			if (i % 2 != 0) {
				oddSum4+=i;
			}
		}
		System.out.println("⑤奇数の合計は " + oddSum4);
		
		// 奇数の合計⑥
		int oddSum5 = 0;
		int[] array = {1,4,5,7,9,10};
		for (int oddNum : array) {
			if (oddNum % 2 != 0) {
				oddSum5 += oddNum;
			}
		}
		System.out.println("⑥奇数の合計は" + oddSum5);
	}
}
