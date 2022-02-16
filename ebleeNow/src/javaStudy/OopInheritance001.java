package javaStudy;
/*상속(inheritance)
 * 부모클래스가 가지고 있는 속성(변수)들과 동작/기능(메서드)들을 그래도 물려받아 새로운 클래스를 만드는 것.
 * 상속을 화룡ㅇ하면 무려받은 것들은 그래도 쓰면 되고, 거기에 덧붙여 새로운 것만 만들면 되므로 그만큼 노력과 시간이 절약됨.
 * 물려받게되는 원본클래스를 부모 클래스(parent Class/super class)
 * 상속을 받아 새롭게 만들어진 클래스는 자식 클래스(child class), 서브/하위클래스라고 한다.
 * 기초/기반클래스-파생클래스
 */
/*상속의 장점
 * 재활용성 : 완전히 새로운 것을 만드는 것이 아니라 기존 부모로부터 상속을 받아 필요한 것만 추가로 더해서 만드는 것.
 * 부모 클래스에 정의되어져 있는 멤버필드(변수)나 메서드들을 그대로 상속받아 사용하면 된다.
 * 상속받은 메서드라해도 필요에 따라서 자식 클래스에서 용도를 변경해서 사용하는 것도 가능하다.
 * */
/*상속의 사용
 * 기존 부모클래스를 확장한다는 개념 -> extends 키워드 사용
 * 부모 클래스의 멤버필드, 메서드는 상속이 가능하나 생성자는 상속되지 않는다.
 * 부모클래스의 접근제한자가 private인 경우에는 자식클래스가 상속 받았다고 해도 접근이 불가능하다.
 * */
/* 오버로딩 : 
 * 오버라이딩 : 새로운 용도로 재정의하여 변경하여 사용
*/
class Person{
	//field
	int gender;
	int power;
	
	//constructor
	Person(){
		this.gender = 1;
		this.power = 100;
	}
	
	//method
	void walk() {
		System.out.println("걸어가고잇어요~");
	}//walk
	
}//person
class Hero extends Person{
	//field
	String name;
	int age;
	
	//constructor
	Hero(){}
	Hero(String n, int a){
		this.name = n;
		this.age = a;
	}
	
	//method : 부모클래스에서 상송받은 메소드를 변경하여 사용할 수 있다.(오버라이드)
	void walk() {
		System.out.println("2배로빨리 걸어가고잇어요~");
	}
	void eat() {
		System.out.println("밥먹고잇어요~");
	}
	void displayPerson() {
		System.out.println("name : " + name + ", age : " + age+", gender" + gender+", power" + power);
	}
}//hero
class Vilain{}

public class OopInheritance001 {
	
	public static void main(String[] args) {
		
		//1. 객체생성
		Person p1 = new Person();
		p1.walk();
//		p1.eat();
		
		//2. 상속을 통한 객체 생성
		Hero h1 = new Hero("a", 20);
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.gender);//부모클래스변수
		System.out.println(h1.power);//부모클래스변수
		
	}//main

}//class
