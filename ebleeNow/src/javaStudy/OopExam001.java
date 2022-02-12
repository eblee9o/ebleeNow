package javaStudy;
/*Class
 * 클래스란 객체(도는 인스턴스)를 생성하는 하나의 공장(=틀, 프레임, 템플릿, 판형 등등)이다.
 * 시골 허허벌판에 농기계를 만들어내는 공장(Class)이 들어섰고, 농부들이 주문을 넣으면 농기계가 만들어져 나온다 ->> 그게바로 "객체"~!
 * 농기계 공장을 하나의 예로 들었을 뿐 얼마든지 내가 만들고자 하는 것을 클래스로 만들어낼 수 있다.
 * 자동차 클래스(공장), 동물 클래스(공장), AI 로봇 클래스(공장) 등 모두 만들 수 있다리
 * */
/*클래스 공장을 통해서 객체를 어떻게 만들어내지?
 * 1. 특징
 * 2. 동작
 * 클래스는 이러한 만들고자 하는 객제의 특징과 동작에 많은 시간을 들이고 집중하면서 설계를 하게된다.
 * */
/* 객체의 특징 : 속성(attribute)
 * 객체의 동작 : 메서드(Method) - 함수와 거의 동일
 * */	
/*클래스는 왜 나왔을까?
 * 프로그램의 규모가 커지고 여러사ㅏㅁ이 협업을 하는 과정에서 좀더 체계적이고 분업화된 시스템으로 개바하고 확장해나갈 필요성이 있다.
 * 그런 일련의 과정에서 OOP(객체 지향 프로그래밍)가 만드어지고 발전해와ㅏㅆ다.
 * 거의 모든 프로그래밍 언어에서 OOP문법을 지원하고 있고, 하나의 언어로 OOP 문법으 공부하면 다른 언어에서도 거의 동일하다.
 * 즉 자바 언어로 OOP를 배운 사람은 python, php를 공부할때도 OOP를 구현하는 방법만 공부하면 응용이 가능하다. 
 * */

class FarmMachine{
	
	//1. 속성(특징)
	int price; 		//가격
	int year; 		//연식
	String color; 	//색상
	
	//2. 동작/기능/행동(Method) --> 농기계마다 동작이 다양하 것이므ㅗ 처음에는 공통적인 동작을 생각해본다.
	void move() {
		System.out.println(" move >>> ");
		
	}
	void dig() {
		System.out.println(" dig >>> ");
		
	}
	void grind() {
		System.out.println(" grind >>> ");
		
	}
	
	
	
}//FarmMachine
public class OopExam001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성 : 위치값 만들기
		FarmMachine fm = new FarmMachine();
		System.out.println(" 객체 주소 >> " + fm);
		
		//생성된 객체에 속성 값 입력하기
		fm.price = 100000;
		fm.year = 2;
		fm.color = "red";
		
		System.out.println(fm.price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		//동작수행하기
		fm.move();
		fm.dig();
		fm.grind();

	}//main

}//class
