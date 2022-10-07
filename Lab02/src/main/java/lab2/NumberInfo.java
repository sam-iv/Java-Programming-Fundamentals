package lab2;

public class NumberInfo {
	
	private int limit, value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public NumberInfo(int limit) {
		super();
		this.value = 0;
		this.limit = limit;
	}
	
	public void increment() {
		this.value++;
		this.value = (this.value) % this.limit; 
	}
}
