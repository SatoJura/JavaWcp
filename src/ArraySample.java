//必要なimportを行ないます。
import java.util.ArrayList;

public class ArraySample {
	public static void main(String[] args) {
		//ArrayListインスタンスを生成します。
		// List<String> listA = new ArrayList<String>();
		ArrayList<String> listA = new ArrayList<>();
		
		//4つの要素を追加。addメソッドを使用します。
		listA.add("apple");
		listA.add("orange");
		listA.add("banana");
		listA.add("grape");
		
		//拡張for文で各要素を表示します。
		for (String Array : listA) {
			System.out.println(Array);
		}
	}
}
