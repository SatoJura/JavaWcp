import java.util.HashSet;

public class HashSet0 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("→HashSetの中身"+hs);
		
		System.out.println("哺乳類を追加");
		hs.add("哺乳類");
		System.out.println("→HashSetの中身"+hs);
		
		System.out.println("爬虫類を追加");
		hs.add("爬虫類");
		System.out.println("→HashSetの中身"+hs);
		
		System.out.println("両生類を追加");
		hs.add("両生類");
		System.out.println("→HashSetの中身"+hs);
		
		// 既に登録済みの哺乳類をもう一度追加
		System.out.println("もう一度哺乳類を追加");
		hs.add("哺乳類");
		System.out.println("→HashSetの中身"+hs);
		
		// 登録済みの爬虫類を削除
		System.out.println("爬虫類を削除");
		hs.remove("爬虫類");
		System.out.println("→HashSetの中身"+hs);
		
		// 登録済みの全て要素の削除
		System.out.println("HashSetの全ての内容をクリア");
		hs.clear();
		System.out.println("→HashSetの中身"+hs);
	}

}
