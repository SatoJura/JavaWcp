
public class Human01 {
	public String name; //メンバ変数
	public int age; //メンバ変数
	
	// 引数なしのコンストラクタ
	public Human01() {
		name = "山田";
		age = 20;
	}
	
	// 引数2つのコンストラクタ
	public Human01(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
