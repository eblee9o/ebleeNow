package javaStudy4;
/*다형성
 * 
 * 다형성이란 다양한 형태 또는 특성으 가진다는 의미
 * 자바와 같은 객체지향언어에서의 의미는 부모 클래스를 상속받은 자식클래스의 인스턴스가 부모의 객체로도 사용되고, 
 * 자식클래스의 객체로도 사용될 수 있는 다양한 상황을 의미한다.
 * 
 * 하위크래스의 인스턴스(객체)는 보다 위인 상위클래스의 인스턴스(객체)로도 사용될 수 있다.
 * 반대는 안된다리
 *  >>하위클래스 = 상위클래스 / 상위클래스 = 하위클래스
 *  즉 Student = Person
 *    Person =/= Student 
 *  
 * */

class PPerson{}
class SStudent extends PPerson{}
public class Oop_polymorphism001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 객체생성
		SStudent s1 = new SStudent();
		
		//2. 객체생성 -> 부모타입으로 생성
		PPerson s2 = new SStudent(); //하위(자식)클래스로 객체를 만들면서 타입은 상위(부모) 타입을 쓰는 것이 가능
		
		//3. 객체생성 -> 
		PPerson p1 = new PPerson();
		
		//4. 객체생성 -> 상위(부모)클래스로 객체를 생성하면서 타입은 하위(자식)을 쓰는 경우 ->> 에러
//		SStudent s2 = new PPerson(); //오류!!
		
		
		
	}//main

}//class
