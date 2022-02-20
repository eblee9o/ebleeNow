package javaStudy;
/*부모클래스 : Person
 * 자식클래스 : Villain, Hero*/
class Person3{
	
	//field
	String name;
	int age;

	
	//Constructor
	Person3(){}
	Person3(String name, int age){
		this.name = name;
		this.age = age;
		
		
	}
	
	//Method - 클래스 밖에서 준 값을 중간에 전달받아서 객체에 세팅해중(넣어줌)
	public void setName(String name) {this.name = name;	}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
		
}//Person


class Villain3 extends Person3{
	

	//method

		
	//printPerson

	//getWeaponName()
	
	
}//Villain2
class Hero3 extends Person3{}

public class OopInheritance_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		int[] ar = {1,2,3,4,5};
		char[] ch = {'A','B','C','D','E'};
		
		Person3[] pa3 = new Person3[5];
		pa3[0] = new Person3("홍길동",50);
		pa3[1] = new Person3("박길동",20);
		pa3[2] = new Person3("최무진",53);
		pa3[3] = new Person3("이무시",33);
		pa3[4] = new Person3("이선재",55);
		
		//출력
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i] + "");
		}
		System.out.println();
		
		for(int i = 0; i<pa3.length; i++) {
//			System.out.printf(pa3[i].name + "\t\t");
			System.out.print(pa3[i].getName() + "\t\t");
		}
		System.out.println();

	}//main

}//class
