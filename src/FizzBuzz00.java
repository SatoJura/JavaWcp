
public class FizzBuzz00 {
	// 3で割り切れる"Fizz",5で割り切れる"Buzz",3と5で割り切れる"FizzBuzz"
	public static void main(String[] args) {
		// ループカウンタ
		int loopCount = 100;
		// 3の倍数
		int numFizz = 3;
		// 5の倍数
		int numBuzz = 5;
		// Fizz文字列
		String strFizz = "Fizz";
		// Buzz文字列
		String strBuzz = "Buzz";
		
		for (int i = 1; i <= loopCount; i++) {
			if (i % (numFizz * numBuzz) == 0) {
				System.out.println(strFizz + strBuzz);
			} else if (i % numFizz == 0) {
				System.out.println(strFizz);
			} else if (i % numBuzz == 0){
				System.out.println(strBuzz);
			} else {
				System.out.println(i);
			}
		}
	}

}
