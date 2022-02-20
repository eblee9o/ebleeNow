package javaStudy;
/*부모클래스 : Person
 * 자식클래스 : Villain, Hero*/
class Person2{
	
	//field
	String name;
	int age;
	int heigth;
	int weight;
	
	//Constructor
	Person2(){}
	Person2(String name, int age, int heigth, int weight){
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.weight = weight;
		
	}
	
	//Method - 클래스 밖에서 준 값을 중간에 전달받아서 객체에 세팅해중(넣어줌)
	public void setName(String name) {this.name = name;	}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
		
	public void setHeigth(int heigth) {this.heigth = heigth;}
	public int getHeigth() {return heigth;}
	
	public void setWeigth(int weight) {this.weight = weight;}
	public int getWeigth() {return weight;}
	
	public void move() {
		System.out.println("이동중 >>>> ");
	}
}//Person


class Villain2 extends Person2{
	
	//field
	String unique_key;
	int weapon;
	double power;
	
	//constructor
	Villain2(){}
	Villain2(String name, int age, int heigth, int weight, String unique_key, int weapon, double power){
		//부모클래스, 자식클래스에서 만든 인자 모두 전달받아야함.
		//String name, int age, int heigth, int weight : 부모클래스의 멤버필드
		//String unique_key, int weapon, double power : 자식클래스의 멤버필드
		
		super(name, age, heigth, weight); //상속의 관계ㅔ 있을때 부모클래스에 있는 인자(멤버필드)들은 super로 호출, 세팅
		this.unique_key = unique_key;//나머지는 this로 세팅
		this.weapon = weapon;
		this.power = power;
		
	}//Villain2
	
	//method
	public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
	public String getUnique_key() {return unique_key;}
	
	public void setWeapon(int weapon) {this.weapon = weapon;}
	public int getWeapon() {return weapon;}
	
	public void setPower(double power) {this.power = power;}
	public double getPower() {return power;}
	
	public void printPerson() {
		System.out.println("-------------------------------------------------");
		System.out.println("printPerson getName 		>>> " + getName());
		System.out.println("printPerson getAge 		>>> " + getAge());
		System.out.println("printPerson getHeigth 		>>> " + getHeigth());
		System.out.println("printPerson getWeigth 		>>> " + getWeigth());
		System.out.println("printPerson getUnique_key 	>>> " + getUnique_key());
		System.out.println("printPerson getWeapon 		>>> " + getWeapon());
		System.out.println("printPerson getPower 		>>> " + getPower());
		System.out.println("-------------------------------------------------");
		
	}//printPerson


	
}//Villain2
class Hero2 extends Person2{}

public class OopInheritance_002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		//String name, int age, int heigth, int weight, String unique_key, int weapon, double power
		Villain2 v2 = new Villain2("좀비", 20, 180, 80, "15001231", 1, 99.5);
		v2.printPerson();
		
		
		

	}//main

}//class
