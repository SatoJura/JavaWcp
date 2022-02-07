import java.util.ArrayList;

public class ArraySample0 {
	public static void main (String[] args) {
		//ArrayListインスタンスを生成します。
		ArrayList<String> strFruit = new ArrayList<>();
		
        //4つの要素を追加。addメソッドを使用します。
		strFruit.add("りんご");
		strFruit.add("みかん");
		strFruit.add("バナナ");
		strFruit.add("ぶどう");
		
        //拡張for文で各要素を表示します。
		for (String fruit : strFruit) {
			System.out.println(fruit);
		}
	}

}
