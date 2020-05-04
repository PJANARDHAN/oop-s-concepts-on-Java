package com.Abstraction;

//abstract class
abstract class Usecar {
	int regno;
	
	Usecar(int r){
		regno=r;
	}
	
	void fueltank(String fuel) {
		System.out.println("fuel tank car");
	}
	
	
	//abstract method
	abstract void steering(int angle,int direction);
	
	//abstract method
	abstract void breaking(int force);
}


class maruticar extends Usecar {

	maruticar(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	} 
	void steering(int angle,int direction) {
		System.out.println("ordinary steering car");
	}
	void breaking(int force) {
		System.out.println("hydrolic break car");
	}
}


class swift extends Usecar{

	swift(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	void steering(int angle,int direction) {
		System.out.println("power steering car");
	}
	void breaking(int force) {
		System.out.println("gas break car");
	}
}

public class AbstractionCar{
	public static void main(String[] args) {
		//for abstract class object creation is not allowed
		maruticar car1=new maruticar(10);
		swift car2=new swift(20);
		Usecar ref; //create reference for super class
		//to use maruticar
		ref=car1;
		//to use swift car
		ref=car2;
		ref.fueltank("diesel");
		ref.steering(80, 190);
		ref.breaking(60);
	}
}
