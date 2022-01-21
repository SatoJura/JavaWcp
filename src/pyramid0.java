
public class pyramid0 {
	public static void main(String[] args) {
		// 逆三角形
		// 段数（縦の行 i=0~4の計5行にする）
		for (int i=0; i<5; i++) {
			// 左側の空白の数(j)
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			/* 空白の隣にアスタリスク(k)、x2-1で奇数にする
			 (段数-i)x2-1 */
			for (int k=0; k<(5-i)*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ②
		for (int a=0; a<5; a++) {
			for (int space=0; space<a; space++) {
				System.out.print(" ");
			}
			for (int ast=0; ast<(5-a)*2-1; ast++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		// ③3段逆ピラミッド
		for (int c=0; c<3; c++) {
			for (int sp=0; sp<c; sp++) {
				System.out.print(" ");
			}
			for (int as=0; as<(3-c)*2-1; as++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
