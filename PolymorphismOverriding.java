package Oops;

public class PolymorphismOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding2 obj=new Overriding2();
		obj.show();
	}

}

class Overriding1{
	public void show() {
		System.out.println("hai");
	}
}
class Overriding2 extends Overriding1{
	public void show() {
		System.out.println("hello");
	}
}