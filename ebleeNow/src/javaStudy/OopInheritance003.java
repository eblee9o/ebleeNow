package javaStudy;
/* 오버라이딩
 * 오버로딩
 * */
/*getter, setter
 * 
 * */

class Person2{
	//Field
	private String name;
	private int age;
	private int height;
	private int weight;
	
	//constructor
	Person2(){}
	Person2(String n, int a, int h, int w){
		this.name = n;
		this.age = a;
		this.height = h;
		this.weight = w;
	}
	
	//method
	
	public void setName(String Name) {this.name = name;}
	public String getName() {return name;}

	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
	
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public void setWeight(int weight) {this.weight = weight;}
	public int getWeight() {return weight;}
	
	public void move() {
		System.out.println("이동중 >>> ");
	}
	
}//Person2

class Villain2 extends Person {
	
	//field
	private String unique_key;
	private int weapon;
	private double power;
	
	//Constructor
	
	
	//method
	public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
	public String getUnique_key() {return unique_key;}
	
	public void setWeapon(int weapon) {this.weapon = weapon;}
	public int getWeapon() {return weapon;}

	public void setPower(double power) {this.power = power;}
	public double getPower() {return power;}
	
	
	
	
	
	
}//Villain2

class Hero2 extends Person{
	
	
}//Hero2

public class OopInheritance003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2();
//		p1.name = "홍길동"; ->> private
		p1.setName("aala");
		System.out.println(p1.getName());
		

	}//main

}//class
