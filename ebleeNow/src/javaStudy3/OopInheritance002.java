package javaStudy;
/* 오버라이딩
 * 오버로딩
 * */
/*getter, setter
 * 
 * */

class Person1{
	//Field
	private String name;
	private int age;
	private int height;
	private int weight;
	
	//constructor
	
	
	//method
	
	public void setName(String Name) {this.name = name;}
	public String getName() {return name;}

	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
	
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public void setWeight(int weight) {this.weight = weight;}
	public int getWeight() {return weight;}
	
}//Person1
class Villain1 extends Person {}
class Hero1 extends Person{}

public class OopInheritance002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1();
//		p1.name = "홍길동"; ->> private
		p1.setName("aala");
		System.out.println(p1.getName());
		

	}//main

}//class
