/* 型変換
 型変換には以下の３つがある。1と3については開発者が気にしなくても自動的に機能する
 　1.代入時の自動型変換
 　2.強制的な型変換
 　3.演算時の自動型変換
 
 ←小　　　　　　　　　　　　　　　　大→
 byte short int long float double
 
 
 代入時の自動型変換
 　「小さな型」の値を「大きな型」の変数に代入する場合、代入する値を代入先の変数の型に自動で変換してから代入される
 　逆に「大きな型」の値を「小さな型」の変数に代入することは原則としてできない
 　ただしbyte型やshort型の変数は実害がない範囲でint型に代入することができる
 　例)float a = 4　→ 小さな型のint 4 は大きな型のfloat型に変換されてからaに代入される
 　　 int i = 3.5　→ 浮動小数点型の大きな型の値3.5を小さな型の変数iに代入しようとするとエラーになる
 
 強制的な型変換
 　「大きな型」の値を「小さな型」の変数に原則代入することができないが、無理やり代入することができる
 　リテラルの前にキャスト演算子()を記述することで強制的に型変換ができる(乱暴なやり方で不具合が発生する可能性もあるため基本的には使用を推奨しない)
 　例)int age = (int)3.2;
 
 演算時の自動型変換
 　異なる型で算術演算をした際に "意味的に大きな型" に統一されてから演算が行われる
 　片方がdouble型で片方がint型なら、int型の方をdouble型に自動変換して型を揃えてから演算する
 　片方が数値型で片方がString型の場合は、数値型の方をString型に自動変換して型を揃えてから連結する
  
 */




package ch01_variables;

public class Ex4_TypeConversion {

	public static void main(String[] args) {
		
		//代入時の自動型変換
		float a = 4;   //int型の整数４をfloat型の変数aに代入
		double b = a;  //float型のa(4.0f)をdouble型の変数bに代入
		System.out.println(a);
		System.out.println(b);
		
		//強制的な型変換
		int weight = (int)71.5;  //キャスト演算子の(int)をリテラル前に置くことで強制的に型変換を指示する
		System.out.println(weight);

		//演算時の自動型変換
		double c = 3.5 / 2;  //int型2をdouble型2.0に変換してから計算
		long d = 3 + 2L;     //int型3をlong型3Lに変換してから計算
		System.out.println(c);
		System.out.println(d);
		
		//文字列の連結
		String msg = "私の体重は" + 71;  //int型71がString型"71"に変換されて連結される
		System.out.println(msg);
		
		//消費税込みの金額を表示させる
		int price = 3270;
		double rate = 0.12;  //消費税12％
		int amount;
		amount = (int)(price * (1 + rate)); //int型3270をdouble型0.12で掛け算した場合は3662.4と少数になるが、キャスト演算子で強制的にint型へ変換している
		System.out.println(amount);
	}

}
