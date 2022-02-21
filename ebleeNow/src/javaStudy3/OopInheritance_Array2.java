package javaStudy;
/*부모클래스 : Person
 * 자식클래스 : Villain, Hero*/
class Person4{
	
	//field
	String name;
	int age;

	
	//Constructor
	Person4(){}
	Person4(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	//Method - 클래스 밖에서 준 값을 중간에 전달받아서 객체에 세팅해중(넣어줌)
	public void setName(String name) {this.name = name;	}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
		
}//Person


class Villain4 extends Person3{}
class Hero4 extends Person3{}

public class OopInheritance_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		//Person 타입의 객체 배열 변수 pa4선언
		//Person4 객체의 참조값을 원소로 가지는 배열 공간을 5개 생성 --> 5명 객체 생성할테니 주소 저장해라
		Person4[] pa4 = new Person4[5];
		
		//반복문을 돌면서 Person4()객체 생성
		for(int i = 0; i<pa4.length; i++) {
//			pa4[0] = new Person4("홍길동", 20);
			pa4[i] = new Person4(i+"번 후보자", i+20);
			
			//출력
//			System.out.println(pa4[i].getName());
//			System.out.println(pa4[i].name+"의 나이는 "+pa4[i].age+"살 입니다.");
			System.out.printf("%s의 나이는 %d살 입니다. %n",pa4[i].name,pa4[i].age);
		}//for
		
	
	}//main

}//class
