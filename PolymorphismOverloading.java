package Oops;
//polymorphism in method overloading
public class PolymorphismOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading obj= new Overloading();
		obj.show();
		obj.show(74);

	}

}

class Overloading{
	public void show() {
		System.out.println("hai");
	}
	
	public void show(int i) {
		int j=i;
		System.out.println("hello "+j);
	}
}
