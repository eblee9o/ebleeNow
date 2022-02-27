package javaStudy4;
/*자식 크래스로 생성하는 객체를 부모의 타입으로 받아서 객체를 생성하면 사용범위가 어떻게 되는지 말해보시오
 * 다형성의 관계에서 부모, 자식 클래스 자원을 어떻게 쓸 수 있는지를 묻는 문제!
 * */
class PPerson1{
	String str1 = "난 부모클래스";
	void method1() {System.out.println("aaaaa");}
	void ppp() {System.out.println("ppp");}
}
class SStudent1 extends PPerson1{
	String str2 = "난 자식클래스";
	void method1() {System.out.println("ㅠㅠㅠㅠ");}
	void sss() {System.out.println("sss");}
}
public class Oop_polymorphism002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 객체생성 : 부모+자식클래스의 모든 자원으 쓸 수 있다.
		System.out.println("----------SStudent1 s1 = new SStudent1()----------");
		SStudent1 s1 = new SStudent1();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		s1.sss();
		s1.ppp();
		//자식클래스에서 오버라이딩된 부모 클래스의 원본 메소드를 호출하고 싶다면??
		
		
		
		//2. 객체생성 -> 부모타입으로 생성 : 부모의 자원만을 쓸 수 있다. (?)
		System.out.println("----------PPerson1 s2 = new SStudent1();----------");
		PPerson1 s2 = new SStudent1(); //하위(자식)클래스로 객체를 만들면서 타입은 상위(부모) 타입을 쓰는 것이 가능
		System.out.println(s2.str1);
//		System.out.println(s2.str2);//err >>부모클래스의 자원만 사용 가능
		s2.ppp();
//		s2.sss();//ERR
		s2.method1();//오버라이딩 -BBB -> 오버라이딩 한 것은 자식의 메서드로 실행

		//자식클래스에서 오버라이딩된 부모클래스의 원본 메서드를 호출하고 싶다면?
		
		
		
		//3. 객체생성 -> 
		System.out.println("----------PPerson1 p1 = new PPerson1();----------");
		PPerson1 p1 = new PPerson1();
		p1.method1();
//		p1.sss();
		
		
		

		
		//4. 객체생성 -> 상위(부모)클래스로 객체를 생성하면서 타입은 하위(자식)을 쓰는 경우 ->> 에러
//		SStudent s2 = new PPerson(); //오류!!
		
		

	}//main

}//class
