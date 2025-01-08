package info;
// スーパークラス。キャラクターの情報を格納する。
public class Info {
	/*
	 * [概要]フィールド変数の宣言。
	 * [詳細]必要なフィールド変数を用意する。また、カプセル化も行う。
	 */
	// キャラクター名を格納するフィールド変数を作成。
	private String name;
	// 能力名を格納するフィールド変数を作成。
	private String[] ability;
	// 能力値を格納するフィールド変数を作成。
	private int[] value;
	/*
	 * [概要]setterの作成。
	 * [詳細]他クラスから、フィールド変数を変更するためのsetterを作成する。
	 */
	// キャラクター名を格納するセッターを宣言。引数にString型を指定する。
	public void setName(String name) {
		// フィールド変数に引数を代入する。
		this.name = name;
	}
	// 能力名を格納するためのsetterを作成。 引数にString型の配列を指定。
	public void setAbility(String[] ability) {
		// フィールド変数に引数を代入する。
		this.ability = ability;
	}
	// 能力値を格納するためのsetterを作成。 引数にint型の配列を指定。
	public void setValue(int[] value) {
		// フィールド変数に引数を代入する。
		this.value = value;
	}
	/*
	 * [概要]getterの作成処理
	 * [詳細]getterを作成し、他クラスからフィールド変数の値を参照出来るようにする。
	 */
	// getterの作成。戻り値の値をString型に指定。
	public String getName() {
		// フィールド変数nameを戻り値に指定。
		return this.name;
	}
	// getterの作成。戻り値の値をString型の配列に指定。
	public String[] getAbility() {
		// フィールド変数abilityを戻り値に指定。
		return this.ability;
	}
	// getterの作成。戻り値にint型の配列を指定。
	public int[] getValue() {
		// フィールド変数valueを戻り値に指定。
		return this.value;
	}
}
