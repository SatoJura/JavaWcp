
public class Chapter08 {
	public static void main(String[] args) {
		// while文
		int num = 1;
		while (num < 5) {
			System.out.println(num*num);
			num++;
		}
		
		// for文
		int[] array = {1, 4, 6, 11};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// 拡張for文
		for (int arr : array) {
			if(arr % 2 == 0) {
				continue;
			}
			System.out.println(arr);
		}
	}
}
