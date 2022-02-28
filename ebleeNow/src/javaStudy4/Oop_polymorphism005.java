package javaStudy4;


abstract class Car1{
	abstract void run();
}
class Ambulance1 extends Car1{
	void run() {System.out.println("�ں��� ��������~ �߻ǻ߻�~~");}
}
class Cultivate1 extends Car1{
	void run() {System.out.println("���� ��������~  ���ȴ���~~");}
}
class SportsCar1 extends Car1{
	void run() {System.out.println("������ī ��������~ ��~~");}
}


public class Oop_polymorphism005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü����
//		Car1 c1 = new Ambulance1();
//		Car1 c2 = new Cultivate1();
//		Car1 c3 = new SportsCar1();
		
		//run()�޼��� ȣ��
//		c1.run();
//		c2.run();
//		c3.run();

		//�迭���̰� 3�� car��ü�迭 ����
		Car1[] cars = new Car1[]{new Ambulance1(), new Cultivate1(), new SportsCar1()};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		
		//�ƴϸ� �̷��� ���ٷ� >>> 
		Car1[] carz = {new Ambulance1(), new Cultivate1(), new SportsCar1()};
		
		//�ݺ��� ������
		for(int i = 0; i <carz.length; i++) {
			cars[i].run();
		}
		
		//���� for��
		System.out.println("------------------------------");
		for(Car1 obj : cars) {
			obj.run();
			System.out.println(obj);
		}
		
	}//main

}//class
