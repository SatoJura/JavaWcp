
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
	}
}
