package Oops;

public class Inheritance {
	public static void main(String[] args) {
		Z obj = new Z();
		obj.one();
		obj.two();
		obj.three();
		/*
		System.out.print("bonous is "+ obj.bonous);
		System.out.println("salary is " +obj.salary);
		System.out.println("tax is " +obj.tax);
		*/
	}
}

//if you want create this class separatly or otherwise write here only ,both are same.
class X {
	 public void one() {
	//int salary=4000;
	System.out.println("hai");
}
	 }
class Y extends X{
	public void two() {
	//int bonous=1000;
		System.out.println("hello");
	}
}
class Z extends Y{
	public void three() {
		//int tax=5000;
		System.out.println("thanks");
	}
	
}

