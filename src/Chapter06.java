
public class Chapter06 {
	public static void main(String[] args) {
		// 2足す5
		int val = 2 + 5;
		System.out.println(val);
		
		// インクリメント
		val ++;
		System.out.println(val);
		
		// 掛ける5
		val *= 5;
		System.out.println(val);
		
		// 等価
		boolean bool = (val == 50);
		System.out.println(bool);
		
		// valは50より小さい AND valを10で割った余りが0
		bool = (val < 50) && (val % 10 == 0); 
		System.out.println(bool);
	}
}
