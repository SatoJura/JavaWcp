
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
		
		/* 3. 拡張「for」文
		　・「2.」の配列をループ
		　・要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
		*/
		for (int arr : array) {
			if (arr % 2 == 0) {
				continue;
			}
			System.out.println("3." + arr);
		}
	}

}
