package practice;

public class ForHashMapPojo {
	
	
	int key;
	String val;
	
	
	public ForHashMapPojo(int key,String val) {
		super();
		
		this.key = key;
		this.val = val;
	}
	
	public ForHashMapPojo(int key) {
		super();
		this.key = key;
	}
	
	

	public ForHashMapPojo(String val) {
		//super();
		this.val = val;
	}
	
	
	
	public ForHashMapPojo() {
		super();
	}

	private String getVal() {
		return val;
	}
	private void setVal(String val) {
		this.val = val;
	}
	private int getKey() {
		return key;
	}
	private void setKey(int key) {
		this.key = key;
	}
	
	@Override
	public String toString() {
		return "ForHashMapPojo [key=" + key + ", val=" + val + "]";
	}
	
	
	

}
