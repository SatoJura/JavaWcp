import java.util.HashSet;

public class HashSet000 {
	public static void main (String[] args) {
		//HashSetインスタンスを生成し、Set型の変数setに代入します。
        //扱う要素はString型です。
		HashSet<String> set = new HashSet<String>();
		
        //addメソッドを使って、「りんご」「みかん」「バナナ」「ぶどう」
        //の各文字列を要素として追加します。
		set.add("りんご");
		set.add("みかん");
		set.add("バナナ");
		set.add("ぶどう");

        //removeメソッドを使って「みかん」を削除します。
		set.remove("みかん");
		
		System.out.println(set);  // 結果[りんご, ぶどう, バナナ]
		
		//containsメソッドを使って「バナナ」が含まれているかを判定し、trueかfalseを表示します。
		System.out.println(set.contains("バナナ"));

        //containsメソッドを使って「みかん」が含まれているかを判定し、trueかfalseを表示します。
		System.out.println(set.contains("みかん"));
    }
}
