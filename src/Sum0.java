
public class Sum0 {
	public static void main (String[] args) {
		// 奇数と偶数 それぞれの合計を求めよ
		int[] numbers = {1,5,7,34,45,66,67,78,100};
		
		int oddSum = 0;
		int evenSum = 0;
		
		for (int number : numbers) {
			if (number % 2 == 0) {
				evenSum += number;
			} else {
				oddSum += number;
			}
		}
		System.out.println("奇数の合計は" + oddSum + "です");
		System.out.println("偶数の合計は" + evenSum + "です");
		
		// 1~100までの奇数の合計を求めよ
		int oddSum1 = 0;
		
		for (int i = 1; i <= 100; i+=2) {
			oddSum1 += i;
		}
		System.out.println("1~100までの奇数の合計は" + oddSum1 + "です");
		
		// 1~100までの偶数の合計を求めよ
		int evenSum1 = 0;
		for (int i = 1; i <= 100; i+=1) {
			if (i % 2 == 0) {
				evenSum1 += i;
			}
		}
		System.out.println("1~100までの偶数の合計は" + evenSum1 + "です");
	}
}
