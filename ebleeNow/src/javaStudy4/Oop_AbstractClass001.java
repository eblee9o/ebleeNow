package javaStudy4;
/* 추상 클래스
 * 
 * 
 * */
abstract class Animal{
	//구체적인 내용은 작성하지 않고 공통적인 특징을 추상적으로 선언 -> 리턴값조차도 없이 메서드명만 선언
	abstract void cry();
}
class Animal2{
	void fly() {
		System.out.println("fly >>> ");
	}
}
class Dog extends Animal{
	void cry() {System.out.println("멍멍 ~~");}
}
class Cat extends Animal{
	void cry() {System.out.println("야옹야옹 ~~");}
}
public class Oop_AbstractClass001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//추상클래스는 구체적인 내용이 없기 때문에 객체를 생성할 수 없다.
		//Animal dog = new Animal();
		Animal2 dragonfly = new Animal2();
		dragonfly.fly();
		
		//추상 크래스 사용은 ? >> 상속받아서 사용
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
		
		
	}//main

}//class
