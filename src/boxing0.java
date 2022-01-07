
public class boxing0 {
	public static void main(String[] args){
		Integer integer1 = 5;                   // オートボクシング(プリミティブ型の値をラッパークラス型へ変換)
		//Integer integer2 = Integer.value0f(5);  // 明示的なボクシング
		int int1 = integer1;              // アンボクシング(ラッパークラス型の値からプリミティブ型への変換)
		//int int2 = integer2.invalue();  // 明示的なアンボクシング
		
		System.out.println (integer1);  // 5
		System.out.println (int1);      // 5
		
		Integer i = null;  // オートボクシング
		int i2 =  i;       // アンボクシング→NullPointerExceptionが起きる(プリミティブ型はnullを許容しないため)
		
	}
}
