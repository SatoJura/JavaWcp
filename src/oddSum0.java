
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
		
		// 奇数を出力④
		int[] numbers = {1,4,5,6,7,9};
		for (int number: numbers) {
			if (number % 2 != 0) {
				System.out.println("④" + number);
			}
		}
		 // 奇数を出力⑤
		int j = 1;
		while (j <= 10) {
			System.out.println("⑤" + j);
			j += 2;
		}
		
		// 奇数を出力⑥
		int[] nums = {1,4,7,8,10,12,15,20};
		for (int num: nums) {
			if (num % 2 != 0) {
				System.out.println("⑥" + num);
			}
		}
	}
}
