package Oops;

public class Encapsulation {

	public static void main(String[] args) {
		A  obj=new A();
		obj.setId(74);
		obj.setName("Janardhan");
		System.out.println(obj.getId());
		System.out.println(obj.getName());

	}

}

class A{
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}