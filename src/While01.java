
public class While01 {
	public static void main(String[] args) {
		// 2の倍数を繰り返し出力
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
		
		// numberが0より大きい場合に繰り返す
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}

}
