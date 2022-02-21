package javaStudy;

class FarmMachine2{
	
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
public class OopExam002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성 : 위치값 만들기
		FarmMachine2 fm = new FarmMachine2();
		System.out.println(" 객체 주소 >> " + fm);
		
		//생성된 객체에 속성 값 입력하기
		fm.price = 1000000000;
		fm.year = 2;
		fm.color = "red";
		
		//속성값 출력하기
		String fm_price = String.format("%,d", 1000000000); //천단위로 끊어서 출력
	
		System.out.println(fm_price);
		System.out.println(fm.price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		//동작수행하기
		fm.move();
		fm.dig();
		fm.grind();

	}//main


}//class
