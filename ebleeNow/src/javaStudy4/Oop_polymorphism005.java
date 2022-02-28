package javaStudy4;


abstract class Car1{
	abstract void run();
}
class Ambulance1 extends Car1{
	void run() {System.out.println("앰블런스 지나가요~ 삐뽀삐뽀~~");}
}
class Cultivate1 extends Car1{
	void run() {System.out.println("경운기 지나가요~  덜컹덜컹~~");}
}
class SportsCar1 extends Car1{
	void run() {System.out.println("스포츠카 지나가요~ 씽~~");}
}


public class Oop_polymorphism005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
//		Car1 c1 = new Ambulance1();
//		Car1 c2 = new Cultivate1();
//		Car1 c3 = new SportsCar1();
		
		//run()메서드 호출
//		c1.run();
//		c2.run();
//		c3.run();

		//배열길이가 3인 car객체배열 생성
		Car1[] cars = new Car1[]{new Ambulance1(), new Cultivate1(), new SportsCar1()};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		
		//아니면 이렇게 한줄로 >>> 
		Car1[] carz = {new Ambulance1(), new Cultivate1(), new SportsCar1()};
		
		//반복문 돌리기
		for(int i = 0; i <carz.length; i++) {
			cars[i].run();
		}
		
		//향상된 for문
		System.out.println("------------------------------");
		for(Car1 obj : cars) {
			obj.run();
			System.out.println(obj);
		}
		
	}//main

}//class
