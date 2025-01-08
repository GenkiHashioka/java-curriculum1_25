package action;

import java.util.Random;
import java.util.Scanner;

import info.Info;


public class Action extends Info {
	public Action() {
		nameSetting();
		abilityname();
		valuesetting();
		greeting();
	}
	
	public void nameSetting() {
		Scanner scanner = new Scanner(System.in);
		setName(scanner.nextLine());
		scanner.close();
	}
	
	public void abilityname() {
		String[] ability = {"HP", "MP", "攻撃力", "素早さ", "防御力"};
		setAbility(ability);
	}
	
	public void valuesetting() {
		Random r = new Random();
		int[] value = new int[getAbility().length];
		for(int i = 0; i < getAbility().length; i++) {
			value[i] = r.nextInt(999);
		}
		setValue(value);
	}
	
	public void greeting() {
		System.out.println("こんにちは「" + getName() + "」さん");
		System.out.println("ステータス");
		for(int i = 0; i < getAbility().length; i++) {
			System.out.println(getAbility()[i] + " : " + getValue()[i]);
		}
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}
	
	public static void main(String[] args) {
		Action act = new Action();
	}
}
