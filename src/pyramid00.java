
public class pyramid00 {
	public static void main(String[] args) {
		// 正ピラミッド
		
		// 段数
		for (int i=0; i<5; i++) {
			// 左側の空白
			for (int j=0; j<5-(i+1); j++) {
				System.out.print(" ");
			}
			// 空白の右隣に1行ごとの*を出力
			for (int k=0; k<(i+1)*2-1; k++) {
				System.out.print("*");
			}
			// 改行
			System.out.print("\n");
		}
		
		// ②
		for (int a=0; a<10; a++) {
			/*
			 * 空白 aの初期値0なのであらかじめ1を足した数を、段数から引く
			 * 上が空白多く、下が少ない
			 */
			for (int space=0; space<10-(a+1); space++) {
				System.out.print(" ");
			}
			/* アスタリスク aの初期値0なのであらかじめ1を足す&奇数の計算
			 * 上が*1つ、下に下がるごとに増えていく
			 */
			for (int ast=0; ast<(a+1)*2-1; ast++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
