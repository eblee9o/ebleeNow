package javaStudy4;
/* �߻� Ŭ����
 * 
 * 
 * */
abstract class Animal{
	//��ü���� ������ �ۼ����� �ʰ� �������� Ư¡�� �߻������� ���� -> ���ϰ������� ���� �޼���� ����
	abstract void cry();
}
class Animal2{
	void fly() {
		System.out.println("fly >>> ");
	}
}
class Dog extends Animal{
	void cry() {System.out.println("�۸� ~~");}
}
class Cat extends Animal{
	void cry() {System.out.println("�߿˾߿� ~~");}
}
public class Oop_AbstractClass001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�߻�Ŭ������ ��ü���� ������ ���� ������ ��ü�� ������ �� ����.
		//Animal dog = new Animal();
		Animal2 dragonfly = new Animal2();
		dragonfly.fly();
		
		//�߻� ũ���� ����� ? >> ��ӹ޾Ƽ� ���
		Dog dog = new Dog();
		dog.cry();
		
		Cat cat = new Cat();
		cat.cry();
		
		
	}//main

}//class
