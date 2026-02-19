/* データ型
 データ型とは変数宣言する際のデータの種類のこと
 データ型には "基本データ型" と "参照型" がある
 
 基本データ型
 　- 整数
 　- 少数
 　- 文字
 　- 真偽値

 参照型
 　- 文字列
 　- 配列
 
 
 基本データ型
 　整数　　- byte        8ビット     とても小さな整数　　　　　　例)byte glasses;  所持するメガネの数
      　　- short       16ビット    小さな整数　　　　　　　　　例)short age;  年齢
     　　 - int         32ビット    普通の整数　　　　　　　　　例)int salary;  給与金額    ※一番利用頻度が多い
      　　- long        64ビット    大きな整数　　　　　　　　　例)long worldPeople;  世界の人口
  
 　少数　　- float       32ビット    少しあいまいでも良い少数　　例)float weight;  体重
     　 　- double      64ビット    普通の少数　　　　　　　　　例)double pi;  円周率 
      
 　真偽値　- boolean        -       true(真)かfalse(偽)　　　例)boolean isError;  エラーか否か
 
 　文字　　- char        16ビット    １つの文字　　　　　　　　　例)char initial;  イニシャル１文字

 ・ビット数が増えると表現できる値が多くなる
 ・数値はデフォルトで int と double　→ float型の少数にはf(F)を、long型の整数にはl(L)をつける
 ・文字のデータは '　(シングルクォート)で囲む


 参照型
 　文字列　- String         -       文字の並び　　　　　　　　　例)String name;  自分の名前   ※StringのSは大文字
 
 
 ・データ自体はメモリ上の別の場所に置かれてそのアドレスの値(参照値)が変数に入る
 
 String name = "まさみ";    
 　例えば変数の初期化をした際、文字列 "まさみ" はA001というメモリ上の住所(アドレス)に作られる
 　変数nameは文字列 "まさみ" が格納されているメモリ上の住所(アドレス)であるA001を参照している
 
 */



package ch01_variables;

public class Ex2_DataTypeExample {

	public static void main(String[] args) {
		int month = 3;
		int day = 27;
		float weight = 71.0f;     // ※float型の場合は値の末尾にfをつける
		double height = 175.5;
		char bloodType = 'o';
		String name = "まさみ";
		
		
		long worldPeople = 8000000000l;     // ※long型の場合は値の末尾にlをつける
		char Rank = 'A';
		boolean isAdult = true;
		
		System.out.println("こんにちは、" + name + "です。" );
		System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
		System.out.println("誕生日は" + month + "月" + day + "日、");
		System.out.println("血液型は" + bloodType + "型です。");
		System.out.println("よろしくお願いします！");
		System.out.println("");
		System.out.println("世界の人口は約" + worldPeople + "人です。");
		System.out.println("ランクは" + Rank + "です。");
		System.out.println("彼は成人ですか？" + isAdult);
	}

}
