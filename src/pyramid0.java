
public class pyramid0 {
	public static void main(String[] args) {
		// 逆三角形
		// 段数（縦の行 i=0~4の計5行にする）
		for (int i=0; i<5; i++) {
			// 左側の空白の数(j)
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			// 空白の隣に✳(k) 奇数になるように
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
	}
}
