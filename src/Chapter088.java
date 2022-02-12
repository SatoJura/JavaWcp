
public class Chapter088 {
	public static void main (String[] args) {
		// 1.「while」文
		// 1以上5未満の数の2乗を出力
		int i = 1;
		while(i < 5) {
			System.out.println("1." + i * i);
			i++;
		}
		
		/* 2. 通常「for」文
		　・要素数が4の「int」配列を初期化
		　・配列のサイズ分ループして、要素を出力
		　※ 配列のサイズは「変数名.length」で取得が可能
		*/
		int[] array= {1,2,3,4};
		for (int j = 0; j < array.length; j++) {
			System.out.println("2." + array[j]);
		}
	}

}
