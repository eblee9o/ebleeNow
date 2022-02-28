package javaStudy4;

/*다형성을 사용하면 배열이나 매개변수 활용에서의 장점 설명
 * */

class PersonP{}
class Batman extends PersonP{}
class Human{}
class Superman extends Human{}

public class Oop_polymorphism006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 배열에서 다형성을 사용할 수 없다면
		//배열 -> 동일한 타입의 데이터를 하나로 묶어서 과니하는 자료구조 -> 다형성이 없다면 각 객체별로 관리 해야한다.
		PersonP[] persons = new PersonP[10];
		persons[0] = new PersonP();
		persons[1] = new PersonP();
		
		Batman[] batman = new Batman[10];
		batman[0] = new Batman();
		batman[1] = new Batman();
		
		//배열에서 다형성을 사용할수 있다면 >>
		Human[] humans = new Human[10];
		humans[0] = new Human();
		humans[1] = new Superman();
		
		
	}//main

}//class
