package javaStudy;

/* 오버라이딩
 * 오버로딩
 * */
/*getter, setter
 * 
 * */

class PPerson2{
	//Field
	private String name;
	private int age;
	private int height;
	private int weight;
	
	//constructor
	PPerson2(){}
	PPerson2(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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
	
	//printPerson(){}
	public void printPerson() {
		System.out.println("악당 이름 >>> " + getName());
		System.out.println("악당 나이 >>> " + getAge());
		System.out.println("악당   키 >>> " + getHeight());
		System.out.println("악당 체중 >>> " + getWeight());
	}
	
}//Person2

class VVillain2 extends PPerson2 {
	
	//field
	private String unique_key;
	private int weapon;
	private double power;
	
	//Constructor
	VVillain2(){}
	VVillain2(String name, int age, int height, int weight, String unique_key, int weapon, int power){
		//String name, int age, int height, int weapon : 부모클래스의 인자
		//String unique_key, int weapon, int power : 상속받은 자식클래스1의 인자
		//super();
//		super(name,  age,  height,  weapon);
		this.unique_key = unique_key;
		this.weapon = weapon;
		this.power = power;
		
	}
	
	
	//method
	public void setUnique_key(String unique_key) {this.unique_key = unique_key;}
	public String getUnique_key() {return unique_key;}
	
	public void setWeapon(int weapon) {this.weapon = weapon;}
	public int getWeapon() {return weapon;}

	public void setPower(double power) {this.power = power;}
	public double getPower() {return power;}
	
	

	
	
	
	
}//Villain2

class HHero2 extends PPerson{
	
	
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
