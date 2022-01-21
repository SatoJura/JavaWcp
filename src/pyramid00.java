
public class pyramid00 {
	public static void main(String[] args) {
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
	}
}
