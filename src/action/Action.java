package action;
// Randomクラスを使用するためのインポート処理
import java.util.Random;
// Scannerクラスを使用するためのインポート処理
import java.util.Scanner;

// スーパークラスのインポート処理。
import info.Info;

/*
 * [概要]サブクラスの作成。
 * [詳細]サブクラスを作成し、スーパークラスのメソッドを継承する。
 */
// サブクラスの宣言。
public class Action extends Info {
	/*
	 * [概要]コンストラクタの作成。
	 * [詳細]コンストラクタを作成し、インスタンスを生成した時に最初に実行してほしい処理を記述する。
	 */
	// コンストラクタの作成。
	public Action() {
		// nameSettingメソッドの実行。
		nameSetting();
		// abilitynameメソッドの実行。
		abilityname();
		// valuesettingメソッドの実行。
		valueSetting();
		// greetingメソッドの実行。
		greeting();
	}
	/*
	 * [概要]メソッドの作成。
	 * [詳細]名前をコンソール入力で受取り、親クラスのフィールド変数に値を代入するメソッドを作成。
	 */
	// メソッドの作成。
	public void nameSetting() {
		// Scannerクラスのインスタンス生成。
		Scanner scanner = new Scanner(System.in);
		// setterにscannerに入力された値を受け取る。
		setName(scanner.nextLine());
		// メモリの開放。
		scanner.close();
	}
	/*
	 * [概要]メソッドの作成
	 * [詳細]setterに、能力の種類を受け取るメソッドを作成する。
	 */
	// メソッドの作成
	public void abilityname() {
		// 配列を宣言、文字列を格納する。
		String[] ability = {"HP", "MP", "攻撃力", "素早さ", "防御力"};
		// setterに上記配列を受け取る。
		setAbility(ability);
	}
	/*
	 * [概要]メソッドの作成
	 * [詳細]乱数を能力の数だけ取得し、フィールド変数に格納する処理を記述する。
	 */
	// メソッドの作成。
	public void valueSetting() {
		// ランダムクラスのインスタンスを生成。
		Random r = new Random();
		// 能力値の個数だけ配列を作成する。
		int[] value = new int[getAbility().length];
		// for文。カウント用の変数をiとし、能力値の個数分だけ繰り返しを宣言。
		for(int i = 0; i < getAbility().length; i++) {
			// 配列に乱数を格納。(0~999)
			value[i] = r.nextInt(999);
		}
		// setterを使用して、配列をフィールド変数に格納する。
		setValue(value);
	}
	/*
	 * [概要]メソッドの作成
	 * [詳細]コンソールに表示する文字列をまとめたメソッドを作成する。
	 */
	// メソッドの作成。
	public void greeting() {
		// getterを使用して名前を出力する。
		System.out.println("こんにちは「" + getName() + "」さん");
		// 表示する文字列
		System.out.println("ステータス");
		// for文 カウント用の変数iを0で初期化し、能力値の個数分だけ繰り返しを行う。
		for(int i = 0; i < getAbility().length; i++) {
			// getterを使用して、能力値の名前と、能力値を順番に出力する。
			System.out.println(getAbility()[i] + " : " + getValue()[i]);
		}
		// 改行
		System.out.println();
		// 表示する文字列
		System.out.println("さあ冒険に出かけよう！");
	}
	
	public static void main(String[] args) {
		// Actionクラスのインスタンスの生成。コンストラクタの実行。
		Action act = new Action();
	}
}
