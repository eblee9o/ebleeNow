package javaStudy;
/*�θ�Ŭ���� : Person
 * �ڽ�Ŭ���� : Villain, Hero*/
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
	
	//Method - Ŭ���� �ۿ��� �� ���� �߰��� ���޹޾Ƽ� ��ü�� ��������(�־���)
	public void setName(String name) {this.name = name;	}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
		
	public void setHeigth(int heigth) {this.heigth = heigth;}
	public int getHeigth() {return heigth;}
	
	public void setWeigth(int weight) {this.weight = weight;}
	public int getWeigth() {return weight;}
	
	public void move() {
		System.out.println("�̵��� >>>> ");
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
		//�θ�Ŭ����, �ڽ�Ŭ�������� ���� ���� ��� ���޹޾ƾ���.
		//String name, int age, int heigth, int weight : �θ�Ŭ������ ����ʵ�
		//String unique_key, int weapon, double power : �ڽ�Ŭ������ ����ʵ�
		
		super(name, age, heigth, weight); //����� ����� ������ �θ�Ŭ������ �ִ� ����(����ʵ�)���� super�� ȣ��, ����
		this.unique_key = unique_key;//�������� this�� ����
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
		
		//��ü����
		//String name, int age, int heigth, int weight, String unique_key, int weapon, double power
		Villain2 v2 = new Villain2("����", 20, 180, 80, "15001231", 1, 99.5);
		v2.printPerson();
		
		
		

	}//main

}//class
