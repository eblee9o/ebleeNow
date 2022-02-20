package javaStudy;
/*부모클래스 : Person
 * 자식클래스 : Villain, Hero*/
class Person{
	
	//field
	String name;
	int age;
	int heigth;
	int weight;
	
	//Constructor
	
	//Method - 클래스 밖에서 준 값을 중간에 전달받아서 객체에 세팅해중(넣어줌)
	public void setName(String name) {this.name = name;	}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
		
	public void setHeigth(int heigth) {this.heigth = heigth;}
	public int getHeigth() {return heigth;}
	
	public void setWeigth(int weight) {this.weight = weight;}
	public int getWeigth() {return weight;}
	
}//Person


class Villain extends Person{}
class Hero extends Person{}

public class OopInheritance_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		Person p1 = new Person();
		p1.name = "asas";
		System.out.println(p1.getName());

	}//main

}//class
