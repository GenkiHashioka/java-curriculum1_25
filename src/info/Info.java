package info;

public class Info {
	private String name;
	private String[] ability;
	private int[] value;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAbility(String[] ability) {
		this.ability = ability;
	}
	
	public void setValue(int[] value) {
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String[] getAbility() {
		return this.ability;
	}
	
	public int[] getValue() {
		return this.value;
	}
}
