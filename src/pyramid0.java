
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
	}
}
