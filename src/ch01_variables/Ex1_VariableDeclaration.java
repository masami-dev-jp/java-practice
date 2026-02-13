/* 変数 
 変数とはデータの入れる箱のこと
 変数名のルール
  - 1文字目は英字(a-z,A-Z)かアンダーバー(_)、ドル記号($)を使うことができる
  - 2文字目以降は数字も可
  - Public,static,void　などのJava側で用意されているキーワードは使えない
 */

/* 変数の使い方
 1.宣言する → 変数を作成する  例)int age; , String name; ※変数はageやnameを指す
 
 2.代入する → 変数に値を入れる  例)age = 25; , name = "masami";
 
 3.参照する → 値を見る  例)System.out.println(変数名); で変数に代入した値をコンソールに出力することができる
 
 
 変数の宣言と代入を同時に行うことを "変数の初期化" という
 例)
 int age = 25; 
 String name = "masami";
 
 */
	
package ch01_variables;

public class Ex1_VariableDeclaration {	
	
	public static void main(String[] args) {
		String name;      //変数の宣言
		name = "まさみ";   //変数の代入
		int age;          //変数の宣言
		age = 25;         //変数の代入
		
		System.out.println(name);  //変数の参照
		System.out.println(age);   //変数の参照
		System.out.println("私の名前は" + name + "年齢は" + age + "歳です");  //変数の参照

		
		
		int year = 2026;   //変数の初期化
		int month = 2;     //変数の初期化
		int day = 10;      //変数の初期化
		
		System.out.println(year + "年" + month + "月" + day + "日に作成しました");  //変数の参照
	
	}

}
